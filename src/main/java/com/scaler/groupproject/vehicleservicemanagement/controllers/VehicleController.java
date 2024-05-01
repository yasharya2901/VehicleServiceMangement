package com.scaler.groupproject.vehicleservicemanagement.controllers;

import com.scaler.groupproject.vehicleservicemanagement.models.Vehicle;
import com.scaler.groupproject.vehicleservicemanagement.services.VehicleDataService;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/vehicles")
public class VehicleController {
    VehicleDataService vehicleDataService;
    VehicleController(VehicleDataService vehicleDataService)
    {
        this.vehicleDataService=vehicleDataService;
    }
    @GetMapping("/{id}")
    public Vehicle getVehicleById(@PathVariable Long id) {
        return vehicleDataService.getVehicleById(id);
    }

    @GetMapping
    public List<Vehicle> getAllVehicles() {
        return vehicleDataService.getAllVehicles();
    }

    @DeleteMapping("/{id}")
    public Vehicle deleteVehicleById(@PathVariable Long id) {
        return vehicleDataService.deleteVehicleById(id);
    }

    @PostMapping
    public Vehicle createVehicle(@RequestBody Vehicle vehicle) {
        return vehicleDataService.createVehicle(vehicle);
    }

    @PutMapping("/{id}")
    public Vehicle updateVehicle(@RequestBody Vehicle vehicle, @PathVariable Long id) {
        return vehicleDataService.updateVehicle(vehicle, id);
    }
}
