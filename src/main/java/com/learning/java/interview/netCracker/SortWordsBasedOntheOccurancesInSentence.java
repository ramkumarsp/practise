package com.learning.java.interview.netCracker;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class SortWordsBasedOntheOccurancesInSentence {
    public static void main(String[] args) {
        String line = "XYZ is XYZ employee of ABC is company, XYZ is from blore, XYZ has good exp in is java.";

        Map<String, Integer> wordMap = new HashMap<String, Integer>();
        String[] s = line.split(" ");
        Arrays.asList(s).stream().forEach(string -> {
            int value = 1;
            if(wordMap.containsKey(string)) {
                wordMap.put(string, (wordMap.get(string) + value));
            }
            else {
                wordMap.put(string, value);
            }
        });
        System.out.println(wordMap);
        LinkedHashMap<String, Integer> ascOrder = wordMap.entrySet().stream().sorted(Map.Entry.comparingByValue()).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e2, LinkedHashMap::new));
        System.out.println(ascOrder);
        System.out.println(ascOrder.size());
//        LinkedHashMap<String, Integer> descOrder = wordMap.entrySet().stream().sorted(Collections.reverseOrder(Map.Entry.comparingByValue())).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e2, LinkedHashMap::new));
//        System.out.println(descOrder);
        LinkedHashMap<String, Integer> ascWorking = wordMap.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e2, LinkedHashMap::new));
        System.out.println(ascWorking);
        System.out.println(ascWorking.keySet());
        System.out.println(wordMap.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).collect(Collectors.toList()));


        Map<String, List<String>> collect = Arrays.asList(s).stream().collect(Collectors.groupingBy(Function.identity()));
        System.out.println(collect);
    }
}
