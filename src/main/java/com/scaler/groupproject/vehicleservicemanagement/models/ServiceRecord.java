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
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long serviceRecordId;
    @ManyToOne(fetch = FetchType.EAGER)
    private Vehicle vehicle;
    @ManyToMany(fetch = FetchType.EAGER)
    private List<ServiceType> serviceType;
    private int dateOfService;
    @ManyToMany(fetch = FetchType.EAGER)
    private List<ServiceProvider> serviceProvider;
}
