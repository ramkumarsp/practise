package com.learning.java.pojo;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SalaryStack {
    @NonNull
    private String name;
    @NonNull
    private int salary;
}
