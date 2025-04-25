package com.checking.middleware.dto

data class CreateStockAdjInDTO(
    val coCd: String,         // 회사코드 (필수)
    val keyFg: String,        // 채번구분코드 (필수, 고정값: IA)
    val keyDt: String,        // 채번일자 (필수)
    val adjustFg: String,     // 조정구분 (필수, 예: 1.입고)
    val invFg: String,        // 입출고구분 (필수, 예: 1.입고)
    val whCd: String,         // 창고코드 (필수)
    val lcCd: String,         // 장소코드 (필수)
    val divCd: String,        // 사업장코드 (필수)
    val deptCd: String,       // 부서코드 (필수)
    val empCd: String,        // 사원코드 (필수)
    val remarkDc: String?,    // 비고
    val trCd: String?,        // 거래처코드
    val plnCd: String?,        // 담당자코드
    val detail: List<CreateStockAdjInDetail>
)
