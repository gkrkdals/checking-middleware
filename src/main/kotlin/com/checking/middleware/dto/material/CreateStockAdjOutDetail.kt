package com.checking.middleware.dto.material

import io.swagger.v3.oas.annotations.media.Schema

@Schema(description = "재고조정(출고) 상세 DTO")
data class CreateStockAdjOutDetail(

    @field:Schema(description = "조정순번", example = "1")
    val adjustSq: Int,

    @field:Schema(description = "품번", example = "ITEM12345")
    val itemCd: String,

    @field:Schema(description = "출고수량", example = "100.000000")
    val isuQt: Double,

    @field:Schema(description = "기초수량", example = "0.000000")
    val openQt: Double?,

    @field:Schema(description = "입고수량", example = "0.000000")
    val rcvQt: Double?,

    @field:Schema(description = "조정단가", example = "10.000000")
    val adjustUm: Double?,

    @field:Schema(description = "조정금액", example = "1000.0000")
    val adjustAm: Double?,

    @field:Schema(description = "LOT번호", example = "LOT20250428")
    val lotNb: String?,

    @field:Schema(description = "재고실사번호", example = "INSP123456")
    val inspNb: String?,

    @field:Schema(description = "비고", example = "출고 상세 비고")
    val remarkDc: String?,

    @field:Schema(description = "관리구분코드", example = "MGMT01")
    val mgmtCd: String?,

    @field:Schema(description = "프로젝트코드", example = "PJT001")
    val pjtCd: String?
)
