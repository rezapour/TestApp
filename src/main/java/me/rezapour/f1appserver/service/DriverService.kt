package me.rezapour.f1appserver.service

import me.rezapour.f1appserver.api.F1ApiClient
import me.rezapour.f1appserver.api.F1ApiException
import me.rezapour.f1appserver.api.model.DriversResponse
import me.rezapour.f1appserver.data.toDomain
import org.springframework.stereotype.Service

@Service
class DriverService(
    private val api: F1ApiClient
) {
//    private val drivers: ArrayList<Driver> = ArrayList()

    fun getDrivers(): List<Driver> {
        return api.getDrivers()?.map { it.toDomain() } ?: throw Exception("No Drivers Found!")
    }
}