package com.checking.middleware.services

import com.checking.middleware.dto.business.*
import com.checking.middleware.dto.response.*
import com.checking.middleware.enums.AllowedMethod
import com.checking.middleware.util.client
import org.springframework.http.ResponseEntity
import org.springframework.stereotype.Service

@Service
class BusinessService() {
    suspend fun createCollectionInformation(params: CreateCollectionInformationDTO): ResponseEntity<Any> {
        val uri = "/apiproxy/api20A01I00601"
        return Client.client(uri, AllowedMethod.POST, params)
    }

    suspend fun deleteCollectionInformation(params: DeleteCollectionInformationDTO): ResponseEntity<Any> {
        val uri = "/apiproxy/api20A01D00601"
        return Client.client(uri, AllowedMethod.POST, params)
    }

    suspend fun createOutInformation(params: CreateOutInformationDTO): ResponseEntity<Any> {
        val uri = "/apiproxy/api20A01I00201"
        return Client.client(uri, AllowedMethod.POST, params)
    }

    suspend fun deleteOutInformation(params: DeleteOutInformationDTO): ResponseEntity<Any> {
        val uri = "/apiproxy/api20A01D00201"
        return Client.client(uri, AllowedMethod.POST, params)
    }
}