package com.scaler.groupproject.vehicleservicemanagement.services;

import com.scaler.groupproject.vehicleservicemanagement.models.ServiceRecord;
import com.scaler.groupproject.vehicleservicemanagement.models.ServiceType;

import java.util.List;

public interface ServiceRecordDataService {
    ServiceRecord getServiceRecordById(Long id);
    List<ServiceRecord> getAllServiceRecords();
    ServiceRecord deleteServiceRecordById(Long id);
    ServiceRecord createServiceRecord(ServiceRecord serviceRecord);
}
