package com.checking.middleware.dto.response

data class ErrorResponseDTO(
    val resultCode: Int,
    val resultMsg: String,
    val statusValue: Int
)
