package com.checking.middleware.dto.material

import io.swagger.v3.oas.annotations.media.Schema

@Schema(description = "외주출고 정보 삭제 DTO")
data class DeleteOutsourcedOutDTO(

    @field:Schema(description = "회사코드", example = "1000")
    val coCd: String,

    @field:Schema(description = "출고번호", example = "ISU2025042801")
    val isuNb: String
)
