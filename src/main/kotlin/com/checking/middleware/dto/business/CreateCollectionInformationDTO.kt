package com.checking.middleware.dto.business

import io.swagger.v3.oas.annotations.media.Schema

@Schema(description = "수금정보 생성 DTO")
data class CreateCollectionInformationDTO(

    @field:Schema(description = "회사코드", maxLength = 4)
    val coCd: String,

    @field:Schema(description = "채번구분코드 (고정값: RC)")
    val keyFg: String,

    @field:Schema(description = "채번일자 (yyyyMMdd)", maxLength = 8)
    val keyDt: String,

    @field:Schema(
        description = "거래구분 (0:DOMESTIC, 1:LOCAL L/C, 2:구매승인서, 3:MASTER L/C, 4:T/T, 5:D/A, 6:D/P)",
        maxLength = 1
    )
    val rcpFg: String,

    @field:Schema(description = "거래처코드", maxLength = 10)
    val trCd: String,

    @field:Schema(description = "사원코드", maxLength = 10)
    val empCd: String,

    @field:Schema(description = "부서코드", maxLength = 10)
    val deptCd: String,

    @field:Schema(description = "사업장코드", maxLength = 4)
    val divCd: String,

    @field:Schema(description = "증빙번호", maxLength = 20, nullable = true)
    val refDc: String? = null,

    @field:Schema(description = "비고", maxLength = 60, nullable = true)
    val remarkDc: String? = null,

    @field:Schema(description = "담당자코드", maxLength = 5, nullable = true)
    val plnCd: String? = null,

    @field:Schema(description = "수금입력 상세 리스트")
    val detail: List<CreateCollectionInformationDetail>
)
