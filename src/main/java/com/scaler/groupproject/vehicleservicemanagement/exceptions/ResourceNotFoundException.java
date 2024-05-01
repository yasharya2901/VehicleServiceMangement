package com.scaler.groupproject.vehicleservicemanagement.exceptions;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ResourceNotFoundException extends RuntimeException {
    private Long id;
    public ResourceNotFoundException(String message,Long id) {
        super(message);
        this.id = id;
    }
}