package com.checking.middleware.util

import com.checking.middleware.dto.response.BaseResponseDTO
import com.checking.middleware.enums.AllowedMethod
import org.springframework.http.ResponseEntity
import org.springframework.web.reactive.function.client.WebClient
import org.springframework.web.reactive.function.client.awaitBody
import java.security.SecureRandom
import java.util.Base64
import javax.crypto.Mac
import javax.crypto.spec.SecretKeySpec

const val callerName = "API_gcmsAmaranth38728"
const val accessToken = "JTUsjmi5t1bSql9j6fTvrjNPAYMC3N"
const val hashKey = "13387775846281575639872204204271779602706412"
const val groupSeq = "gcmsAmaranth38728"
val webClient: WebClient = WebClient.builder().build()

fun getTimestamp() = System.currentTimeMillis()

fun hmac(value: String): String? =
    runCatching {
        Mac.getInstance("HmacSHA256").apply {
            init(SecretKeySpec(hashKey.toByteArray(Charsets.UTF_8), "HmacSHA256"))
            update(value.toByteArray(Charsets.UTF_8))
        }.doFinal(value.toByteArray(Charsets.UTF_8))
            .let { Base64.getEncoder().encodeToString(it) }
    }.getOrElse {
        println("AuthCallUnit.hmac-Error: $it")
        it.printStackTrace()
        null
    }

fun getTransactionId(): String {
    val chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789"
    val randomString = (1..32)
        .map { chars[SecureRandom().nextInt(chars.length)] }
        .joinToString("")

    return randomString
}

fun getWehagoSign(uri: String): String? = hmac(
    value = accessToken + getTransactionId() + getTimestamp() + uri
)

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
            it.set("callerName", callerName)
            it.set("transaction-id", transactionId)
            it.set("timestamp", timestamp.toString())
            it.set("Authorization", "Bearer $accessToken")
            it.set("wehago-sign", wehagoSign)
            it.set("groupSeq", groupSeq)
        }

    return when (method) {
        AllowedMethod.POST, AllowedMethod.PUT -> {
            request.bodyValue(body ?: "{}").retrieve().awaitBody()
        }
        else -> {
            request.retrieve().awaitBody()
        }
    }
}

suspend fun client(
    uri: String,
    method: AllowedMethod,
    body: Any? = null
): ResponseEntity<BaseResponseDTO> {
    return ResponseEntity.ok(webClientCall<BaseResponseDTO>(uri, method, body))
}