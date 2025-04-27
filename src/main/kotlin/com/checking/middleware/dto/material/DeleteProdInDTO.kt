package com.checking.middleware.dto.material

import io.swagger.v3.oas.annotations.media.Schema

@Schema(description = "생산입고정보 삭제 DTO")
data class DeleteProdInDTO(

    @field:Schema(description = "회사코드", example = "1000")
    val coCd: String,

    @field:Schema(description = "입고번호", example = "RCV20250428")
    val rcvNb: String
)
