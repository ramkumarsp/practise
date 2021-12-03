package com.learning.java.data.conversion;

import java.util.Arrays;

public class DataConvertor {
    public static void main(String[] args) {
        String s = "ONE_TERM_ee";
        String s1 = Arrays.asList(s.split("_")).stream().reduce((first, second) -> second).orElse(null);
        System.out.println(s1);
        System.out.println("asd".matches("\\d+"));
        System.out.println(Integer.parseInt(s1));
        System.out.println(Integer.valueOf(s1));
    }
}
