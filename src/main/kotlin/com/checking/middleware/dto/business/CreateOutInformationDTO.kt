package com.checking.middleware.dto.business
import io.swagger.v3.oas.annotations.media.Schema

@Schema(description = "출고입력 DTO")
data class CreateOutInformationDTO(

    @field:Schema(description = "회사코드", maxLength = 4)
    val coCd: String,

    @field:Schema(description = "거래처코드", maxLength = 10)
    val trCd: String,

    @field:Schema(description = "채번구분코드 (고정값: IS)")
    val keyFg: String,

    @field:Schema(description = "채번일자 (yyyyMMdd)", maxLength = 8)
    val keyDt: String,

    @field:Schema(description = "창고코드", maxLength = 4)
    val whCd: String,

    @field:Schema(description = "환종코드", maxLength = 3)
    val exchCd: String,

    @field:Schema(description = "환율")
    val exchRt: Double,

    @field:Schema(
        description = "거래구분 (0:DOMESTIC, 1:LOCAL L/C, 2:구매승인서, 3:MASTER L/C, 4:T/T, 5:D/A, 6:D/P)",
        maxLength = 1
    )
    val soFg: String,

    @field:Schema(description = "사원코드", maxLength = 10)
    val empCd: String,

    @field:Schema(description = "부서코드", maxLength = 10)
    val deptCd: String,

    @field:Schema(description = "할인율", nullable = true)
    val discntRt: Double? = null,

    @field:Schema(description = "사업장코드", maxLength = 4)
    val divCd: String,

    @field:Schema(
        description = "과세구분코드 (0:매출과세, 1:수출영세, 2:매출면세, 3:매출기타)",
        maxLength = 1
    )
    val vatFg: String,

    @field:Schema(description = "비고", maxLength = 60, nullable = true)
    val remarkDc: String? = null,

    @field:Schema(
        description = "구분코드 (0:예외출고, 1:국내수주, 2:L/C, 3:해외수주, 7:쇼핑몰)",
        maxLength = 1
    )
    val mapFg: String,

    @field:Schema(description = "납품처코드", maxLength = 5, nullable = true)
    val shipCd: String? = null,

    @field:Schema(description = "담당자코드", maxLength = 5, nullable = true)
    val plnCd: String? = null,

    @field:Schema(description = "배송방법", maxLength = 10, nullable = true)
    val shipFg: String? = null,

    @field:Schema(description = "마감구분 (0:건별, 1:일괄)", maxLength = 1)
    val procFg: String,

    @field:Schema(
        description = "단가구분코드 (0:부가세미포함, 1:부가세포함)",
        maxLength = 1
    )
    val umvatFg: String,

    @field:Schema(description = "배송방법 지역코드", maxLength = 10, nullable = true)
    val areaCd: String? = null,

    @field:Schema(
        description = "온라인쇼핑몰코드 (mapFg='7'일 경우 필수)",
        maxLength = 10,
        nullable = true
    )
    val mallCode: String? = null,

    @field:Schema(description = "출고입력 상세 리스트")
    val detail: List<CreateOutInformationDetail>
)
