package com.scaler.groupproject.vehicleservicemanagement.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Vehicle {
    @Id
    private Long vehicleId;
    private String company;
    private String model;
    private String year;
    @ManyToOne
    private Customer owner;
}
