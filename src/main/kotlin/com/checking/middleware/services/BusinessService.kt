package com.checking.middleware.services

import com.checking.middleware.dto.*
import com.checking.middleware.dto.response.*
import com.checking.middleware.enums.AllowedMethod
import com.checking.middleware.util.client
import org.springframework.stereotype.Service

@Service
class BusinessService() {
    suspend fun createCollectionInformation(params: CreateCollectionInformationDTO): BaseResponseDTO {
        val uri = "/apiproxy/api20A01I00601"
        return client(uri, AllowedMethod.POST, params)
    }

    suspend fun deleteCollectionInformation(params: DeleteCollectionInformationDTO): BaseResponseDTO {
        val uri = "/apiproxy/api20A01D00601"
        return client(uri, AllowedMethod.POST, params)
    }

    suspend fun createInData(params: CreateInDataDTO): BaseResponseDTO {
        val uri = "/apiproxy/api20A02I00201"
        return client(uri, AllowedMethod.POST, params)
    }

    suspend fun deleteInData(params: DeleteInDTO): BaseResponseDTO {
        val uri = "/apiproxy/api20A02D00201"
        return client(uri, AllowedMethod.POST, params)
    }

    suspend fun createProdIn(params: CreateProdInDTO): BaseResponseDTO {
        val uri = "/apiproxy/api20A02I00701"
        return client(uri, AllowedMethod.POST, params)
    }

    suspend fun deleteProdIn(params: DeleteProdInDTO): BaseResponseDTO {
        val uri = "/apiproxy/api20A02D00701"
        return client(uri, AllowedMethod.POST, params)
    }

    suspend fun createOutsourcedIn(params: CreateOutsourcedInDTO): BaseResponseDTO {
        val uri = "/apiproxy/api20A02I02201"
        return client(uri, AllowedMethod.POST, params)
    }

    suspend fun deleteOutsourcedIn(params: DeleteOutsourcedInDTO): BaseResponseDTO {
        val uri = "/apiproxy/api20A02D02201"
        return client(uri, AllowedMethod.POST, params)
    }

    suspend fun createProdOut(params: CreateProdOutDTO): BaseResponseDTO {
        val uri = "/apiproxy/api20A02I00801"
        return client(uri, AllowedMethod.POST, params)
    }

    suspend fun deleteProdOut(params: DeleteProdOutDTO): BaseResponseDTO {
        val uri = "/apiproxy/api20A02D00801"
        return client(uri, AllowedMethod.POST, params)
    }

    suspend fun createOutsourcedOut(params: CreateOutsourcedOutDTO): BaseResponseDTO {
        val uri = "/apiproxy/api20A02I01001"
        return client(uri, AllowedMethod.POST, params)
    }

    suspend fun deleteOutsourcedOut(params: DeleteOutsourcedOutDTO): BaseResponseDTO {
        val uri = "/apiproxy/api20A02D01001"
        return client(uri, AllowedMethod.POST, params)
    }

    suspend fun createStockAdjBasic(params: CreateStockAdjBasicDTO): BaseResponseDTO {
        val uri = "/apiproxy/api20A02I01301"
        return client(uri, AllowedMethod.POST, params)
    }

    suspend fun createStockAdjIn(params: CreateStockAdjInDTO): BaseResponseDTO {
        val uri = "/apiproxy/api20A02I01303"
        return client(uri, AllowedMethod.POST, params)
    }

    suspend fun createStockAdjOut(params: CreateStockAdjOutDTO): BaseResponseDTO {
        val uri = "/apiproxy/api20A02I01305"
        return client(uri, AllowedMethod.POST, params)
    }

    suspend fun deleteStockAdj(params: DeleteStockAdjDTO): BaseResponseDTO {
        val uri = "/apiproxy/api20A02D01301"
        return client(uri, AllowedMethod.POST, params)
    }
}