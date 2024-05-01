package com.scaler.groupproject.vehicleservicemanagement.exceptions;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ServiceRecordNotFoundException extends RuntimeException {
    private Long id;
    public ServiceRecordNotFoundException(String message,Long id) {
        super(message);
        this.id =id;
    }
}