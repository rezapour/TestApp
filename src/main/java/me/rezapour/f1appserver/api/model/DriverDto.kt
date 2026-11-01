package me.rezapour.f1appserver.api.model

import com.fasterxml.jackson.annotation.JsonProperty

data class DriversResponse(
    @JsonProperty("MRData")
    val data: MRData
)

data class MRData(
    val xmlns: String,
    val series: String,
    val url: String,
    val limit: String,
    val offset: String,
    val total: String,
    @JsonProperty("DriverTable")
    val driverTable: DriverTable
)

data class DriverTable(
    @JsonProperty("Drivers")
    val drivers: List<DriverDto>,
)

data class DriverDto(
    val driverId: String,
    val givenName: String,
    val familyName: String,
    val dateOfBirth: String? = null,
    val nationality: String? = null
)