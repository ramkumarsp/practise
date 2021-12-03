package com.learning.java.sort;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Human {
    private String name;
    private int age;

    public static int compareByNameThenAge(Human h1, Human h2) {
        if (h1.name.equalsIgnoreCase(h2.name)) {
            return h1.age - h2.age;
        } else {
            return h1.name.compareTo(h2.name);
        }
    }
}
