package com.scaler.groupproject.vehicleservicemanagement.services;

import com.scaler.groupproject.vehicleservicemanagement.models.Vehicle;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

public interface VehicleDataService {
    public Vehicle createVehicle(Vehicle vehicle);
    public List<Vehicle> getAllVehicles();
    public Vehicle getVehicleById(Long id);
    public Vehicle deleteVehicleById(Long id);
}
