package com.checking.middleware.dto

data class CreateProdOutDTO(
    val coCd: String,        // 회사코드 (필수)
    val keyFg: String,       // 채번구분코드 (필수, 고정값: MW)
    val keyDt: String,       // 채번일자 (필수)
    val divCd: String,       // 사업장코드 (필수)
    val deptCd: String,      // 부서코드 (필수)
    val empCd: String,       // 사원코드 (필수)
    val rcvNb: String?,      // 입고번호 (선택)
    val plnCd: String?,      // 담당자코드 (선택)
    val remarkDc: String?,   // 비고 (선택)
    val detail: List<CreateProdOutDetail>
)
