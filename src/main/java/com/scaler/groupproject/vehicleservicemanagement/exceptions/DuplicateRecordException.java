package com.scaler.groupproject.vehicleservicemanagement.exceptions;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DuplicateRecordException extends RuntimeException {
    private  Long id;
    public DuplicateRecordException(String message,Long id) {
        super(message);
        this.id = id;
    }
}