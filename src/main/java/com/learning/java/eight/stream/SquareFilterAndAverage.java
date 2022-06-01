package com.learning.java.eight.stream;

import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SquareFilterAndAverage {
    public static void main(String[] args) {
        Integer[] arr = new Integer[]{100, 24, 13, 44, 114, 200, 40, 112};
        //square them and filter the numbers which are greater 10000 and then find average of them
        OptionalDouble average = Arrays.stream(arr).mapToInt(i -> i * i).filter(i -> i > 10000).average();
        System.out.println(average);
        int[] array = {2,4,5,3,1,6};
    }


}
