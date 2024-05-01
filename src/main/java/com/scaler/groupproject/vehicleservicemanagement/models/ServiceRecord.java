package com.scaler.groupproject.vehicleservicemanagement.models;

import jakarta.persistence.*;
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
public class ServiceRecord {
    @Id
    private Long serviceRecordId;
    @ManyToOne
    private Vehicle vehicle;
    @ManyToMany
    private List<ServiceType> serviceType;
    private int dateOfService;
    @ManyToMany
    private List<ServiceProvider> serviceProvider;
}
