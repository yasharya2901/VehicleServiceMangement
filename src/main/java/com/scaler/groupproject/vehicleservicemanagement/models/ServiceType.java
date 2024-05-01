package com.scaler.groupproject.vehicleservicemanagement.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ServiceType {
    private Long serviceTypeId;
    private String serviceTypeName;
    private ServiceProvider serviceProvider;
}
