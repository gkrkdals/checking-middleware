package com.checking.middleware.dto.material

import io.swagger.v3.oas.annotations.media.Schema
import java.math.BigDecimal

@Schema(description = "외주출고 입력 상세 DTO")
data class CreateOutsourcedOutDetail(

    @field:Schema(description = "출고순번", example = "1")
    val isuSq: Int,

    @field:Schema(description = "품번", example = "ITEM1234567890")
    val itemCd: String,

    @field:Schema(description = "관리수량", example = "100.000000")
    val poQt: BigDecimal,

    @field:Schema(description = "출고수량", example = "100.000000")
    val isuQt: BigDecimal,

    @field:Schema(description = "창고코드", example = "WH01")
    val whCd: String,

    @field:Schema(description = "장소코드", example = "LC01")
    val lcCd: String,

    @field:Schema(description = "LOT번호", example = "LOT20250428001")
    val lotNb: String?,

    @field:Schema(description = "프로젝트코드", example = "PJT20250428")
    val pjtCd: String?,

    @field:Schema(description = "발주번호", example = "PO2025042801")
    val poNb: String?,

    @field:Schema(description = "발주순번", example = "1")
    val poSq: Int?,

    @field:Schema(description = "순번(사급자재)", example = "1")
    val matlSq: Int?,

    @field:Schema(description = "모품번코드", example = "PARENTITEM123")
    val itemparentCd: String?,

    @field:Schema(description = "관리구분코드", example = "MGMT001")
    val mgmtCd: String?,

    @field:Schema(description = "비고", example = "상세 비고")
    val remarkDc: String?
)
