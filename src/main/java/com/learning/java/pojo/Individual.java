package com.practise.java.pojo;

import lombok.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Data
@AllArgsConstructor
//@RequiredArgsConstructor
@NoArgsConstructor
public class Individual {
    @NonNull
    private String name;
    private List<Vehicle> vehicles;
    private List<TwoWheeler> twoWheelers;
    private List<FourWheeler> fourWheelers;
    private Map<String, SalaryStack> salaryStackMap;

    public Individual(@NonNull String name, @NonNull List<Vehicle> vehicles, Map<String, SalaryStack> salaryStackMap) {
        this.name = name;
        this.vehicles = vehicles;
        this.salaryStackMap = salaryStackMap;
        List<TwoWheeler> twoWheelersList = new ArrayList<TwoWheeler>();
        List<FourWheeler> fourWheelersList = new ArrayList<FourWheeler>();
        vehicles.stream().forEach(vehicle -> {
            if(vehicle instanceof TwoWheeler) {
                twoWheelersList.add((TwoWheeler) vehicle);
            } else if (vehicle instanceof FourWheeler) {
                fourWheelersList.add((FourWheeler) vehicle);
            }
        });
        this.twoWheelers = twoWheelersList;
        this.fourWheelers = fourWheelersList;
    }

    public Individual(String name, List<Vehicle> vehicles) {
        this.name = name;
//        this.vehicles = vehicles;
        List<TwoWheeler> twoWheelersList = new ArrayList<TwoWheeler>();
        List<FourWheeler> fourWheelersList = new ArrayList<FourWheeler>();
        vehicles.stream().forEach(vehicle -> {
            if(vehicle instanceof TwoWheeler) {
                twoWheelersList.add((TwoWheeler) vehicle);
            } else if (vehicle instanceof FourWheeler) {
                fourWheelersList.add((FourWheeler) vehicle);
            }
        });
        this.twoWheelers = twoWheelersList;
        this.fourWheelers = fourWheelersList;
    }
}
