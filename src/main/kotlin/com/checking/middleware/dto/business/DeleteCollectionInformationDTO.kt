package com.checking.middleware.dto.business

import io.swagger.v3.oas.annotations.media.Schema

@Schema(description = "수금정보 삭제 DTO")
data class DeleteCollectionInformationDTO(

    @field:Schema(description = "회사코드", maxLength = 4)
    val coCd: String,

    @field:Schema(description = "수금번호", maxLength = 12)
    val rcpNb: String,
)