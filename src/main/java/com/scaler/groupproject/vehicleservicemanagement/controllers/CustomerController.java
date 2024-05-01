package com.scaler.groupproject.vehicleservicemanagement.controllers;


import com.scaler.groupproject.vehicleservicemanagement.models.Customer;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customers")
public class CustomerController {

    @GetMapping("/{id}")
    public Customer getCustomerById(@PathVariable Long id) {
        return null;
    }

    @GetMapping
    public List<Customer> getAllCustomers() {
        return null;
    }

    @DeleteMapping("/{id}")
    public Customer deleteCustomerById(@PathVariable Long id) {
        return null;
    }

    @PostMapping
    public Customer createCustomer(@RequestBody Customer customer) {
        return null;
    }
}
