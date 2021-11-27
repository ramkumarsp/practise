package com.practise.java.interview.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class AtomicCollectionPossibility {
    public static void main(String[] args) {
        AtomicIntegerArray atomicIntegerArray = new AtomicIntegerArray(new int[8]);
        AtomicInteger a = new AtomicInteger(0);
//        a.compareAndSet()
        int i = a.get();
//        atomicIntegerArray,,
        List<Integer> f = Arrays.asList(-1,-9,-7,5,6,2,0);
//        int[] A = new int [N];
//        Arrays.stream(A).sorted().collect(Collectors.toList());
        List<Integer> collect = f.stream().sorted().collect(Collectors.toList());
        Integer integer = f.stream().sorted().findFirst().orElse(0);
//        System.out.print(integer);
        integer.intValue();

        int[] ints = new int[5];
        ints[0] = 1;
        ints[1] = 2;
        ints[2] = 3;
        ints[3] = 4;
        ints[4] = 5;
        ints[5] = 6;

//        Arrays.stream(ints).sorted().
//        ArrayList<Integer> integers = new ArrayList<Integer>(ints);
//        List<int[]> sorted = Arrays.stream(ints).stream().flatMap(k -> Arrays.asList(k)).stream().sorted().collect(Collectors.toList());
//        System.out.println(Math.ceil(IntStream.rangeClosed(1,6).count())/2);
//        Integer o = 3;
//        o.
    }
}
