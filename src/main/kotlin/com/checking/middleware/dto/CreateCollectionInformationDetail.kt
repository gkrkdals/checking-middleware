package com.checking.middleware.dto

data class CreateCollectionInformationDetail(
    val rcpSq: Int,
    val rcpFg1: String,
    val rcpmgDc: String?,
    val jataFg: String?,
    val normalAm1: Double?,
    val beforeAm1: Double?,
    val bankCd: String?,
    val isuDt1: String?,
    val dueDt1: String?,
    val remarkDc: String?,
    val useYn: String?,
    val expireYn: String?,
    val mgmtCd: String?,
    val pjtCd: String?,
    val paymentPt: String?,
    val isuNm: String?,
    val endorsNm: String?,
    val rcpmgtrCd: String?,
    val bankDt: String?,
    val bankSq: Int
)