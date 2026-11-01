package me.rezapour.f1appserver

import me.rezapour.f1appserver.api.model.DriversResponse
import me.rezapour.f1appserver.service.Driver
import me.rezapour.f1appserver.service.DriverService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController


@RestController
@RequestMapping("/drivers")
class F1DriverController(
    private val service: DriverService
) {

    @GetMapping
    fun getDrivers(): List<Driver> {
        return service.getDrivers()
    }

}