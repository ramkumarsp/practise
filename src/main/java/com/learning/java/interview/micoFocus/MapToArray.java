package com.learning.java.interview.micoFocus;

import java.util.HashMap;
import java.util.Map;

public class MapToArray {
    public static void main(String[] args) {
        Map<Integer, Integer> integerIntegerMap = new HashMap<Integer, Integer>();
        integerIntegerMap.put(1,1);
        integerIntegerMap.put(2,2);
        integerIntegerMap.put(3,3);
        integerIntegerMap.put(4,4);
        int[] ints = integerIntegerMap.entrySet().stream()
                .map(entry -> entry.getKey() + entry.getValue())
                .mapToInt(Integer::intValue).toArray();
        printArray(ints);
    }

    private static void printArray(int[] ints) {
        int i = 0;
        printArrayElement(ints, ints.length, 0);
    }

    private static void printArrayElement(int[] ints, int l, int i) {
if(i < ints.length) {
    System.out.println(ints[i]);
    printArrayElement(ints, ints.length, i--);}
else { return;}

    }

}
