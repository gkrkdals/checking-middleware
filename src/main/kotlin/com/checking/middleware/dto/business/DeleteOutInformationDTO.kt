package com.checking.middleware.dto.business

import io.swagger.v3.oas.annotations.media.Schema

@Schema(description = "출고정보 삭제 DTO")
data class DeleteOutInformationDTO(

    @field:Schema(description = "회사코드", maxLength = 4)
    val coCd: String,

    @field:Schema(description = "출고번호", maxLength = 12)
    val isuNb: String
)
