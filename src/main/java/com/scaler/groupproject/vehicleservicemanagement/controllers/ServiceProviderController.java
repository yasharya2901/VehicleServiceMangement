package com.scaler.groupproject.vehicleservicemanagement.controllers;


import com.scaler.groupproject.vehicleservicemanagement.models.ServiceProvider;
import com.scaler.groupproject.vehicleservicemanagement.models.ServiceRecord;
import com.scaler.groupproject.vehicleservicemanagement.services.ServiceProviderDataService;
import com.scaler.groupproject.vehicleservicemanagement.services.ServiceTypeDataService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/service-providers")
public class ServiceProviderController {
    private Logger logger = LoggerFactory.getLogger(CustomerController.class);
    private ServiceProviderDataService serviceProviderDataService;
    ServiceProviderController(ServiceProviderDataService serviceProviderDataService){
        this.serviceProviderDataService = serviceProviderDataService;
    }
    @GetMapping("/{id}")
    public ServiceProvider getServiceProviderById(@PathVariable Long id) {

        return serviceProviderDataService.getServiceProviderById(id);
    }

    @GetMapping
    public List<ServiceProvider> getAllServiceProviders() {
        return serviceProviderDataService.getAllServiceProviders();
    }

    @DeleteMapping("/{id}")
    public ServiceProvider deleteServiceProviderById(@PathVariable Long id) {
        logger.info("Deleting ServiceProvider with id: " + id);
         return serviceProviderDataService.deleteServiceProviderById(id);


    }

    @PostMapping
    public ServiceProvider createServiceProvider(@RequestBody ServiceProvider serviceProvider) {
        return serviceProviderDataService.createServiceProvider(serviceProvider);
    }

}
