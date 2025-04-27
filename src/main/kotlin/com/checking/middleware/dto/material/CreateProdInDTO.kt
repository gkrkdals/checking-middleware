package com.checking.middleware.dto.material

import io.swagger.v3.oas.annotations.media.Schema

@Schema(description = "생산입고정보 등록 DTO")
data class CreateProdInDTO(

    @field:Schema(description = "회사코드", example = "1000")
    val coCd: String,

    @field:Schema(description = "채번구분코드 (IW 고정)", example = "IW")
    val keyFg: String,

    @field:Schema(description = "채번일자", example = "20250428")
    val keyDt: String,

    @field:Schema(description = "입고구분 (0:예외입고, 1:실적입고)", example = "1")
    val rcvFg: String,

    @field:Schema(description = "품번", example = "ITEM1234567890")
    val itemCd: String,

    @field:Schema(description = "입고수량", example = "100.000000")
    val rcvQt: Double,

    @field:Schema(description = "입고창고코드", example = "W001")
    val twhCd: String,

    @field:Schema(description = "입고장소코드", example = "L001")
    val tlcCd: String,

    @field:Schema(description = "사업장코드", example = "D001")
    val divCd: String,

    @field:Schema(description = "부서코드", example = "DEP001")
    val deptCd: String,

    @field:Schema(description = "사원코드", example = "EMP001")
    val empCd: String,

    @field:Schema(description = "지시번호코드", example = "WO12345678")
    val woCd: String? = null,

    @field:Schema(description = "실적번호코드", example = "WR12345678")
    val wrCd: String? = null,

    @field:Schema(description = "실적공정코드", example = "PR01")
    val fwhCd: String? = null,

    @field:Schema(description = "실적작업장코드", example = "LC01")
    val flcCd: String? = null,

    @field:Schema(description = "담당자코드", example = "PLN01")
    val plnCd: String? = null,

    @field:Schema(description = "LOT번호", example = "LOT20250428")
    val lotNb: String? = null,

    @field:Schema(description = "프로젝트코드", example = "PJT001")
    val pjtCd: String? = null,

    @field:Schema(description = "주문번호/청구번호", example = "SO12345678")
    val soNb: String? = null,

    @field:Schema(description = "주문순번/청구순번", example = "1")
    val soSq: Int? = null,

    @field:Schema(description = "검사여부 (0:무검사, 1:검사)", example = "0")
    val qcFg: String? = null,

    @field:Schema(description = "관리구분코드", example = "MGMT01")
    val mgmtCd: String? = null,

    @field:Schema(description = "설비코드", example = "EQ001")
    val equipCd: String? = null,

    @field:Schema(description = "작업팀코드", example = "TEAM01")
    val wteamCd: String? = null,

    @field:Schema(description = "작업조코드", example = "SHIFT01")
    val wshftCd: String? = null,

    @field:Schema(description = "자동처리여부 (0:수동, 1:자동)", example = "1")
    val autoYn: String? = null,

    @field:Schema(description = "적합여부", example = "1")
    val badYn: String? = null,

    @field:Schema(description = "비고", example = "생산입고 등록 테스트")
    val remarkDc: String? = null
)
