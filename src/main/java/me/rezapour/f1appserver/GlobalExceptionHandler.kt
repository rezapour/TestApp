package me.rezapour.f1appserver


import me.rezapour.f1appserver.api.F1ApiConnectionException
import me.rezapour.f1appserver.api.F1ApiResponseException
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.web.bind.annotation.RestControllerAdvice


@RestControllerAdvice
class GlobalExceptionHandler {

    @ExceptionHandler(F1ApiResponseException::class)
    fun f1ApiException(e: F1ApiResponseException): ResponseEntity<ErrorResponse> {
        return ResponseEntity.status(HttpStatus.BAD_GATEWAY).body(
            ErrorResponse(e.message.toString())
        )
    }

    @ExceptionHandler(F1ApiConnectionException::class)
    fun f1ApiException(e: F1ApiConnectionException): ResponseEntity<ErrorResponse> {
        return ResponseEntity.status(HttpStatus.SERVICE_UNAVAILABLE).body(
            ErrorResponse(e.message.toString())
        )

    }
}

data class ErrorResponse(
    val message: String
)