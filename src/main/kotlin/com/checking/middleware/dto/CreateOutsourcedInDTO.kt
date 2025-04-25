package com.checking.middleware.dto

data class CreateOutsourcedInDTO(
    val coCd: String, // 회사코드
    val keyFg: String, // 채번구분코드
    val keyDt: String, // 채번일자
    val rcvFg: String, // 입고구분(0:예외입고, 1:실적입고)
    val trCd: String, // 거래처코드
    val exchCd: String, // 환종코드
    val exchRt: Double, // 환율
    val divCd: String, // 사업장코드
    val deptCd: String, // 부서코드
    val empCd: String, // 사원코드
    val procFg: String, // 마감구분(0.건별, 1.일괄)
    val vatFg: String, // 과세구분코드(0.매입과세, 1.수입영세, 2.매입면세, 3.매입기타)
    val plnCd: String?, // 담당자코드 (Optional)
    val remarkDc: String?, // 비고 (Optional)
    val detail: List<CreateOutsourcedInDetail>
)
