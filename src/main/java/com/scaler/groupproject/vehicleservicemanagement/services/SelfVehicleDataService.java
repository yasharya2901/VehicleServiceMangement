package com.scaler.groupproject.vehicleservicemanagement.services;

import com.scaler.groupproject.vehicleservicemanagement.exceptions.VehicleNotFoundException;
import com.scaler.groupproject.vehicleservicemanagement.models.Vehicle;
import com.scaler.groupproject.vehicleservicemanagement.repositories.VehicleRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service("selfVehicleDataService")
public class SelfVehicleDataService implements VehicleDataService{
    VehicleRepository vehicleRepository;
    SelfVehicleDataService(VehicleRepository vehicleRepository)
    {
        this.vehicleRepository = vehicleRepository;
    }

    @Override
    public Vehicle createVehicle (Vehicle vehicle) {
        return null;
    }

    @Override
    public List<Vehicle> getAllVehicles() {
        List<Vehicle> vehicleList = vehicleRepository.findAll();
        return vehicleList;
    }

    @Override
    public Vehicle getVehicleById(Long id){
        Optional<Vehicle> optionalProduct = vehicleRepository.findById(id);

        if (optionalProduct.isEmpty()) {
            throw new VehicleNotFoundException("Vehicle not found",id);
        }

        return optionalProduct.get();
    }

    @Override
    public Vehicle deleteVehicleById(Long id) {
        return null;
    }
}
