package com.practise.java.pojo;

import java.util.List;

public class Individual {
    private String name;
    private List<Vehicle> vehicles;

    public Individual(String name, List<Vehicle> vehicles) {
        this.name = name;
        this.vehicles = vehicles;
    }
}
