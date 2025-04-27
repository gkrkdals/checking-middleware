package com.checking.middleware.dto.business

import io.swagger.v3.oas.annotations.media.Schema

@Schema(description = "출고입력 상세")
data class CreateOutInformationDetail(

    @field:Schema(description = "출고순번")
    val isuSq: Int,

    @field:Schema(description = "품번", maxLength = 30)
    val itemCd: String,

    @field:Schema(description = "주문단위수량", nullable = true)
    val soQt: Double?,

    @field:Schema(description = "재고단위수량", nullable = true)
    val isuQt: Double?,

    @field:Schema(description = "단가", nullable = true)
    val isuUm: Double?,

    @field:Schema(description = "공급가", nullable = true)
    val isugAm: Double?,

    @field:Schema(description = "부가세", nullable = true)
    val isuvAm: Double?,

    @field:Schema(description = "합계액", nullable = true)
    val isuhAm: Double?,

    @field:Schema(description = "환종코드", maxLength = 3)
    val exchCd: String,

    @field:Schema(description = "환율", nullable = true)
    val exchRt: Double?,

    @field:Schema(description = "외화단가", nullable = true)
    val exchUm: Double?,

    @field:Schema(description = "외화금액", nullable = true)
    val exchAm: Double?,

    @field:Schema(description = "LOT번호", maxLength = 20, nullable = true)
    val lotNb: String?,

    @field:Schema(description = "주문번호/청구번호", maxLength = 12, nullable = true)
    val soNb: String?,

    @field:Schema(description = "주문순번/청구순번", nullable = true)
    val soSq: Int?,

    @field:Schema(description = "단가유형코드", maxLength = 10, nullable = true)
    val umFg: String?,

    @field:Schema(description = "장소코드", maxLength = 4)
    val lcCd: String,

    @field:Schema(description = "부가세포함단가", nullable = true)
    val vatUm: Double?,

    @field:Schema(description = "비고", maxLength = 60, nullable = true)
    val remarkDc: String?,

    @field:Schema(description = "마감수량", nullable = true)
    val clsQt: Double?,

    @field:Schema(description = "검사번호", maxLength = 12, nullable = true)
    val qcNb: String?,

    @field:Schema(description = "검사순번", nullable = true)
    val qcSq: Int?,

    @field:Schema(description = "의뢰번호", maxLength = 12, nullable = true)
    val isureqNb: String?,

    @field:Schema(description = "의뢰순번", nullable = true)
    val isureqSq: Int?,

    @field:Schema(description = "납기일", maxLength = 8, nullable = true)
    val dueDt: String?,

    @field:Schema(description = "SET품번", maxLength = 30, nullable = true)
    val itemsetCd: String?,

    @field:Schema(description = "원천출고번호", maxLength = 12, nullable = true)
    val isuNbOrg: String?,

    @field:Schema(description = "원천출고순번", nullable = true)
    val isuSqOrg: Int?,

    @field:Schema(description = "관리구분코드", maxLength = 10, nullable = true)
    val mgmtCd: String?,

    @field:Schema(description = "프로젝트코드", maxLength = 10, nullable = true)
    val pjtCd: String?,

    @field:Schema(description = "BOM모품번", maxLength = 30, nullable = true)
    val itembomCd: String?,

    @field:Schema(description = "쇼핑몰주문번호", maxLength = 12, nullable = true)
    val shoppingNb: String?,

    @field:Schema(description = "쇼핑몰주문순번", nullable = true)
    val shoppingSq: Int?
)

