package com.interview;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

import javax.management.DescriptorKey;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

@Data
@AllArgsConstructor
@NoArgsConstructor
class PEmployee {
    private String id;
    private String name;
    private Double salary;

}

public class Prodapt {
    public static void main(String[] args) {
        List<PEmployee> employees = new ArrayList<>();

//        1. sal < 50K
//        2. sort based Employuee NAme desc
//        3. convertr in to map k-> employee id v-> PEmployee
        int salaryThreshold = 50000;
        employees.stream().filter(pEmployee -> pEmployee.getSalary() < salaryThreshold)
                .sorted(Comparator.comparing(PEmployee::getName).reversed())
                .collect(Collectors.toMap(PEmployee::getId, Function.identity(), (e1, e2) -> e2));
    }



//    Student
//
//            @Id
//    id
//        @ManyToOne(Department.deptId)
//    depdID
//
//    Department
//                @Id
//                @OneToMany(Student.deptID)
//            deptId
//    deptName



//                        cascade types in hibernate
//    pagination in the JPA

}
