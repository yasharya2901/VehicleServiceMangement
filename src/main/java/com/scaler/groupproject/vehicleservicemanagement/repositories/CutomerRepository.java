package com.scaler.groupproject.vehicleservicemanagement.repositories;

import com.scaler.groupproject.vehicleservicemanagement.controllers.CustomerController;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CutomerRepository {


    Optional<CustomerController> findById(Long id);
    List<CustomerController> findAll();
    void deleteById(Long id);
    CustomerController save(CustomerController customer);

}
