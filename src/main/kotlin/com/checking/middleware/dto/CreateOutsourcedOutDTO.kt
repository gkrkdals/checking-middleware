package com.checking.middleware.dto

data class CreateOutsourcedOutDTO(
    val coCd: String,         // 회사코드
    val keyFg: String,        // 채번구분코드 (SI 고정)
    val keyDt: String,        // 채번일자
    val trCd: String,         // 거래처코드
    val divCd: String,        // 사업장코드
    val deptCd: String,       // 부서코드
    val empCd: String,        // 사원코드
    val plnCd: String?,       // 담당자코드
    val remarkDc: String?,    // 비고,
    val detail: List<CreateOutsourcedOutDetail>
)