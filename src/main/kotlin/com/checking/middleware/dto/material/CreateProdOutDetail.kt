package com.checking.middleware.dto.material

import io.swagger.v3.oas.annotations.media.Schema
import java.math.BigDecimal

@Schema(description = "생산출고 입력 상세 DTO")
data class CreateProdOutDetail(

    @field:Schema(description = "출고순번", example = "1")
    val isuSq: Int,

    @field:Schema(description = "품번", example = "ITEM1234567890")
    val itemCd: String,

    @field:Schema(description = "출고수량", example = "100.000000")
    val isuQt: BigDecimal,

    @field:Schema(description = "출고창고코드", example = "FWH1")
    val fwhCd: String,

    @field:Schema(description = "출고장소코드", example = "FLC1")
    val flcCd: String,

    @field:Schema(description = "청구번호(생산예외입고번호)", example = "REQ2025042801")
    val reqNb: String?,

    @field:Schema(description = "청구순번", example = "1")
    val reqSq: Int?,

    @field:Schema(description = "입고공정코드", example = "TWH1")
    val twhCd: String?,

    @field:Schema(description = "입고작업장코드", example = "TLC1")
    val tlcCd: String?,

    @field:Schema(description = "LOT번호", example = "LOT20250428001")
    val lotNb: String?,

    @field:Schema(description = "모품번코드", example = "PARENTITEM123")
    val itemparentCd: String?,

    @field:Schema(description = "순번(사급자재)", example = "1")
    val matlSq: Int?,

    @field:Schema(description = "지시번호코드", example = "WO2025042801")
    val woCd: String?,

    @field:Schema(description = "공정번호", example = "OP01")
    val opNb: String?,

    @field:Schema(description = "프로젝트코드", example = "PJT20250428")
    val pjtCd: String?,

    @field:Schema(description = "자동처리여부 (0:수동, 1:자동)", example = "1")
    val autoYn: String?,

    @field:Schema(description = "관리구분코드", example = "MGMT001")
    val mgmtCd: String?,

    @field:Schema(description = "비고", example = "상세 비고")
    val remarkDc: String?
)
