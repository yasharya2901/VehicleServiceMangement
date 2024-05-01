package com.scaler.groupproject.vehicleservicemanagement.controllers;

import com.scaler.groupproject.vehicleservicemanagement.models.ServiceRecord;
import com.scaler.groupproject.vehicleservicemanagement.models.ServiceType;
import com.scaler.groupproject.vehicleservicemanagement.services.ServiceRecordDataService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/service-records")
public class ServiceRecordController {
    private ServiceRecordDataService serviceRecordDataService;
    ServiceRecordController(ServiceRecordDataService serviceRecordDataService){
        this.serviceRecordDataService=serviceRecordDataService;
    }
    @GetMapping("/{id}")
    public ServiceRecord getServiceRecordById(@PathVariable Long id) {
        return serviceRecordDataService.getServiceRecordById(id);
    }

    @GetMapping
    public List<ServiceRecord> getAllServiceRecords() {
        return serviceRecordDataService.getAllServiceRecords();
    }

    @DeleteMapping("/{id}")
    public ServiceRecord deleteServiceRecordById(@PathVariable Long id) {
        return serviceRecordDataService.deleteServiceRecordById(id);
    }

    @PostMapping
    public ServiceRecord createServiceRecord(@RequestBody ServiceRecord serviceRecord) {
        return serviceRecordDataService.createServiceRecord(serviceRecord);
    }

}
