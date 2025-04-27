package com.checking.middleware.controllers

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
import com.checking.middleware.services.BusinessService
import io.swagger.v3.oas.annotations.Operation
import io.swagger.v3.oas.annotations.tags.Tag
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@Tag(name = "영업관리", description = "영업관리 API 모음")
@RestController
@RequestMapping("/apiproxy")
class BusinessController(private val businessService: BusinessService) {

    @Operation(
        summary = "01-수금정보 등록",
        description = "수금정보를 등록합니다."
    )
    @PostMapping("/api20A01I00601")
    suspend fun createCollectionInformation(@RequestBody params: CreateCollectionInformationDTO): ResponseEntity<BaseResponseDTO> {
        return businessService.createCollectionInformation(params)
    }

    @Operation(
        summary = "02-수금정보 삭제",
        description = "수금정보를 삭제합니다."
    )
    @PostMapping("/api20A01D00601")
    suspend fun deleteCollectionInformation(@RequestBody params: DeleteCollectionInformationDTO): ResponseEntity<BaseResponseDTO> {
        return businessService.deleteCollectionInformation(params)
    }

    @Operation(
        summary = "03-출고정보 등록",
        description = "출고정보를 등록합니다."
    )
    @PostMapping("/api20A01I00201")
    suspend fun createOutInformation(@RequestBody params: CreateOutInformationDTO): ResponseEntity<BaseResponseDTO> {
        return businessService.createOutInformation(params)
    }

    @Operation(
        summary = "04-출고정보 삭제",
        description = "출고정보를 삭제합니다."
    )
    @PostMapping("/api20A01D00201")
    suspend fun deleteOutInformation(@RequestBody params: DeleteOutInformationDTO): ResponseEntity<BaseResponseDTO> {
        return businessService.deleteOutInformation(params)
    }
}