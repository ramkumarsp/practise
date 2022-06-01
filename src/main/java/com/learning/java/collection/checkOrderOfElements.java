package com.learning.java.collection;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class checkOrderOfElements {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("23579");
        list.add("79631");
        list.add("89085");
        list.add("09755");
        list.add("89084");
        list.add("47786");
        list.add("83579");
        list.add("67886");
        list.add("95676");
        System.out.println(list);
        List<String> collect = list.stream().filter(s -> s.equals("89084") || s.equals("89085")).sorted(Comparator.comparing(Function.identity())).collect(Collectors.toList());
        System.out.println(list);
        System.out.println(collect);
        list.removeIf(s -> collect.stream().anyMatch(i -> s.equals(i)));
        System.out.println(list);
//        collect.stream().forEachOrdered(i -> list.add(i));
        collect.stream().forEachOrdered(i -> list.add(list.size(),i));
        System.out.println(list);

    }
}
