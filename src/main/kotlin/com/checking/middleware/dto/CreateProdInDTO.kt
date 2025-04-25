package com.checking.middleware.dto

data class CreateProdInDTO(
    val coCd: String, // 회사코드
    val rcvDtFrom: String, // 입고시작일
    val rcvDtTo: String, // 입고종료일
    val divCd: String?, // 사업장코드 (Optional)
    val deptCd: String?, // 부서코드 (Optional)
    val empCd: String?, // 사원코드 (Optional)
    val itemCd: String?, // 품번 (Optional)
    val woCd: String?, // 지시번호코드 (Optional)
    val confirmDt: String?, // 확인일시 (Optional)
    val remarkDc: String? // 비고 (Optional)
)
