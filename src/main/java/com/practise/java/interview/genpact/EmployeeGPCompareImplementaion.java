package com.practise.java.interview.genpact;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class EmployeeGPCompareImplementaion {
    public static void main(String[] args) {
        List<EmployeeGP> employeeGPList = new ArrayList<>();

        List<EmployeeGP> salarySortedEmployee = employeeGPList.stream()
                .sorted(Comparator.comparingDouble(EmployeeGP::getSalary))
                .collect(Collectors.toList());
        List<EmployeeGP> salaryReverseSorterEmployee = employeeGPList.stream()
                .sorted(Comparator.comparingDouble(EmployeeGP::getSalary).reversed())
                .collect(Collectors.toList());
        double K30K = 30000.00D;
        EmployeeGP employeeGP1 = employeeGPList.stream()
                .filter(employeeGP -> employeeGP.getSalary() == K30K)
                .findFirst()
                .orElse(null);

        Optional<EmployeeGP> first30KEmployee = employeeGPList.stream()
                .filter(employeeGP -> employeeGP.getSalary() == K30K)
                .findFirst();
        if (first30KEmployee.isPresent()) {
            System.out.print(first30KEmployee.get());
        }

    }
}
