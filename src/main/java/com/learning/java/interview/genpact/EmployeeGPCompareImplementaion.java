package com.learning.java.interview.genpact;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EmployeeGPCompareImplementaion {
    public static void main(String[] args) {
        List<EmployeeGP> employeeGPList = new ArrayList<>();
//        Arrays.asList(new EmployeeGP(1,"durgesh",1000000.00D),new EmployeeGP(2,"mani",30000.00D))


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

        Map<String, List<EmployeeGP>> collect1 = employeeGPList.stream()
                .collect(Collectors.groupingBy(EmployeeGP::getName));

        Map<Integer, String> collectedMap = employeeGPList.stream()
                .collect(Collectors.toMap(EmployeeGP::getId, EmployeeGP::getName));

        List<Map.Entry<Integer, String>> collect = collectedMap.entrySet().stream().collect(Collectors.toList());

    }
}
