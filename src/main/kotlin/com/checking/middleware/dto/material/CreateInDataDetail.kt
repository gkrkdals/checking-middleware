package com.checking.middleware.dto.material

import io.swagger.v3.oas.annotations.media.Schema

@Schema(description = "입고정보 상세")
data class CreateInDataDetail(

    @field:Schema(description = "입고순번")
    val rcvSq: Int,

    @field:Schema(description = "품번")
    val itemCd: String,

    @field:Schema(description = "관리단위수량")
    val poQt: Double? = null,

    @field:Schema(description = "재고단위수량")
    val rcvQt: Double? = null,

    @field:Schema(description = "원화단가")
    val rcvUm: Double? = null,

    @field:Schema(description = "원화금액")
    val rcvgAm: Double? = null,

    @field:Schema(description = "부가세")
    val rcvvAm: Double? = null,

    @field:Schema(description = "합계액")
    val rcvhAm: Double? = null,

    @field:Schema(description = "환종코드")
    val exchCd: String,

    @field:Schema(description = "환율")
    val exchRt: Double? = null,

    @field:Schema(description = "외화단가")
    val exchUm: Double? = null,

    @field:Schema(description = "외화금액")
    val exchAm: Double? = null,

    @field:Schema(description = "LOT번호")
    val lotNb: String? = null,

    @field:Schema(description = "발주번호")
    val poNb: String? = null,

    @field:Schema(description = "발주순번")
    val poSq: Int? = null,

    @field:Schema(description = "자재청구번호")
    val reqNb: String? = null,

    @field:Schema(description = "자재청구순번")
    val reqSq: Int? = null,

    @field:Schema(description = "선적번호")
    val iblNb: String? = null,

    @field:Schema(description = "선적순번")
    val iblSq: Int? = null,

    @field:Schema(description = "단가유형코드")
    val umFg: String? = null,

    @field:Schema(description = "입고장소코드")
    val lcCd: String,

    @field:Schema(description = "비고")
    val remarkDc: String? = null,

    @field:Schema(description = "부가세포함단가")
    val vatUm: Double? = null,

    @field:Schema(description = "입고검사번호")
    val qcNb: String? = null,

    @field:Schema(description = "입고검사순번")
    val qcSq: Int? = null,

    @field:Schema(description = "원천입고번호")
    val rcvNbOrg: String? = null,

    @field:Schema(description = "원천입고순번")
    val rcvSqOrg: Int? = null,

    @field:Schema(description = "관리구분코드")
    val mgmtCd: String? = null,

    @field:Schema(description = "프로젝트코드")
    val pjtCd: String? = null,

    @field:Schema(description = "BOM모품번")
    val itembomCd: String? = null,

    @field:Schema(description = "SET품번")
    val itemsetCd: String? = null
)