package com.practise.java.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@RequiredArgsConstructor
public class Individual {
    private String name;
    private List<Vehicle> vehicles;

//    public Individual(String name, List<Vehicle> vehicles) {
//        this.name = name;
//        this.vehicles = vehicles;
//    }

}
