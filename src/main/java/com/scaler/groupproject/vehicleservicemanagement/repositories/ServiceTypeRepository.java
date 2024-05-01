package com.scaler.groupproject.vehicleservicemanagement.repositories;

import com.scaler.groupproject.vehicleservicemanagement.models.ServiceType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ServiceTypeRepository  extends JpaRepository<ServiceType, Long>{

    Optional<ServiceType> findById(Long id);

    List<ServiceType> findAll();

    void deleteById(Long id);

    ServiceType save(ServiceType serviceType);

}
