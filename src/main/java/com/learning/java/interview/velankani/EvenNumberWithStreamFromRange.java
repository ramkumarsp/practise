package com.learning.java.interview.velankani;

import java.util.stream.IntStream;

public class EvenNumberWithStreamFromRange {
    public static void main(String[] args) {
        Integer start = Integer.valueOf(args[0]);
        Integer end = Integer.valueOf(args[1]);
        IntStream.rangeClosed(start, end).filter(i -> i % 2 == 0)
                .forEachOrdered(System.out::println);
    }
}
