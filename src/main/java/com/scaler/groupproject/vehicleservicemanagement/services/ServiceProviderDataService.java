package com.scaler.groupproject.vehicleservicemanagement.services;

import com.scaler.groupproject.vehicleservicemanagement.models.ServiceProvider;

import java.util.List;

public interface ServiceProviderDataService {
    public ServiceProvider getServiceProviderById(Long id);
    public List<ServiceProvider> getAllServiceProviders();
    public ServiceProvider deleteServiceProviderById(Long id);
    public ServiceProvider createServiceProvider(ServiceProvider serviceProvider);
}
