package com.practise.java.pojo;

public class TwoWheeler implements Vehicle {
    String model;
    Make make;
    Integer numberOfWheels;
    int seatingCapacity;

    public TwoWheeler(Make make, String model, int seatingCapacity) {
        this.numberOfWheels = 2;
        this.make = make;
        this.model = model;
        this.seatingCapacity = seatingCapacity;
    }

    @Override
    public String move() {
        return "The '"+ make +" - "+ model +"' TwoWheeler with '"+numberOfWheels+"' wheels with seating capacity of '"+seatingCapacity+"' is moving";
    }
}
