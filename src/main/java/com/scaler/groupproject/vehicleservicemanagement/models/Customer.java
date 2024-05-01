package com.scaler.groupproject.vehicleservicemanagement.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
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
public class Customer {
    @Id
    private Long customerId;
    private String name;
    @OneToMany
    private List<Vehicle> vehicle;
    @OneToMany
    private List<ServiceRecord> serviceRecord;

}