package com.scaler.groupproject.vehicleservicemanagement.controllers;

import com.scaler.groupproject.vehicleservicemanagement.models.Vehicle;
import com.scaler.groupproject.vehicleservicemanagement.services.VehicleDataService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/vehicles")
public class VehicleController {
    private Logger logger = LoggerFactory.getLogger(CustomerController.class);
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
        logger.info("Deleting Vehicle with id: " + id);
        return vehicleDataService.deleteVehicleById(id);
    }

    @PostMapping
    public Vehicle createVehicle(@RequestBody Vehicle vehicle) {
        return vehicleDataService.createVehicle(vehicle);
    }

}
