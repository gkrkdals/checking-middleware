package com.checking.middleware.controllers

import com.checking.middleware.dto.material.*
import com.checking.middleware.dto.response.BaseResponseDTO
import com.checking.middleware.services.MaterialService
import io.swagger.v3.oas.annotations.Operation
import io.swagger.v3.oas.annotations.tags.Tag
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController


@Tag(name = "구매자재관리", description = "구매자재관리 API 모음")
@RestController
@RequestMapping("/apiproxy")
class MaterialController(val materialService: MaterialService) {

    //----- 입고정보 -----//
    @Operation(
        summary = "01-입고정보 등록",
        description = "입고정보를 등록합니다."
    )
    @PostMapping("/api20A02I00201")
    suspend fun createInData(@RequestBody params: CreateInDataDTO): ResponseEntity<BaseResponseDTO> {
        return materialService.createInData(params)
    }

    @Operation(
        summary = "02-입고정보 삭제",
        description = "입고정보를 삭제합니다."
    )
    @PostMapping("/api20A02D00201")
    suspend fun deleteInData(@RequestBody params: DeleteInDTO): ResponseEntity<BaseResponseDTO> {
        return materialService.deleteInData(params)
    }
    //----- 입고정보 -----//

    //----- 생산입고 -----//
    @Operation(
        summary = "03-생산입고 등록",
        description = "생산입고 정보를 등록합니다."
    )
    @PostMapping("/api20A02I00701")
    suspend fun createProdIn(@RequestBody params: CreateProdInDTO): ResponseEntity<BaseResponseDTO> {
        return materialService.createProdIn(params)
    }

    @Operation(
        summary = "04-생산입고 삭제",
        description = "생산입고 정보를 삭제합니다."
    )
    @PostMapping("/api20A02D00701")
    suspend fun deleteProdIn(@RequestBody params: DeleteProdInDTO): ResponseEntity<BaseResponseDTO> {
        return materialService.deleteProdIn(params)
    }
    //----- 생산입고 -----//

    //----- 외주입고 -----//
    @Operation(
        summary = "05-외주입고 등록",
        description = "외주입고 정보를 등록합니다."
    )
    @PostMapping("/api20A02I02201")
    suspend fun createOutsourcedIn(@RequestBody params: CreateOutsourcedInDTO): ResponseEntity<BaseResponseDTO> {
        return materialService.createOutsourcedIn(params)
    }

    @Operation(
        summary = "06-외주입고 삭제",
        description = "외주입고 정보를 삭제합니다."
    )
    @PostMapping("/api20A02D02201")
    suspend fun deleteOutsourcedIn(@RequestBody params: DeleteOutsourcedInDTO): ResponseEntity<BaseResponseDTO> {
        return materialService.deleteOutsourcedIn(params)
    }
    //----- 외주입고 -----//

    //----- 생산출고 -----//
    @Operation(
        summary = "07-생산출고 등록",
        description = "생산출고 정보를 등록합니다."
    )
    @PostMapping("/api20A02I00801")
    suspend fun createProdOut(@RequestBody params: CreateProdOutDTO): ResponseEntity<BaseResponseDTO> {
        return materialService.createProdOut(params)
    }

    @Operation(
        summary = "08-생산출고 삭제",
        description = "생산출고 정보를 삭제합니다."
    )
    @PostMapping("/api20A02D00801")
    suspend fun deleteProdOut(@RequestBody params: DeleteProdOutDTO): ResponseEntity<BaseResponseDTO> {
        return materialService.deleteProdOut(params)
    }
    //----- 생산출고 -----//

    //----- 외주출고 -----//
    @Operation(
        summary = "09-외주출고 등록",
        description = "외주출고 정보를 등록합니다."
    )
    @PostMapping("/api20A02I01001")
    suspend fun createOutsourcedOut(@RequestBody params: CreateOutsourcedOutDTO): ResponseEntity<BaseResponseDTO> {
        return materialService.createOutsourcedOut(params)
    }

    @Operation(
        summary = "10-외주출고 삭제",
        description = "외주출고 정보를 삭제합니다."
    )
    @PostMapping("/api20A02D01001")
    suspend fun deleteOutsourcedOut(@RequestBody params: DeleteOutsourcedOutDTO): ResponseEntity<BaseResponseDTO> {
        return materialService.deleteOutsourcedOut(params)
    }
    //----- 외주출고 -----//

    //----- 재고조정 -----//
    @Operation(
        summary = "11-재고조정(기본) 등록",
        description = "재고조정 기본 정보를 등록합니다."
    )
    @PostMapping("/api20A02I01301")
    suspend fun createStockAdjBasic(@RequestBody params: CreateStockAdjBasicDTO): ResponseEntity<BaseResponseDTO> {
        return materialService.createStockAdjBasic(params)
    }

    @Operation(
        summary = "12-재고조정(입고) 등록",
        description = "재고조정 입고 정보를 등록합니다."
    )
    @PostMapping("/api20A02I01303")
    suspend fun createStockAdjIn(@RequestBody params: CreateStockAdjInDTO): ResponseEntity<BaseResponseDTO> {
        return materialService.createStockAdjIn(params)
    }

    @Operation(
        summary = "13-재고조정(출고) 등록",
        description = "재고조정 출고 정보를 등록합니다."
    )
    @PostMapping("/api20A02I01305")
    suspend fun createStockAdjOut(@RequestBody params: CreateStockAdjOutDTO): ResponseEntity<BaseResponseDTO> {
        return materialService.createStockAdjOut(params)
    }

    @Operation(
        summary = "14-재고조정 삭제",
        description = "재고조정 정보를 삭제합니다."
    )
    @PostMapping("/api20A02D01301")
    suspend fun deleteStockAdj(@RequestBody params: DeleteStockAdjDTO): ResponseEntity<BaseResponseDTO> {
        return materialService.deleteStockAdj(params)
    }
    //----- 재고조정 -----//
}