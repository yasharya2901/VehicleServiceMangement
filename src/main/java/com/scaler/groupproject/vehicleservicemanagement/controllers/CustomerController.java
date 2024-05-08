package com.scaler.groupproject.vehicleservicemanagement.controllers;


import com.scaler.groupproject.vehicleservicemanagement.models.Customer;
import com.scaler.groupproject.vehicleservicemanagement.services.CustomerDataService;
import com.scaler.groupproject.vehicleservicemanagement.services.SelfCustomerDataService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLOutput;
import java.util.List;

@RestController
@RequestMapping("/customers")
public class CustomerController {

//    private Logger logger = LoggerFactory.getLogger(CustomerController.class);
    private SelfCustomerDataService selfcustomerDataService;
    public CustomerController(SelfCustomerDataService selfcustomerDataService){
        this.selfcustomerDataService = selfcustomerDataService;
    }
    @GetMapping("/{id}")
    public Customer getCustomerById(@PathVariable Long id) {
//        logger.debug("Getting customer with id: {}", id);
        return selfcustomerDataService.getCustomerById(id);
    }

    @GetMapping
    public List<Customer> getAllCustomers() {
        return selfcustomerDataService.getAllCustomers();
    }

    @DeleteMapping("/{id}")
    public Customer deleteCustomerById(@PathVariable Long id) {
        System.out.println(id);
//        logger.info("Deleting customer with id: " + id);
        return selfcustomerDataService.deleteCustomerById(id);
    }

    @PostMapping
    public Customer createCustomer(@RequestBody Customer customer) {
        return selfcustomerDataService.createCustomer(customer);
    }
}
