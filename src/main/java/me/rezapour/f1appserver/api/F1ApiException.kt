package me.rezapour.f1appserver.api

class F1ApiException(
    message: String,
    cause: Throwable? = null,
) : RuntimeException(message, cause) {
}