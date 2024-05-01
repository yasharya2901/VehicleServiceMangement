package com.scaler.groupproject.vehicleservicemanagement.controllers;

import com.scaler.groupproject.vehicleservicemanagement.models.Vehicle;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/vehicles")
public class VehicleController {

    @RequestMapping("/{id}")
    public Vehicle getVehicleById(@PathVariable Long id) {
        return null;
    }

    @RequestMapping
    public List<Vehicle> getAllVehicles() {
        return null;
    }

    @DeleteMapping("{id}")
    public Vehicle deleteVehicleById(@PathVariable Long id) {
        return null;
    }

    @PostMapping
    public Vehicle createVehicle(@RequestBody Vehicle vehicle) {
        return null;
    }

}
