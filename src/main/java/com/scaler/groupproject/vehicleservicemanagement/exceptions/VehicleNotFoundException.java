package com.scaler.groupproject.vehicleservicemanagement.exceptions;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class VehicleNotFoundException extends RuntimeException {
    private Long id;
    public VehicleNotFoundException(String message,Long id) {
        super(message);
        this.id = id;
    }
}