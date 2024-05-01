package com.scaler.groupproject.vehicleservicemanagement.services;

import com.scaler.groupproject.vehicleservicemanagement.exceptions.AccessDeniedException;
import com.scaler.groupproject.vehicleservicemanagement.exceptions.VehicleNotFoundException;
import com.scaler.groupproject.vehicleservicemanagement.models.Customer;
import com.scaler.groupproject.vehicleservicemanagement.models.Vehicle;
import com.scaler.groupproject.vehicleservicemanagement.repositories.VehicleRepository;
import jakarta.persistence.ManyToOne;
import org.springframework.stereotype.Service;

import java.sql.SQLOutput;
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
        return vehicleRepository.save(vehicle);
    }

    @Override
    public List<Vehicle> getAllVehicles() {
        return vehicleRepository.findAll();
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
        Vehicle vehicle = getVehicleById(id);
        vehicleRepository.deleteById(id);
        return vehicle;
    }
    @Override
    public Vehicle updateVehicle(Vehicle vehicle, Long id) {
        Vehicle vehicle1 = getVehicleById(id);

        if (vehicle1.getOwner() != null && !vehicle1.getOwner().getName().equals(vehicle.getOwner().getName())) {
            throw new AccessDeniedException("Cannot change ownership details");
        }
        vehicle1.setVehicleId(vehicle.getVehicleId());
        vehicle1.setCompany(vehicle.getCompany());
        vehicle1.setModel(vehicle.getModel());
        vehicle1.setYear(vehicle.getYear());
        return vehicleRepository.save(vehicle1);
    }
}

