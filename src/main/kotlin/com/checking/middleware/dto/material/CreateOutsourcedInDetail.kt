package com.checking.middleware.dto.material

data class CreateOutsourcedInDetail(
    val rcvSq: Int, // 입고순번
    val itemCd: String, // 품번
    val poQt: Double, // 입고관리수량
    val rcvQt: Double, // 입고수량
    val rcvgAm: Double?, // 원화금액 (Optional)
    val rcvvAm: Double?, // 부가세 (Optional)
    val rcvhAm: Double?, // 합계액 (Optional)
    val exchUm: Double?, // 외화단가 (Optional)
    val exchRt: Double?, // 환율 (Optional)
    val exchAm: Double?, // 외화금액 (Optional)
    val exchCd: String, // 환종코드
    val whCd: String, // 창고코드
    val lcCd: String, // 장소코드
    val matlFg: String?, // 처리여부(사급자재) (Optional)
    val lotNb: String?, // LOT번호 (Optional)
    val poNb: String?, // 발주번호 (Optional)
    val poSq: Int?, // 발주순번 (Optional)
    val mgmtCd: String?, // 관리구분코드 (Optional)
    val pjtCd: String?, // 프로젝트코드 (Optional)
    val remarkDc: String?, // 비고 (Optional)
    val qcNb: String?, // 검사번호 (Optional)
    val qcSq: Int? // 검사순번 (Optional)
)
