package com.scaler.groupproject.vehicleservicemanagement.exceptions;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ServiceTypeNotFoundException extends RuntimeException {
    private Long id;
    public ServiceTypeNotFoundException(String message,Long id) {
        super(message);
        this.id = id;
    }
}