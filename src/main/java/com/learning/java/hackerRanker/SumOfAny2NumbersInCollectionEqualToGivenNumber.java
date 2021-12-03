package com.learning.java.hackerRanker;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;

public class SumOfAny2NumbersInCollectionEqualToGivenNumber {
    public static void main(String[] args) {
//        List<Integer> integers = Arrays.asList(10, 15, 3, 7);
        int sumValue = 25;
//        Collections.sort(integers);
//        System.out.println(checkIfSumOfTwoNumbersAreEualToGovenNumber_withoutConsideringComplexity(integers, sumValue));

        int[] integerArray = new int[]{2,5,8,9, 4};
//                {0, -1, 2, -3, 1};
//                {-20, -3, 10, 15, 0, 1, 3, 7, 17, 20}; // -8 -5 -2 1 7 10 15 19 40 3283 292
        Arrays.sort(integerArray);

        checkIfSumOfTwoNumbersAreEualToGovenNumber(sumValue, integerArray, 0, integerArray.length - 1);


    }

    private static void checkIfSumOfTwoNumbersAreEualToGovenNumber(int sumValue, int[] integerArray, int start, int end) {
        if(start == end) {
            System.out.println(start+" reached "+end);
            return;
        }
        if (sumValue == integerArray[start] + integerArray[end]) {
            System.out.println(integerArray[start] + " " + integerArray[end]);
        } else if (sumValue < integerArray[start] + integerArray[end]) {
            checkIfSumOfTwoNumbersAreEualToGovenNumber(sumValue, integerArray, start, end - 1);
        } else {
            checkIfSumOfTwoNumbersAreEualToGovenNumber(sumValue, integerArray, start + 1, end);
        }
    }

    private static boolean checkIfSumOfTwoNumbersAreEualToGovenNumber_withoutConsideringComplexity(List<Integer> integers, int k) {
        AtomicInteger countOfSumOf2IntegersEqualTok = new AtomicInteger(0);
        IntStream.range(0, integers.size()).forEachOrdered(i -> {
            if (integers.contains(k - integers.get(i))) {
                countOfSumOf2IntegersEqualTok.incrementAndGet();
            } else {
                System.out.println("i -> " + i + " integers[i] -> " + integers.get(i));
            }
        });
        return countOfSumOf2IntegersEqualTok.get() > 0 ? true : false;
    }
}
