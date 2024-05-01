package com.scaler.groupproject.vehicleservicemanagement.services;

import com.scaler.groupproject.vehicleservicemanagement.exceptions.ServiceTypeNotFoundException;
import com.scaler.groupproject.vehicleservicemanagement.models.ServiceProvider;
import com.scaler.groupproject.vehicleservicemanagement.models.ServiceType;
import com.scaler.groupproject.vehicleservicemanagement.repositories.ServiceTypeRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SelfServiceTypeDataService implements ServiceTypeDataService{

    private ServiceTypeRepository serviceTypeRepository;
    public SelfServiceTypeDataService(ServiceTypeRepository serviceTypeRepository) {
        this.serviceTypeRepository = serviceTypeRepository;
    }

    @Override
    public ServiceType getServiceTypeById(Long id) {
        Optional<ServiceType> optionalServiceType = serviceTypeRepository.findById(id);
        if (optionalServiceType.isEmpty()) {
            throw new ServiceTypeNotFoundException("Service Type not found", id);
        }
        return optionalServiceType.get();
    }

    @Override
    public List<ServiceType> getAllServiceTypes() {
        List<ServiceType> serviceTypes = serviceTypeRepository.findAll();
        if (serviceTypes.isEmpty()) {
            throw new ServiceTypeNotFoundException("No Service Types found", null);
        }
        return serviceTypes;
    }

    @Override
    public ServiceType deleteServiceTypeById(Long id) {
        ServiceType serviceType = getServiceTypeById(id);
        serviceTypeRepository.deleteById(id);
        return serviceType;
    }

    @Override
    public ServiceType createServiceType(ServiceType serviceType) {
        return serviceTypeRepository.save(serviceType);
    }
}
