package com.practise.java.collection;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class CollectionConversions {
    public static void main(String[] args) {
        int[] intArray = {1,2,3,4,5};
        //Array to list
        List<Integer> integerList = Arrays.stream(intArray).boxed().collect(Collectors.toList());
        //List to Array
        int[] ints = integerList.stream().mapToInt(Integer::intValue).toArray();
        //SummaryStatistics
        IntSummaryStatistics intSummaryStatistics = integerList.stream().mapToInt(Integer::intValue).summaryStatistics();
        System.out.println(intSummaryStatistics);
    }
}
