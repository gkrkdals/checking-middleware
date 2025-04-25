package com.checking.middleware.enums

import org.springframework.http.HttpMethod

enum class AllowedMethod(val method: HttpMethod) {
    GET(HttpMethod.GET),
    POST(HttpMethod.POST),
    PUT(HttpMethod.PUT),
    DELETE(HttpMethod.DELETE)
}