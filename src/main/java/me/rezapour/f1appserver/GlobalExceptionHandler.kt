package me.rezapour.f1appserver

import me.rezapour.f1appserver.api.F1ApiException
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.web.bind.annotation.RestControllerAdvice


@RestControllerAdvice
class GlobalExceptionHandler {

    @ExceptionHandler(F1ApiException::class)
    fun f1ApiException(e: F1ApiException): ResponseEntity<ErrorResponse> {
        return ResponseEntity.status(HttpStatus.BAD_GATEWAY).body(
            ErrorResponse(e.message.toString())
        )
    }
}

data class ErrorResponse(
    val message: String
)