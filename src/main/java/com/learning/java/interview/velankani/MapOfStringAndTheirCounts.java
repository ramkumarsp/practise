package com.learning.java.interview.velankani;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MapOfStringAndTheirCounts {
    public static void main(String[] args) {
//        "AA", "BB" ,"CC", "DD", "AA"

        List<String> strings = Arrays.asList("AA", "BB", "CC", "DD", "AA");

        Map<String, Integer> mapOfStringAndTheirCounts = strings.stream().collect(Collectors.groupingBy(Function.identity())).entrySet().stream().collect(Collectors.toMap(e -> e.getKey(), e -> e.getValue().size()));

        Map<String, Long> collect = strings.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        mapOfStringAndTheirCounts.entrySet().stream().forEach(entry -> {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + " " + entry.getValue());
            } else {
                System.out.println(entry.getKey());
            }
        });

    }
}
