package com.interview.capegemini;

import org.apache.logging.log4j.util.PropertySource;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class largestMaximumNumberofOccuranceOfANumberInList {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(1, 2, 2, 3, 4,2, 3, 3);

        Map<Integer, Long> collect1 = integerList.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(collect1);

        Comparator<Map.Entry<Integer, Long>> comparator = Map.Entry.<Integer, Long>comparingByValue(Comparator.reverseOrder()).thenComparing(Map.Entry.comparingByKey(Comparator.reverseOrder()));
        List<Map.Entry<Integer, Long>> collect2 = collect1.entrySet().stream().sorted(comparator).collect(Collectors.toList());
        System.out.println(collect2);
//        Optional<Map.Entry<Integer, Long>> collect3 = collect1.entrySet().stream().collect( Collections.frequency()
//                Collectors.maxBy(comparator)
//        );ss
//        System.out.println(collect3.get());

//        collect1.entrySet().stream()


        Map<Integer, List<Integer>> integerListMap = integerList.stream().collect(Collectors.groupingBy(Function.identity()));

        Map<Integer, Integer> collect = integerListMap.entrySet().stream().collect(Collectors.toMap(e -> e.getKey(), e -> e.getValue().size()));


        //check this once
//        AtomicInteger

        collect.entrySet().stream().forEach(e -> {

        });


    }
}
