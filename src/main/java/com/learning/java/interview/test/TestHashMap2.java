package com.learning.java.interview.test;

import java.util.HashMap;
import java.util.Map;

class EmployeeTest2 {
    String id;

    public EmployeeTest2(String id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        return true;
    }

    @Override
    public int hashCode() {
//        return super.hashCode(); // 2 and 2
        return 1; // 2 and 1
    }
}

public class TestHashMap2 {
    public static void main(String[] args) {
        EmployeeTest2 e1 = new EmployeeTest2("1");
        EmployeeTest2 e2 = new EmployeeTest2("2");
        Map<String, EmployeeTest2> map1 = new HashMap<>();
        map1.put("Aa", e1);
        map1.put("aA", e2);
        Map<EmployeeTest2, String> map2 = new HashMap<>();
        map2.put(e1,"1");
        map2.put(e2,"2");
        System.out.println(map1.size());
        System.out.println(map2.size());
    }
}
