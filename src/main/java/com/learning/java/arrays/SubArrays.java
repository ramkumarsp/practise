package com.learning.java.arrays;

import java.util.Arrays;

public class SubArrays {
    public static void main(String[] args) {
        int[] array = {2,4,5,3,1,6};
        Arrays.stream(array).forEach(System.out::print);
        System.out.println();
        int[] ints = Arrays.copyOfRange(array, 0, 6);
        Arrays.stream(ints).forEach(System.out::print);
        System.out.println();
        Arrays.sort(array);
        Arrays.stream(array).forEach(System.out::print);
        int d=9;
//        int ceil = Double.intValue(Math.ceil(9 / 2));
//        Math.ceil(9 / 2).intValue();

    }
}
