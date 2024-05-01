package com.scaler.groupproject.vehicleservicemanagement.services;

import com.scaler.groupproject.vehicleservicemanagement.models.ServiceRecord;
import com.scaler.groupproject.vehicleservicemanagement.models.ServiceType;

import java.util.List;

public interface ServiceRecordDataService {
    public ServiceRecord getServiceRecordById(Long id);
    public List<ServiceRecord> getAllServiceRecords();
    public ServiceRecord deleteServiceRecordById(Long id);
    public ServiceRecord createServiceRecord(ServiceRecord serviceRecord);
}
