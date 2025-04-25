package com.checking.middleware.dto

data class CreateStockAdjOutDetail(
    val adjustSq: Int, // 조정순번
    val itemCd: String, // 품번
    val isuQt: Double, // 출고수량
    val openQt: Double?, // 기초수량 (Optional)
    val rcvQt: Double?, // 입고수량 (Optional)
    val adjustUm: Double?, // 조정단가 (Optional)
    val adjustAm: Double?, // 조정금액 (Optional)
    val lotNb: String?, // LOT번호 (Optional)
    val inspNb: String?, // 재고실사번호 (Optional)
    val remarkDc: String?, // 비고 (Optional)
    val mgmtCd: String?, // 관리구분코드 (Optional)
    val pjtCd: String? // 프로젝트코드 (Optional)
)