package com.designPatterns.sort;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import java.util.Comparator;

@NoArgsConstructor
@AllArgsConstructor
@Data
@NonNull
public class EmployeeForSortWithoutJava8 implements Comparable {
    private int id;
    private String name;
    private int age;

    @Override
    public int compareTo(Object o) {
        EmployeeForSortWithoutJava8 employee = (EmployeeForSortWithoutJava8) o;
        return this.id - employee.id != 0
                ? this.id - employee.id
                : this.name.compareTo(employee.name);
    }

//    @Override
//    public int compareTo(Object o) {
//        return this.name.compareTo(((EmployeeForSortWithoutJava8) o).name);
//    }
}
