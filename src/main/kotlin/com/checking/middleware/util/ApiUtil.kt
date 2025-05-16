package com.checking.middleware.util

import com.checking.middleware.dto.response.BaseResponseDTO
import com.checking.middleware.dto.response.ErrorResponseDTO
import com.checking.middleware.enums.AllowedMethod
import com.checking.middleware.services.Hmac
import com.fasterxml.jackson.module.kotlin.jacksonObjectMapper
import jakarta.xml.bind.DatatypeConverter
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.reactive.function.client.WebClient
import org.springframework.web.reactive.function.client.WebClientResponseException
import org.springframework.web.reactive.function.client.awaitBody
import java.security.SecureRandom
import java.util.Base64
import javax.crypto.Mac
import javax.crypto.spec.SecretKeySpec

const val callerName = "API_gcmsAmaranth38728"
const val accessToken = "JTUsjmi5t1bSqI9j6fTvrjNPAYMC3N"
const val hashKey = "13387775846281575639872204204271779602706412"
const val groupSeq = "gcmsAmaranth38728"
val webClient: WebClient = WebClient.builder().build()

fun getTimestamp() = System.currentTimeMillis() / 1000

fun getTransactionId(): String {
    val chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789"
    val randomString = (1..32)
        .map { chars[SecureRandom().nextInt(chars.length)] }
        .joinToString("")

    return randomString
}

fun getWehagoSign(uri: String): String? = Hmac.hmac(hashKey, accessToken + getTransactionId() + getTimestamp() + uri)

suspend inline fun<reified T> webClientCall(uri: String, method: AllowedMethod, body: Any? = null): T {
    val timestamp = getTimestamp()
    val transactionId = getTransactionId()
    val wehagoSign = getWehagoSign(uri)

    val request = webClient.mutate()
        .baseUrl("https://dev.amaranth10.co.kr")
        .build()
        .method(method.method)
        .uri(uri)
        .headers {
            it.set("Content-Type", "application/json")
            it.set("callerName", callerName)
            it.set("transaction-id", transactionId)
            it.set("timestamp", timestamp.toString())
            it.set("Authorization", "Bearer $accessToken")
            it.set("wehago-sign", wehagoSign)
            it.set("groupSeq", groupSeq)
        }

    return try {
        when (method) {
            AllowedMethod.POST, AllowedMethod.PUT -> {
                request.bodyValue(body ?: "{}").retrieve().awaitBody()
            }
            else -> {
                request.retrieve().awaitBody()
            }
        }
    } catch (e: WebClientResponseException) {
        println("❌ WebClient 호출 중 HTTP 오류 발생:")
        println("Status code: ${e.statusCode}")
        println("Response body: ${e.responseBodyAsString}")
        throw e
    } catch (e: Exception) {
        println("❌ WebClient 호출 중 예외 발생:")
        println("URI: $uri")
        println("Method: ${method.method}")
        println("Body: $body")
        println("Exception: ${e::class.simpleName} - ${e.message}")
        e.printStackTrace()
        throw e  // 필요에 따라 다시 던짐
    }
}

suspend fun client(
    uri: String,
    method: AllowedMethod,
    body: Any? = null
): ResponseEntity<Any> {
    return try {
        ResponseEntity.ok(webClientCall<BaseResponseDTO>(uri, method, body))
    } catch (e: WebClientResponseException) {
        val objectMapper = jacksonObjectMapper()
        val errorDto = objectMapper.readValue(e.responseBodyAsString, ErrorResponseDTO::class.java)
        return ResponseEntity.status(e.statusCode).body(errorDto)
    } catch (e: Exception) {
        ResponseEntity
            .status(HttpStatus.INTERNAL_SERVER_ERROR)
            .body(e.message)
    }
}