package com.checking.middleware.dto.material

import io.swagger.v3.oas.annotations.media.Schema

@Schema(description = "입고정보 삭제")
data class DeleteInDTO(

    @field:Schema(description = "회사코드", example = "1000")
    val coCd: String,

    @field:Schema(description = "입고번호", example = "R202404010001")
    val rcvNb: String
)
