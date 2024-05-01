package com.scaler.groupproject.vehicleservicemanagement.repositories;

import com.scaler.groupproject.vehicleservicemanagement.controllers.CustomerController;
import com.scaler.groupproject.vehicleservicemanagement.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CustomerRepository extends JpaRepository<Customer,Long> {

    Optional<Customer> findById(Long id);
    List<Customer> findAll();
    void deleteById(Long id);
    Customer save(Customer customer);

}
