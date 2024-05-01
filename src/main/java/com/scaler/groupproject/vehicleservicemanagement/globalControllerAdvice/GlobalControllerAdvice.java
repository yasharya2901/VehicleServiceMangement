package com.scaler.groupproject.vehicleservicemanagement.globalControllerAdvice;

import com.scaler.groupproject.vehicleservicemanagement.dtos.ExceptionDto;
import com.scaler.groupproject.vehicleservicemanagement.exceptions.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalControllerAdvice {
    @ExceptionHandler(VehicleNotFoundException.class)
    public ResponseEntity<ExceptionDto> handleVehicleNotFoundException(VehicleNotFoundException exp) {
        ExceptionDto dto = new ExceptionDto();
        dto.setMessage(exp.getMessage());
        dto.setResolution("Vehicle not found! Please check your vehicle id: " + exp.getId());
        return new ResponseEntity<>(dto, HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(CustomerNotFoundException.class)
    public ResponseEntity<ExceptionDto> handleCustomerNotFoundException(CustomerNotFoundException exp) {
        ExceptionDto dto = new ExceptionDto();
        dto.setMessage(exp.getMessage());
        dto.setResolution("Customer not found! Please check your customer id: "+ exp.getId());
        return new ResponseEntity<>(dto, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(DuplicateRecordException.class)
    public ResponseEntity<ExceptionDto> handleDuplicateRecordException(DuplicateRecordException exp) {
        ExceptionDto dto = new ExceptionDto();
        dto.setMessage(exp.getMessage());
        dto.setResolution("Duplicate record! This record already exists");
        return new ResponseEntity<>(dto, HttpStatus.CONFLICT);
    }

    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<ExceptionDto> handleResourceNotFoundException(ResourceNotFoundException exp) {
        ExceptionDto dto = new ExceptionDto();
        dto.setMessage(exp.getMessage());
        dto.setResolution("Resource not found! Please check your resource id: "+exp.getId());
        return new ResponseEntity<>(dto, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(ServiceProviderNotFoundException.class)
    public ResponseEntity<ExceptionDto> handleServiceProviderNotFoundException(ServiceProviderNotFoundException exp) {
        ExceptionDto dto = new ExceptionDto();
        dto.setMessage(exp.getMessage());
        dto.setResolution("Service provider not found! Please check your service provider id: "+exp.getId());
        return new ResponseEntity<>(dto, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(ServiceRecordNotFoundException.class)
    public ResponseEntity<ExceptionDto> handleServiceRecordNotFoundException(ServiceRecordNotFoundException exp) {
        ExceptionDto dto = new ExceptionDto();
        dto.setMessage(exp.getMessage());
        dto.setResolution("Service record not found! Please check your service record id: "+exp.getId());
        return new ResponseEntity<>(dto, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(ServiceTypeNotFoundException.class)
    public ResponseEntity<ExceptionDto> handleServiceTypeNotFoundException(ServiceTypeNotFoundException exp) {
        ExceptionDto dto = new ExceptionDto();
        dto.setMessage(exp.getMessage());
        dto.setResolution("Service type not found! Please check your service type id: "+exp.getId());
        return new ResponseEntity<>(dto, HttpStatus.NOT_FOUND);
    }
}
