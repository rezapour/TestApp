package me.rezapour.f1appserver.api

class F1ApiResponseException(
    message: String,
    cause: Throwable? = null,
) : RuntimeException(message, cause)

class F1ApiConnectionException(
    message: String,
    cause: Throwable? = null,
) : RuntimeException(message, cause)
