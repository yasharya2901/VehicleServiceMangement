package com.scaler.groupproject.vehicleservicemanagement.services;

import com.scaler.groupproject.vehicleservicemanagement.models.ServiceType;

import java.util.List;

public interface ServiceTypeDataService {
    ServiceType getServiceTypeById(Long id);
    List<ServiceType> getAllServiceTypes();
    ServiceType deleteServiceTypeById(Long id);
    ServiceType createServiceType(ServiceType serviceType);
}
