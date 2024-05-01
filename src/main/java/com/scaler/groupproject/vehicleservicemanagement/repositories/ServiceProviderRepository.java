package com.scaler.groupproject.vehicleservicemanagement.repositories;

import com.scaler.groupproject.vehicleservicemanagement.models.ServiceProvider;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ServiceProviderRepository extends JpaRepository<ServiceProvider,Long> {
    Optional<ServiceProvider> findById(Long id);
    ServiceProvider save(ServiceProvider serviceProvider);
    void deleteById(Long id);
    List<ServiceProvider> findAll();

}
