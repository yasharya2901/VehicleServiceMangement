package com.scaler.groupproject.vehicleservicemanagement.models;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long customerId;
    private String name;
    @OneToMany(fetch = FetchType.EAGER)
    private List<Vehicle> vehicle;
    @OneToMany(fetch = FetchType.EAGER)
    private List<ServiceRecord> serviceRecord;

}