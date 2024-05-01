package com.scaler.groupproject.vehicleservicemanagement.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
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
public class ServiceType {
    @Id
    private Long serviceTypeId;
    private String serviceTypeName;
    @ManyToMany
    private List<ServiceProvider> serviceProvider;
}
