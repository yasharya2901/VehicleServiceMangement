package com.scaler.groupproject.vehicleservicemanagement.services;

import com.scaler.groupproject.vehicleservicemanagement.exceptions.ServiceProviderNotFoundException;
import com.scaler.groupproject.vehicleservicemanagement.models.ServiceProvider;
import com.scaler.groupproject.vehicleservicemanagement.repositories.ServiceProviderRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SelfServiceProviderDataService implements ServiceProviderDataService {

    private ServiceProviderRepository serviceProviderRepository;

    public SelfServiceProviderDataService(ServiceProviderRepository serviceProviderRepository) {
        this.serviceProviderRepository = serviceProviderRepository;
    }

    @Override
    public ServiceProvider getServiceProviderById(Long id) {
        Optional<ServiceProvider> serviceProvider = serviceProviderRepository.findById(id);
        if (serviceProvider.isEmpty()) {
            throw new ServiceProviderNotFoundException("ServiceProvider not found with id " , id);
        }
        return serviceProvider.get();
    }
    @Override
    public List<ServiceProvider> getAllServiceProviders() {
        List<ServiceProvider> serviceProviders = serviceProviderRepository.findAll();
        if (serviceProviders.isEmpty()) {
            throw new ServiceProviderNotFoundException("No ServiceProviders Found");        }
        return serviceProviderRepository.findAll();
    }

    @Override
    public ServiceProvider deleteServiceProviderById(Long id) {
        Optional<ServiceProvider> optionalServiceProvider = serviceProviderRepository.findById(id);
        if (optionalServiceProvider.isPresent()) {
            serviceProviderRepository.deleteById(id);
            return optionalServiceProvider.get();
        }
        throw new ServiceProviderNotFoundException("ServiceProvider not found with id " , id);
    }

    @Override
    public ServiceProvider createServiceProvider(ServiceProvider serviceProvider) {
        return serviceProviderRepository.save(serviceProvider);
    }
}