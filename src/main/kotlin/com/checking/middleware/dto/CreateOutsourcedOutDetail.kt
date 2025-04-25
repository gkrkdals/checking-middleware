package com.checking.middleware.dto

data class CreateOutsourcedOutDetail(
    val isuSq: Int,           // 출고순번
    val itemCd: String,       // 품번
    val poQt: Double,         // 관리수량
    val isuQt: Double,        // 출고수량
    val whCd: String,         // 창고코드
    val lcCd: String,         // 장소코드
    val lotNb: String?,       // LOT번호
    val pjtCd: String?,       // 프로젝트코드
    val poNb: String?,        // 발주번호
    val poSq: Int?,           // 발주순번
    val matlSq: Int?,         // 순번(사급자재)
    val itemparentCd: String?,// 모품번코드
    val mgmtCd: String?,      // 관리구분코드
    val remarkDc: String?     // 비고
)

