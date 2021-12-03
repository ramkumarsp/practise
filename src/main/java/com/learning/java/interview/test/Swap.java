package com.practise.java.interview.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Swap {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        List<Integer> integers = new ArrayList<>();
        integers.add(10);
        integers.add(20);
//        System.out.println(a + " " + b);
        swap(a, b, integers);
        //same value as java is pass by value always
//        System.out.println(a + " " + b);
        integers.stream().forEach(i -> System.out.println("that"+i));
    }

    private static void swap(int a, int b, List<Integer> integers) {
//        int temp = a;
//        a = b;
//        b = temp;
        integers.add(30);
        integers = new ArrayList<>();
        System.out.println("check" + integers);
        integers.stream().forEach(i -> System.out.println("this"+i));
        b = a + b;
        a = b - a;
        b = b - a;
//        System.out.println(a + " " + b);
    }

}
