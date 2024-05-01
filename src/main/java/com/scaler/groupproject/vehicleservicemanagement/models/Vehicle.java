package com.scaler.groupproject.vehicleservicemanagement.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Vehicle {
    private Vehicle vehicle;
    private String company;
    private String model;
    private String year;
    private Customer owner;
}
