package com.checking.middleware.dto

data class CreateStockAdjBasicDTO(
    val coCd: String,           // 회사코드
    val keyFg: String,          // 채번구분코드 (고정: IA)
    val keyDt: String,          // 채번일자
    val adjustFg: String,       // 조정구분 (예: 0.기초)
    val invFg: String,          // 입출고구분
    val whCd: String,           // 창고코드
    val lcCd: String,           // 장소코드
    val divCd: String,          // 사업장코드
    val deptCd: String,         // 부서코드
    val empCd: String,          // 사원코드
    val remarkDc: String?,      // 비고 (선택)
    val trCd: String?,          // 거래처코드 (선택)
    val plnCd: String?,         // 담당자코드 (선택)
    val detail: List<CreateStockAdjBasicDetail>
)
