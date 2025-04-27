package com.checking.middleware.dto.material

import io.swagger.v3.oas.annotations.media.Schema

@Schema(description = "외주입고 삭제 DTO")
data class DeleteOutsourcedInDTO(

    @field:Schema(description = "회사코드", example = "1000")
    val coCd: String,

    @field:Schema(description = "입고번호", example = "RCV2025042801")
    val rcvNb: String
)
