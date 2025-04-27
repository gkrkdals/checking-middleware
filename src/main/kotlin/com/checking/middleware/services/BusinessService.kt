package com.checking.middleware.services

import com.checking.middleware.dto.business.CreateCollectionInformationDTO
import com.checking.middleware.dto.business.CreateOutInformationDTO
import com.checking.middleware.dto.business.DeleteCollectionInformationDTO
import com.checking.middleware.dto.business.DeleteOutInformationDTO
import com.checking.middleware.dto.material.CreateInDataDTO
import com.checking.middleware.dto.material.CreateOutsourcedInDTO
import com.checking.middleware.dto.material.CreateOutsourcedOutDTO
import com.checking.middleware.dto.material.CreateProdInDTO
import com.checking.middleware.dto.material.CreateProdOutDTO
import com.checking.middleware.dto.material.CreateStockAdjBasicDTO
import com.checking.middleware.dto.material.CreateStockAdjInDTO
import com.checking.middleware.dto.material.CreateStockAdjOutDTO
import com.checking.middleware.dto.material.DeleteInDTO
import com.checking.middleware.dto.material.DeleteOutsourcedInDTO
import com.checking.middleware.dto.material.DeleteOutsourcedOutDTO
import com.checking.middleware.dto.material.DeleteProdInDTO
import com.checking.middleware.dto.material.DeleteProdOutDTO
import com.checking.middleware.dto.material.DeleteStockAdjDTO
import com.checking.middleware.dto.response.*
import com.checking.middleware.enums.AllowedMethod
import com.checking.middleware.util.client
import org.springframework.http.ResponseEntity
import org.springframework.stereotype.Service

@Service
class BusinessService() {
    suspend fun createCollectionInformation(params: CreateCollectionInformationDTO): ResponseEntity<BaseResponseDTO> {
        val uri = "/apiproxy/api20A01I00601"
        return client(uri, AllowedMethod.POST, params)
    }

    suspend fun deleteCollectionInformation(params: DeleteCollectionInformationDTO): ResponseEntity<BaseResponseDTO> {
        val uri = "/apiproxy/api20A01D00601"
        return client(uri, AllowedMethod.POST, params)
    }

    suspend fun createOutInformation(params: CreateOutInformationDTO): ResponseEntity<BaseResponseDTO> {
        val uri = "/apiproxy/api20A01I00201"
        return client(uri, AllowedMethod.POST, params)
    }

    suspend fun deleteOutInformation(params: DeleteOutInformationDTO): ResponseEntity<BaseResponseDTO> {
        val uri = "/apiproxy/api20A01D00201"
        return client(uri, AllowedMethod.POST, params)
    }
}