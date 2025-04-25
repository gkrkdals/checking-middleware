package com.checking.middleware.dto

data class CreateStockAdjInDetail(
    val adjustSq: Int,         // 조정순번 (필수)
    val itemCd: String,        // 품번 (필수)
    val rcvQt: Double,         // 입고수량 (필수)
    val openQt: Double?,       // 기초수량
    val isuQt: Double?,        // 출고수량
    val adjustUm: Double?,     // 조정단가
    val adjustAm: Double?,     // 조정금액
    val lotNb: String?,        // LOT번호
    val inspNb: String?,       // 재고실사번호
    val remarkDc: String?,     // 비고
    val mgmtCd: String?,       // 관리구분코드
    val pjtCd: String?         // 프로젝트코드
)
