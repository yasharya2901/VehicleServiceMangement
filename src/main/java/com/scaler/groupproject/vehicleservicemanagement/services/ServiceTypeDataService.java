package com.scaler.groupproject.vehicleservicemanagement.services;

import com.scaler.groupproject.vehicleservicemanagement.models.ServiceType;

import java.util.List;

public interface ServiceTypeDataService {
    public ServiceType getServiceRecordById(Long id);
    public List<ServiceType> getAllServiceRecords();
    public ServiceType deleteServiceRecordById(Long id);
    public ServiceType createServiceRecord(ServiceType serviceType);
}
