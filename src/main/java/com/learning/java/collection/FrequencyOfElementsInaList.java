package com.learning.java.collection;

import java.util.*;

public class FrequencyOfElementsInaList {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 3, 4, 5, 3, 2, 2, 4, 2);
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        list.stream()
                .distinct()
                .forEach(element -> frequencyMap.put(element, Collections.frequency(list, element)));
        System.out.println(frequencyMap);
    }
}
