package me.rezapour.f1appserver.data

import me.rezapour.f1appserver.api.model.DriverDto
import me.rezapour.f1appserver.api.model.DriversResponse
import me.rezapour.f1appserver.service.Driver

fun DriverDto.toDomain(): Driver {
    return Driver(
        id = this.driverId,
        firstName = this.givenName,
        lastName = this.familyName,
        dateOfBirth = this.dateOfBirth,
        nationality = this.nationality
    )
}