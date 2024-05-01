package com.scaler.groupproject.vehicleservicemanagement.services;

import com.scaler.groupproject.vehicleservicemanagement.models.Customer;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

public interface CustomerDataService {
    public Customer getCustomerById(Long id);
    public List<Customer> getAllCustomers();
    public Customer deleteCustomerById(Long id);
    public Customer createCustomer(Customer customer);
}
