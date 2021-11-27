package com.practise.java.hackerRanker;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;

public class SumOfAny2NumbersInCollectionEqualToGivenNumber {
    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(10, 15, 3, 7);
        int k = 17;
        System.out.println(checkIfSumOfTwoNumbersAreEualToGovenNumber(integers, k));
    }

    private static boolean checkIfSumOfTwoNumbersAreEualToGovenNumber(List<Integer> integers, int k) {
        AtomicInteger countOfSumOf2IntegersEqualTok = new AtomicInteger(0);
        IntStream.range(0, integers.size()).forEachOrdered(i -> {
            if (integers.contains(k - integers.get(i))) {
                countOfSumOf2IntegersEqualTok.incrementAndGet();
            } else {
                System.out.println("i -> " + i + " integers[i] -> " + integers.get(i));
            }
        });
//        System.out.println(countOfSumOf2IntegersEqualTok.get());
        return countOfSumOf2IntegersEqualTok.get() > 0 ? true : false;
    }
}
