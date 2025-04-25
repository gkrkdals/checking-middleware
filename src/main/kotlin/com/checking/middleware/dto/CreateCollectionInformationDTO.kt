package com.checking.middleware.dto

data class CreateCollectionInformationDTO(
    val coCd: String,
    val keyFg: String,
    val keyDt: String,
    val rcpFg: String,
    val trCd: String,
    val empCd: String,
    val deptCd: String,
    val divCd: String,
    val refDc: String?,
    val remarkDc: String?,
    val plnCd: String?,
    val detail: List<CreateCollectionInformationDetail>
)
