package com.checking.middleware.dto.response

data class BaseResponseDTO(
    val resultCode: Int,
    val resultMsg: String,
    val resultData: Any
)
