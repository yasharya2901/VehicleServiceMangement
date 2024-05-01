package com.scaler.groupproject.vehicleservicemanagement.controllers;

import com.scaler.groupproject.vehicleservicemanagement.models.ServiceType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/service-type")
public class ServiceTypeController {
    @GetMapping("/{id}")
    public ServiceType getServiceRecordById(Long id) {
        return null;
    }

    @GetMapping
    public List<ServiceType> getAllServiceRecords() {
        return null;
    }

    @DeleteMapping("/{id}")
    public ServiceType deleteServiceRecordById(@PathVariable Long id) {
        return null;
    }

    @PostMapping
    public ServiceType createServiceRecord(@RequestBody ServiceType serviceType) {
        return null;
    }
}
