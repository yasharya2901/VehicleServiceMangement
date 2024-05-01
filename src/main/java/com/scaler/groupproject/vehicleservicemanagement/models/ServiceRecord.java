package com.scaler.groupproject.vehicleservicemanagement.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ServiceRecord {
    private Long serviceRecordId;
    private Vehicle vehicle;
    private ServiceType serviceType;
    private int dateOfService;
    private ServiceProvider serviceProvider;
}
