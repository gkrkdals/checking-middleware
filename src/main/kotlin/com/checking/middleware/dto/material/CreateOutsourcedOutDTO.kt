package com.checking.middleware.dto.material

import io.swagger.v3.oas.annotations.media.Schema

@Schema(description = "외주출고 입력 DTO")
data class CreateOutsourcedOutDTO(

    @field:Schema(description = "회사코드", example = "1000")
    val coCd: String,

    @field:Schema(description = "채번구분코드 (고정값: SI)", example = "SI")
    val keyFg: String,

    @field:Schema(description = "채번일자", example = "20250428")
    val keyDt: String,

    @field:Schema(description = "거래처코드", example = "TR12345678")
    val trCd: String,

    @field:Schema(description = "사업장코드", example = "DIV001")
    val divCd: String,

    @field:Schema(description = "부서코드", example = "DEPT001")
    val deptCd: String,

    @field:Schema(description = "사원코드", example = "EMP001")
    val empCd: String,

    @field:Schema(description = "담당자코드", example = "PLN001")
    val plnCd: String?,

    @field:Schema(description = "비고", example = "외주출고 처리 완료")
    val remarkDc: String?,

    @field:Schema(description = "외주출고 입력 상세")
    val detail: List<CreateOutsourcedOutDetail>
)
