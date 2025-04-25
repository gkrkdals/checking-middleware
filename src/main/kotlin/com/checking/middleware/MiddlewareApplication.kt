package com.checking.middleware

import io.swagger.v3.oas.annotations.OpenAPIDefinition
import io.swagger.v3.oas.annotations.info.Info
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@OpenAPIDefinition(
    info = Info(
        title = "Middleware API",
        version = "1.0",
        description = "아마란스10 API 사용을 위한 미들웨어"
    )
)
@SpringBootApplication
class MiddlewareApplication

fun main(args: Array<String>) {
    runApplication<MiddlewareApplication>(*args)
}
