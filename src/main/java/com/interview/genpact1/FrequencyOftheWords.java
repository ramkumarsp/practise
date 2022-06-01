package com.interview.genpact1;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequencyOftheWords {
    public static void main(String[] args) {
        String line = "the name is vi and he is the person";
//        String line = "the name vi and he person";
        List<String> stringList = Arrays.asList(line.split(" "));
        Map<String, Long> collect = stringList.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        //check on this
//        method 1
        HashMap<String, Long> collect1 = collect.entrySet().stream()
                .sorted(Map.Entry.<String, Long>comparingByValue(Collections.reverseOrder())
                        .thenComparing(Map.Entry.comparingByKey()))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (o1, o2) -> o2, LinkedHashMap::new));
        System.out.println(collect1);

//        method 2
        LinkedHashMap<String, Long> collect2 = collect.entrySet().stream()
                .sorted((e1, e2) -> {
                    if (e1.getValue() == e2.getValue()) {
                        return e1.getKey().compareTo(e2.getKey());
                    } else {
                        return e2.getValue().compareTo(e1.getValue());
                    }
                }).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e2, LinkedHashMap::new));

        System.out.println(collect2);

    }
//    employee and department table
//    id name dept Id
//    deptId and dept name
//    select d.deptName, count(e.deptID) from employee e right join department d ON deptId group by e.deptId;
}
