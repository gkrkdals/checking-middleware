package com.checking.middleware.dto.material

import io.swagger.v3.oas.annotations.media.Schema

@Schema(description = "입고정보 등록 DTO")
data class CreateInDataDTO(

    @field:Schema(description = "회사코드", maxLength = 4)
    val coCd: String,

    @field:Schema(description = "거래처코드", maxLength = 10)
    val trCd: String,

    @field:Schema(description = "채번구분코드 (고정값: RV)")
    val keyFg: String,

    @field:Schema(description = "채번일자 (yyyyMMdd)", maxLength = 8)
    val keyDt: String,

    @field:Schema(description = "입고창고코드", maxLength = 4)
    val whCd: String,

    @field:Schema(
        description = "거래구분코드 (0:DOMESTIC, 1:LOCAL L/C, 2:구매승인서, 3:MASTER L/C, 4:T/T, 5:D/A, 6:D/P)",
        maxLength = 1
    )
    val poFg: String,

    @field:Schema(description = "환종코드", maxLength = 3)
    val exchCd: String,

    @field:Schema(description = "환율", example = "1234.56789")
    val exchRt: Double,

    @field:Schema(description = "L/C 여부", maxLength = 1)
    val lcYn: String,

    @field:Schema(description = "사원코드", maxLength = 10)
    val empCd: String,

    @field:Schema(description = "부서코드", maxLength = 10)
    val deptCd: String,

    @field:Schema(description = "사업장코드", maxLength = 4)
    val divCd: String,

    @field:Schema(
        description = "과세구분코드 (0:매입과세, 1:수입영세, 2:매입면세, 3:매입기타)",
        maxLength = 1
    )
    val vatFg: String,

    @field:Schema(
        description = "구분코드 (0:예외입고, 1:국내발주, 2:L/C, 3:해외발주)",
        maxLength = 1
    )
    val mapFg: String,

    @field:Schema(description = "비고", maxLength = 90, nullable = true)
    val remarkDc: String? = null,

    @field:Schema(
        description = "마감구분 (0:건별, 1:일괄)",
        maxLength = 1
    )
    val procFg: String,

    @field:Schema(description = "담당자코드", maxLength = 5, nullable = true)
    val plnCd: String? = null,

    @field:Schema(
        description = "단가구분코드 (0:부가세미포함, 1:부가세포함)",
        maxLength = 1
    )
    val umvatFg: String,

    @field:Schema(description = "입고정보 입력 상세")
    val detail: List<CreateInDataDetail>
)
