package com.scaler.groupproject.vehicleservicemanagement.services;

import com.scaler.groupproject.vehicleservicemanagement.exceptions.ServiceRecordNotFoundException;
import com.scaler.groupproject.vehicleservicemanagement.exceptions.VehicleNotFoundException;
import com.scaler.groupproject.vehicleservicemanagement.models.ServiceRecord;
import com.scaler.groupproject.vehicleservicemanagement.models.Vehicle;
import com.scaler.groupproject.vehicleservicemanagement.repositories.ServiceRecordRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SelfServiceRecordDataService implements ServiceRecordDataService{
    ServiceRecordRepository serviceRecordRepository;
    SelfServiceRecordDataService(ServiceRecordRepository serviceRecordRepository)
    {
        this.serviceRecordRepository=serviceRecordRepository;
    }

    @Override
    public ServiceRecord getServiceRecordById(Long id) {
        Optional<ServiceRecord> optionalServiceRecord = serviceRecordRepository.findById(id);

        if (optionalServiceRecord.isEmpty()) {
            throw new ServiceRecordNotFoundException("Service record not found", id);
        }

        return optionalServiceRecord.get();
    }

    @Override
    public List<ServiceRecord> getAllServiceRecords() {
        List<ServiceRecord> serviceRecords = serviceRecordRepository.findAll();
        if(serviceRecords.isEmpty()) {
            throw new ServiceRecordNotFoundException("Service Record Not Found", null);
        }
        return serviceRecords;
    }

    @Override
    public ServiceRecord deleteServiceRecordById(Long id) {
        ServiceRecord serviceRecord = getServiceRecordById(id);
        serviceRecordRepository.deleteById(id);
        return serviceRecord;
    }

    @Override
    public ServiceRecord createServiceRecord(ServiceRecord serviceRecord) {
        return serviceRecordRepository.save(serviceRecord);
    }
}
