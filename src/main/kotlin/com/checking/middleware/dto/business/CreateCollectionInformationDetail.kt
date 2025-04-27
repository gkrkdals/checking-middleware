package com.checking.middleware.dto.business

import io.swagger.v3.oas.annotations.media.Schema

@Schema(description = "수금생성 상세")
data class CreateCollectionInformationDetail(

    @field:Schema(description = "수금순번", maxLength = 5)
    val rcpSq: Int,

    @field:Schema(description = "수금구분", maxLength = 1)
    val rcpFg1: String,

    @field:Schema(description = "관리번호", maxLength = 30, nullable = true)
    val rcpmgDc: String? = null,

    @field:Schema(description = "자수/타수구분 (0: 자수, 1: 타수)", maxLength = 1, nullable = true)
    val jataFg: String? = null,

    @field:Schema(description = "정상수금", nullable = true)
    val normalAm1: Double? = null,

    @field:Schema(description = "선수금", nullable = true)
    val beforeAm1: Double? = null,

    @field:Schema(description = "금융기관코드", maxLength = 4, nullable = true)
    val bankCd: String? = null,

    @field:Schema(description = "발행일자 (yyyyMMdd)", maxLength = 8, nullable = true)
    val isuDt1: String? = null,

    @field:Schema(description = "만기/약정일자 (yyyyMMdd)", maxLength = 8, nullable = true)
    val dueDt1: String? = null,

    @field:Schema(description = "비고", maxLength = 60, nullable = true)
    val remarkDc: String? = null,

    @field:Schema(description = "사용여부 (0: 미사용, 1: 사용)", maxLength = 1, nullable = true)
    val useYn: String? = null,

    @field:Schema(description = "유효여부", maxLength = 1, nullable = true)
    val expireYn: String? = null,

    @field:Schema(description = "관리구분코드", maxLength = 10, nullable = true)
    val mgmtCd: String? = null,

    @field:Schema(description = "프로젝트코드", maxLength = 10, nullable = true)
    val pjtCd: String? = null,

    @field:Schema(description = "지급장소", maxLength = 40, nullable = true)
    val paymentPt: String? = null,

    @field:Schema(description = "발행인", maxLength = 20, nullable = true)
    val isuNm: String? = null,

    @field:Schema(description = "배서인", maxLength = 60, nullable = true)
    val endorsNm: String? = null,

    @field:Schema(description = "관리번호금융거래처코드", maxLength = 10, nullable = true)
    val rcpmgtrCd: String? = null,

    @field:Schema(description = "통장일자 (yyyyMMdd)", maxLength = 8, nullable = true)
    val bankDt: String? = null,

    @field:Schema(description = "통장순번", maxLength = 10)
    val bankSq: Int
)
