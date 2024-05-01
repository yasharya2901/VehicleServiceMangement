package com.scaler.groupproject.vehicleservicemanagement.controllers;

import com.scaler.groupproject.vehicleservicemanagement.models.ServiceRecord;
import com.scaler.groupproject.vehicleservicemanagement.models.ServiceType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/service-records/")
public class ServiceRecordController {
    @GetMapping("/{id}")
    public String getServiceRecordById(@PathVariable Long id) {
        return null;
    }

    @GetMapping
    public List<ServiceRecord> getAllServiceRecords() {
        return null;
    }

    @DeleteMapping("/{id}")
    public ServiceRecord deleteServiceRecordById(@PathVariable Long id) {
        return null;
    }

    @PostMapping
    public ServiceType createServiceRecord(@RequestBody ServiceRecord serviceRecord) {
        return null;
    }

}
