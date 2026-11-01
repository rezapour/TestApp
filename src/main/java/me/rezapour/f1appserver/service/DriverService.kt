package me.rezapour.f1appserver.service

import me.rezapour.f1appserver.api.F1ApiClient
import org.springframework.stereotype.Service
import java.sql.Driver
import java.util.ArrayList

@Service
class DriverService(
    private val api: F1ApiClient
) {
//    private val drivers: ArrayList<Driver> = ArrayList()

    fun getDrivers(): String {
        return api.getDrivers() ?: ""
    }
}