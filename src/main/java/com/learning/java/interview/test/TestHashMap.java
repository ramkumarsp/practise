package com.learning.java.interview.test;

import java.util.HashMap;

class EmployeeTest {
    private String name;

    public EmployeeTest(String name) {
        this.name = name;
    }

    @Override
    public int hashCode() {
        return 1;
    }
}

public class TestHashMap {
    public static void main(String[] args) {
        HashMap<EmployeeTest, String> hashMap = new HashMap<EmployeeTest, String>();
        hashMap.put(new EmployeeTest("a"), "e1");
        hashMap.put(new EmployeeTest("b"), "e2");
        hashMap.put(new EmployeeTest("a"), "e1o");
        System.out.println(hashMap.size());
        System.out.println(hashMap.get(new EmployeeTest("a")));
    }
}

