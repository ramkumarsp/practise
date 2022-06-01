package com.interview.cognizant;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.*;

@NoArgsConstructor
@AllArgsConstructor
@Data
class EmployeeCTS {
    private String name;
    private int age;
    private Double salary;
}


public class StreamsImplementationEmployees {
    public static void main(String[] args) {
        Map<String, List<EmployeeCTS>> countryEmployeesMap = new HashMap<>();
        List<EmployeeCTS> employeesInIndia = countryEmployeesMap.entrySet().stream()
                .filter(entry -> entry.getKey().equals("INDIA"))
                .map(entry -> entry.getValue()).findFirst().orElse(Collections.emptyList());

//        employeesInIndia.stream().filter()

        Optional<Double> reduce = employeesInIndia.stream().map(EmployeeCTS::getSalary).reduce((s1, s2) -> s1 + s2);
//        Atomic
//        employeesInIndia.stream().map(EmployeeCTS::getSalary).


        //find duplicate entries in table with their count
        


    }
}
