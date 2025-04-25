package com.checking.middleware.dto

import CreateInDataDetail

data class CreateInDataDTO(
    val coCd: String,
    val trCd: String,
    val keyFg: String,
    val keyDt: String,
    val whCd: String,
    val poFg: String,
    val exchCd: String,
    val exchRt: Double,
    val lcYn: String,
    val empCd: String,
    val deptCd: String,
    val divCd: String,
    val vatFg: String,
    val mapFg: String,
    val remarkDc: String?,
    val procFg: String,
    val plnCd: String?,
    val umvatFg: String,
    val detail: List<CreateInDataDetail>
)
