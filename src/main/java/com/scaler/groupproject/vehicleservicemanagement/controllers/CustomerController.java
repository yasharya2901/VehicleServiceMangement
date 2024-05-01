package com.scaler.groupproject.vehicleservicemanagement.controllers;


import com.scaler.groupproject.vehicleservicemanagement.models.Customer;
import com.scaler.groupproject.vehicleservicemanagement.services.CustomerDataService;
import com.scaler.groupproject.vehicleservicemanagement.services.SelfCustomerDataService;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLOutput;
import java.util.List;

@RestController
@RequestMapping("/customers")
public class CustomerController {
    private SelfCustomerDataService selfcustomerDataService;
    public CustomerController(SelfCustomerDataService selfcustomerDataService){
        this.selfcustomerDataService = selfcustomerDataService;
    }
    @GetMapping("/{id}")
    public Customer getCustomerById(@PathVariable Long id) {
        return selfcustomerDataService.getCustomerById(id);
    }

    @GetMapping
    public List<Customer> getAllCustomers() {
        return selfcustomerDataService.getAllCustomers();
    }

    @DeleteMapping("/{id}")
    public Customer deleteCustomerById(@PathVariable Long id) {
        System.out.println(id);
        return selfcustomerDataService.deleteCustomerById(id);
    }

    @PostMapping
    public Customer createCustomer(@RequestBody Customer customer) {
        return selfcustomerDataService.createCustomer(customer);
    }
}
