package com.checking.middleware.dto.material

import io.swagger.v3.oas.annotations.media.Schema
import java.math.BigDecimal

@Schema(description = "재고조정(기본) 상세 DTO")
data class CreateStockAdjBasicDetail(

    @field:Schema(description = "조정순번", example = "1")
    val adjustSq: Int,

    @field:Schema(description = "품번", example = "ITEM1234567890")
    val itemCd: String,

    @field:Schema(description = "기초수량", example = "100.000000")
    val openQt: BigDecimal?,

    @field:Schema(description = "입고수량", example = "10.000000")
    val rcvQt: BigDecimal?,

    @field:Schema(description = "출고수량", example = "5.000000")
    val isuQt: BigDecimal?,

    @field:Schema(description = "조정단가", example = "1.250000")
    val adjustUm: BigDecimal?,

    @field:Schema(description = "조정금액", example = "1250.0000")
    val adjustAm: BigDecimal?,

    @field:Schema(description = "LOT번호", example = "LOT20250428001")
    val lotNb: String?,

    @field:Schema(description = "재고실사번호", example = "INSP20250428")
    val inspNb: String?,

    @field:Schema(description = "비고", example = "조정 상세 비고")
    val remarkDc: String?,

    @field:Schema(description = "관리구분코드", example = "MGMT001")
    val mgmtCd: String?,

    @field:Schema(description = "프로젝트코드", example = "PJT20250428")
    val pjtCd: String?
)
