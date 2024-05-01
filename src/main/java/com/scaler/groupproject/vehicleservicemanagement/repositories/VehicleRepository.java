package com.scaler.groupproject.vehicleservicemanagement.repositories;

import com.scaler.groupproject.vehicleservicemanagement.exceptions.ResourceNotFoundException;
import com.scaler.groupproject.vehicleservicemanagement.models.Vehicle;
import org.springframework.boot.autoconfigure.data.jpa.JpaRepositoriesAutoConfiguration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface VehicleRepository extends JpaRepository<Vehicle,Long> {


    Optional<Vehicle> findById(Long aLong);

    List<Vehicle> findAll();

    void deleteById(Long aLong);

    Vehicle save(Vehicle vehicle);


}
