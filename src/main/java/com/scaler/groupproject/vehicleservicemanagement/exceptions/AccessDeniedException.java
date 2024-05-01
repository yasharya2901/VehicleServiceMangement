package com.scaler.groupproject.vehicleservicemanagement.exceptions;

public class AccessDeniedException extends RuntimeException {
    public AccessDeniedException(String message) {
        super(message);
    }
}