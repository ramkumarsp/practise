package com.practise.java.interview.mind;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class InterviewCodingMindTree {
    public static void main(String[] args) {
        List<Emp> employees = new ArrayList<Emp>();
//        List<String> employeePhoneNumbers = employees.stream().map(Emp::getPhoneNumber).collect(Collectors.toList());
        List<String> phoneNumbers = employees.stream().flatMap(emp -> emp.getPhoneNumber().stream()).collect(Collectors.toList());
    }
}
