package me.rezapour.f1appserver.service

data class Driver (
    val id: String,
    val firstName: String,
    val lastName:String,
    val dateOfBirth: String?,
    val nationality: String?,
)