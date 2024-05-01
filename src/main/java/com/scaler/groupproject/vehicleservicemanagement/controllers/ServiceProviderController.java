package com.scaler.groupproject.vehicleservicemanagement.controllers;


import com.scaler.groupproject.vehicleservicemanagement.models.ServiceProvider;
import com.scaler.groupproject.vehicleservicemanagement.models.ServiceRecord;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/service-providers")
public class ServiceProviderController {
    @GetMapping("/{id}")
    public ServiceProvider getServiceProviderById(@PathVariable Long id) {
        return null;
    }

    @GetMapping
    public List<ServiceProvider> getAllServiceProviders() {
        return null;
    }

    @DeleteMapping("/{id}")
    public ServiceProvider deleteServiceProviderById(@PathVariable Long id) {
        return null;
    }

    @PostMapping
    public ServiceRecord createServiceProvider(@RequestBody ServiceRecord serviceRecord) {
        return null;
    }

}
