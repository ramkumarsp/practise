package com.practise.java.interview.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ArrayListTest1 {
    public static void main(String[] args) {
//        List<String> arrayList = new ArrayList<String>();
//        arrayList.add("a");
//        arrayList.add("b");
//        arrayList.add("a");
//        arrayList.add("C");
//        ListIterator<String> listIterator = arrayList.listIterator();
//        while (listIterator.hasNext()) {
//            System.out.println(listIterator.next());
//            listIterator.previous();
//        }

//        System.out.println(arrayList.size());
//        System.out.println(arrayList.get(0));
//        System.out.println(arrayList.get(1));
//        System.out.println(arrayList.get(2));
        List<Integer> arrayList = Arrays.asList(1,1,1,2);
        System.out.println(arrayList);
        List<Integer> collect = arrayList.stream().distinct().collect(Collectors.toList());
        System.out.println(collect);
        AtomicInteger count = new AtomicInteger(0);
        IntStream.range(0, collect.size()).forEach(a -> {
            IntStream.range(a, collect.size()).forEach(b -> {
//                count.inc
            });
        });
    }
}
