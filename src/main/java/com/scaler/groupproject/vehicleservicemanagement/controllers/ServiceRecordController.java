package com.scaler.groupproject.vehicleservicemanagement.controllers;

import com.scaler.groupproject.vehicleservicemanagement.models.ServiceRecord;
import com.scaler.groupproject.vehicleservicemanagement.models.ServiceType;
import com.scaler.groupproject.vehicleservicemanagement.services.ServiceRecordDataService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/service-records")
public class ServiceRecordController {
    private Logger logger = LoggerFactory.getLogger(CustomerController.class);
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
        logger.info("Deleting ServiceRecord with id: " + id);
        return serviceRecordDataService.deleteServiceRecordById(id);
    }

    @PostMapping
    public ServiceRecord createServiceRecord(@RequestBody ServiceRecord serviceRecord) {
        return serviceRecordDataService.createServiceRecord(serviceRecord);
    }

}
