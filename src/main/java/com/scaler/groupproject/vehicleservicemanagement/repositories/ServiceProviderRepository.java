package com.scaler.groupproject.vehicleservicemanagement.repositories;

import com.scaler.groupproject.vehicleservicemanagement.models.ServiceProvider;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ServiceProviderRepository {
    Optional<ServiceProvider> findById(Long id);
    ServiceProvider save(ServiceProvider serviceProvider);
    void deleteById(Long id);
    List<ServiceProvider> findAll();

}
