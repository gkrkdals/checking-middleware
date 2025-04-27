package com.checking.middleware.dto.material

import io.swagger.v3.oas.annotations.media.Schema

@Schema(description = "외주입고 등록 DTO")
data class CreateOutsourcedInDTO(

    @field:Schema(description = "회사코드", example = "1000")
    val coCd: String,

    @field:Schema(description = "채번구분코드", example = "SG")
    val keyFg: String,

    @field:Schema(description = "채번일자", example = "20250428")
    val keyDt: String,

    @field:Schema(description = "입고구분(0:예외입고, 1:실적입고)")
    val rcvFg: String,

    @field:Schema(description = "거래처코드", example = "TR12345678")
    val trCd: String,

    @field:Schema(description = "환종코드", example = "USD")
    val exchCd: String,

    @field:Schema(description = "환율", example = "1.250000")
    val exchRt: Double,

    @field:Schema(description = "사업장코드", example = "DIV001")
    val divCd: String,

    @field:Schema(description = "부서코드", example = "DEPT001")
    val deptCd: String,

    @field:Schema(description = "사원코드", example = "EMP001")
    val empCd: String,

    @field:Schema(description = "마감구분", example = "0", allowableValues = ["0", "1"])
    val procFg: String,

    @field:Schema(description = "과세구분코드", example = "0", allowableValues = ["0", "1", "2", "3"])
    val vatFg: String,

    @field:Schema(description = "담당자코드", example = "PLN001")
    val plnCd: String,

    @field:Schema(description = "비고", example = "입고처리 완료")
    val remarkDc: String
)
