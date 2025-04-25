package com.checking.middleware.dto

import java.math.BigDecimal

data class CreateProdOutDetail(
    val isuSq: Int,              // 출고순번 (필수)
    val itemCd: String,          // 품번 (필수)
    val isuQt: Double,       // 출고수량 (필수, 17,6)
    val fwhCd: String,           // 출고창고코드 (필수)
    val flcCd: String,           // 출고장소코드 (필수)
    val reqNb: String?,          // 청구번호 (선택, 생산예외입고번호)
    val reqSq: Int?,             // 청구순번 (선택)
    val twhCd: String?,          // 입고공정코드 (선택)
    val tlcCd: String?,          // 입고작업장코드 (선택)
    val lotNb: String?,          // LOT번호 (선택)
    val itemparentCd: String?,   // 모품번코드 (선택)
    val matlSq: Int?,            // 순번(사급자재) (선택)
    val woCd: String?,           // 지시번호코드 (선택)
    val opNb: String?,           // 공정번호 (선택)
    val pjtCd: String?,          // 프로젝트코드 (선택)
    val autoYn: String?,         // 자동처리여부 (0.수동, 1.자동) (선택)
    val mgmtCd: String?,         // 관리구분코드 (선택)
    val remarkDc: String?        // 비고 (선택)
)

