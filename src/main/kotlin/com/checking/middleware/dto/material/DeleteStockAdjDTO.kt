package com.checking.middleware.dto.material

import io.swagger.v3.oas.annotations.media.Schema

@Schema(description = "재고조정 정보 삭제 DTO")
data class DeleteStockAdjDTO(

    @field:Schema(description = "회사코드", example = "1000")
    val coCd: String,

    @field:Schema(description = "조정번호", example = "ADJ20250428")
    val adjustNb: String
)
