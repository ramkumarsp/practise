package com.practise.java.interview.gp;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeGP
//        implements Comparable<EmployeeGP>
{
    private Integer id;
    private String name;
    private double salary;

//    @Override
//    public int compareTo(EmployeeGP o) {
//        return 0;
//    }
}
