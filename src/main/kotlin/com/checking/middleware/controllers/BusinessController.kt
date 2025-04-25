package com.checking.middleware.controllers

import com.checking.middleware.dto.*
import com.checking.middleware.dto.response.*
import com.checking.middleware.services.BusinessService
import io.swagger.v3.oas.annotations.Operation
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/apiproxy")
class BusinessController(private val businessService: BusinessService) {

    @Operation(
        summary = "수금정보 등록",
        description = "수금정보를 등록합니다."
    )
    @PostMapping("/api20A01I00601")
    suspend fun createCollectionInformation(@RequestBody params: CreateCollectionInformationDTO): BaseResponseDTO {
        return businessService.createCollectionInformation(params)
    }

    @Operation(
        summary = "수금정보 삭제",
        description = "수금정보를 삭제합니다."
    )
    @PostMapping("/api20A01D00601")
    suspend fun deleteCollectionInformation(@RequestBody params: DeleteCollectionInformationDTO): BaseResponseDTO {
        return businessService.deleteCollectionInformation(params)
    }

    @Operation(
        summary = "입고정보 등록",
        description = "입고정보를 등록합니다."
    )
    @PostMapping("/api20A02I00201")
    suspend fun createInData(@RequestBody params: CreateInDataDTO): BaseResponseDTO {
        return businessService.createInData(params)
    }

    @Operation(
        summary = "입고정보 삭제",
        description = "입고정보를 삭제합니다."
    )
    @PostMapping("/api20A02D00201")
    suspend fun deleteInData(@RequestBody params: DeleteInDTO): BaseResponseDTO {
        return businessService.deleteInData(params)
    }

    @Operation(
        summary = "생산입고 등록",
        description = "생산입고 정보를 등록합니다."
    )
    @PostMapping("/api20A02I00701")
    suspend fun createProdIn(@RequestBody params: CreateProdInDTO): BaseResponseDTO {
        return businessService.createProdIn(params)
    }

    @Operation(
        summary = "생산입고 삭제",
        description = "생산입고 정보를 삭제합니다."
    )
    @PostMapping("/api20A02D00701")
    suspend fun deleteProdIn(@RequestBody params: DeleteProdInDTO): BaseResponseDTO {
        return businessService.deleteProdIn(params)
    }

    @Operation(
        summary = "외주입고 등록",
        description = "외주입고 정보를 등록합니다."
    )
    @PostMapping("/api20A02I02201")
    suspend fun createOutsourcedIn(@RequestBody params: CreateOutsourcedInDTO): BaseResponseDTO {
        return businessService.createOutsourcedIn(params)
    }

    @Operation(
        summary = "외주입고 삭제",
        description = "외주입고 정보를 삭제합니다."
    )
    @PostMapping("/api20A02D02201")
    suspend fun deleteOutsourcedIn(@RequestBody params: DeleteOutsourcedInDTO): BaseResponseDTO {
        return businessService.deleteOutsourcedIn(params)
    }

    @Operation(
        summary = "생산출고 등록",
        description = "생산출고 정보를 등록합니다."
    )
    @PostMapping("/api20A02I00801")
    suspend fun createProdOut(@RequestBody params: CreateProdOutDTO): BaseResponseDTO {
        return businessService.createProdOut(params)
    }

    @Operation(
        summary = "생산출고 삭제",
        description = "생산출고 정보를 삭제합니다."
    )
    @PostMapping("/api20A02D00801")
    suspend fun deleteProdOut(@RequestBody params: DeleteProdOutDTO): BaseResponseDTO {
        return businessService.deleteProdOut(params)
    }

    @Operation(
        summary = "외주출고 등록",
        description = "외주출고 정보를 등록합니다."
    )
    @PostMapping("/api20A02I01001")
    suspend fun createOutsourcedOut(@RequestBody params: CreateOutsourcedOutDTO): BaseResponseDTO {
        return businessService.createOutsourcedOut(params)
    }

    @Operation(
        summary = "외주출고 삭제",
        description = "외주출고 정보를 삭제합니다."
    )
    @PostMapping("/api20A02D01001")
    suspend fun deleteOutsourcedOut(@RequestBody params: DeleteOutsourcedOutDTO): BaseResponseDTO {
        return businessService.deleteOutsourcedOut(params)
    }

    @Operation(
        summary = "재고조정(기본) 등록",
        description = "재고조정 기본 정보를 등록합니다."
    )
    @PostMapping("/api20A02I01301")
    suspend fun createStockAdjBasic(@RequestBody params: CreateStockAdjBasicDTO): BaseResponseDTO {
        return businessService.createStockAdjBasic(params)
    }

    @Operation(
        summary = "재고조정(입고) 등록",
        description = "재고조정 입고 정보를 등록합니다."
    )
    @PostMapping("/api20A02I01303")
    suspend fun createStockAdjIn(@RequestBody params: CreateStockAdjInDTO): BaseResponseDTO {
        return businessService.createStockAdjIn(params)
    }

    @Operation(
        summary = "재고조정(출고) 등록",
        description = "재고조정 출고 정보를 등록합니다."
    )
    @PostMapping("/apiproxy/api20A02I01305")
    suspend fun createStockAdjOut(@RequestBody params: CreateStockAdjOutDTO): BaseResponseDTO {
        return businessService.createStockAdjOut(params)
    }

    @Operation(
        summary = "재고조정 삭제",
        description = "재고조정 정보를 삭제합니다."
    )
    @PostMapping("/api20A02D01301")
    suspend fun deleteStockAdj(@RequestBody params: DeleteStockAdjDTO): BaseResponseDTO {
        return businessService.deleteStockAdj(params)
    }
}