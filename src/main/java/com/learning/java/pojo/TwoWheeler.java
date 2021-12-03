package com.learning.java.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
//@RequiredArgsConstructor
public class TwoWheeler implements Vehicle {
    Make make;
    String model;
    final Integer numberOfWheels = 2;
    int seatingCapacity;

//    public TwoWheeler(Make make, String model, int seatingCapacity) {
//        this.make = make;
//        this.model = model;
//        this.seatingCapacity = seatingCapacity;
//    }

    @Override
    public String move() {
        return "The '"+ make +" - "+ model +"' TwoWheeler with '"+numberOfWheels+"' wheels with seating capacity of '"+seatingCapacity+"' is moving";
    }
}
