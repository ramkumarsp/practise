package com.practise.java.collection;

import java.util.HashMap;
import java.util.Map;

public class HashMapCheck {
    public static void main(String[] args) {
        Map<String, Integer> num = new HashMap<>();
        int i = 1;
        num.put(null,i);
        num.put(i+"",2);
        num.put("i", 4);
        System.out.println(num.get(i));
        String name;
    }
}
