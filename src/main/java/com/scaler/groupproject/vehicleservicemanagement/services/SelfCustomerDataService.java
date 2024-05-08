package com.scaler.groupproject.vehicleservicemanagement.services;

import com.scaler.groupproject.vehicleservicemanagement.controllers.CustomerController;
import com.scaler.groupproject.vehicleservicemanagement.exceptions.CustomerNotFoundException;
import com.scaler.groupproject.vehicleservicemanagement.models.Customer;
import com.scaler.groupproject.vehicleservicemanagement.repositories.CustomerRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SelfCustomerDataService implements CustomerDataService{
    private Logger logger = LoggerFactory.getLogger(CustomerController.class);
    private final CustomerRepository customerRepository;
    public SelfCustomerDataService(CustomerRepository customerRepository){
        this.customerRepository = customerRepository;
    }
    @Override
    public Customer getCustomerById(Long id) {
        Optional<Customer> optionalCustomer = customerRepository.findById(id);
        if(optionalCustomer.isEmpty()){
            throw new CustomerNotFoundException("Customer not Found..",id);
        }
        return optionalCustomer.get();
    }

    @Override
    public List<Customer> getAllCustomers() {
        List<Customer> ListOfCustomer = customerRepository.findAll();
        if(ListOfCustomer.isEmpty()){
            throw new CustomerNotFoundException("No Customer Found..");
        }
        return ListOfCustomer;
    }

    @Override
    public Customer deleteCustomerById(Long id)
    {
        logger.info("Deleting customer with id: " + id);
        Customer customer = getCustomerById(id);
//        System.out.println(customer);
        customerRepository.deleteById(id);
        return customer;
    }

    @Override
    public Customer createCustomer(Customer customer) {
        return customerRepository.save(customer);
    }
}
