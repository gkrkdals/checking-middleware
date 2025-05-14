package com.checking.middleware.services

import com.checking.middleware.dto.material.*
import com.checking.middleware.dto.response.*
import com.checking.middleware.enums.AllowedMethod
import com.checking.middleware.util.client
import org.springframework.http.ResponseEntity
import org.springframework.stereotype.Service

@Service
class MaterialService {
    suspend fun createInData(params: CreateInDataDTO): ResponseEntity<Any> {
        val uri = "/apiproxy/api20A02I00201"
        return client(uri, AllowedMethod.POST, params)
    }

    suspend fun deleteInData(params: DeleteInDTO): ResponseEntity<Any> {
        val uri = "/apiproxy/api20A02D00201"
        return client(uri, AllowedMethod.POST, params)
    }

    suspend fun createProdIn(params: CreateProdInDTO): ResponseEntity<Any> {
        val uri = "/apiproxy/api20A02I00701"
        return client(uri, AllowedMethod.POST, params)
    }

    suspend fun deleteProdIn(params: DeleteProdInDTO): ResponseEntity<Any> {
        val uri = "/apiproxy/api20A02D00701"
        return client(uri, AllowedMethod.POST, params)
    }

    suspend fun createOutsourcedIn(params: CreateOutsourcedInDTO): ResponseEntity<Any> {
        val uri = "/apiproxy/api20A02I02201"
        return client(uri, AllowedMethod.POST, params)
    }

    suspend fun deleteOutsourcedIn(params: DeleteOutsourcedInDTO): ResponseEntity<Any> {
        val uri = "/apiproxy/api20A02D02201"
        return client(uri, AllowedMethod.POST, params)
    }

    suspend fun createProdOut(params: CreateProdOutDTO): ResponseEntity<Any> {
        val uri = "/apiproxy/api20A02I00801"
        return client(uri, AllowedMethod.POST, params)
    }

    suspend fun deleteProdOut(params: DeleteProdOutDTO): ResponseEntity<Any> {
        val uri = "/apiproxy/api20A02D00801"
        return client(uri, AllowedMethod.POST, params)
    }

    suspend fun createOutsourcedOut(params: CreateOutsourcedOutDTO): ResponseEntity<Any> {
        val uri = "/apiproxy/api20A02I01001"
        return client(uri, AllowedMethod.POST, params)
    }

    suspend fun deleteOutsourcedOut(params: DeleteOutsourcedOutDTO): ResponseEntity<Any> {
        val uri = "/apiproxy/api20A02D01001"
        return client(uri, AllowedMethod.POST, params)
    }

    suspend fun createStockAdjBasic(params: CreateStockAdjBasicDTO): ResponseEntity<Any> {
        val uri = "/apiproxy/api20A02I01301"
        return client(uri, AllowedMethod.POST, params)
    }

    suspend fun createStockAdjIn(params: CreateStockAdjInDTO): ResponseEntity<Any> {
        val uri = "/apiproxy/api20A02I01303"
        return client(uri, AllowedMethod.POST, params)
    }

    suspend fun createStockAdjOut(params: CreateStockAdjOutDTO): ResponseEntity<Any> {
        val uri = "/apiproxy/api20A02I01305"
        return client(uri, AllowedMethod.POST, params)
    }

    suspend fun deleteStockAdj(params: DeleteStockAdjDTO): ResponseEntity<Any> {
        val uri = "/apiproxy/api20A02D01301"
        return client(uri, AllowedMethod.POST, params)
    }
}