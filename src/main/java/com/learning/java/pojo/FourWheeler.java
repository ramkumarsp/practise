package com.practise.java.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@AllArgsConstructor
//@RequiredArgsConstructor
public class FourWheeler implements Vehicle {
    Make make;
    String model;
    final Integer numberOfWheels = 4;
    int seatingCapacity;

//    public FourWheeler(Make make, String model, int seatingCapacity) {
//        this.make = make;
//        this.model = model;
//        this.seatingCapacity = seatingCapacity;
//    }

    @Override
    public String move() {
        return "The '"+ make +" - "+ model +"' FourWheeler with '"+numberOfWheels+"' wheels with seating capacity of '"+seatingCapacity+"' is moving";
    }
}