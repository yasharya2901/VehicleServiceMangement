package com.scaler.groupproject.vehicleservicemanagement.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ServiceProvider {
    private Long serviceProviderId;
    private String serviceProviderName;
    private ServiceType serviceType;
    private String contactNumber;
}
