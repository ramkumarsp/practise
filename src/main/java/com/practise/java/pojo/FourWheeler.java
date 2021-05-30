package com.practise.java.pojo;

public class FourWheeler implements Vehicle {
    String model;
    Make make;
    Integer numberOfWheels;
    int seatingCapacity;

    public FourWheeler(Make make, String model, int seatingCapacity) {
        this.numberOfWheels= 4;
        this.make = make;
        this.model = model;
        this.seatingCapacity = seatingCapacity;
    }

    @Override
    public String move() {
        return "The '"+ make.name() +" - "+ model +"' FourWheeler with '"+numberOfWheels+"' wheels with seating capacity of '"+seatingCapacity+"' is moving";
    }
}