package com.scaler.groupproject.vehicleservicemanagement.exceptions;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ServiceProviderNotFoundException extends RuntimeException {
    private Long id;
    public ServiceProviderNotFoundException(String message) {
        super(message);
        this.id = id;
    }
}