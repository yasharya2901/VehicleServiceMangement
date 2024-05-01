package com.scaler.groupproject.vehicleservicemanagement.repositories;

import com.scaler.groupproject.vehicleservicemanagement.models.ServiceRecord;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ServiceRecordRepository extends JpaRepository<ServiceRecord,Long> {

    Optional<ServiceRecord> findById(Long id);

    List<ServiceRecord> findAll();

    ServiceRecord save(ServiceRecord serviceRecord);

    void deleteById(Long id);



}
