package com.scaler.groupproject.vehicleservicemanagement.models;

import jakarta.persistence.*;
import jakarta.persistence.criteria.Fetch;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class ServiceProvider {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long serviceProviderId;
    private String serviceProviderName;
    @ManyToMany(fetch = FetchType.EAGER)
    private List<ServiceType> serviceType;
    private String contactNumber;
}
