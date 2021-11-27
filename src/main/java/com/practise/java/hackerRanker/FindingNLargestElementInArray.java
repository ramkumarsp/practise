package com.practise.java.hackerRanker;

import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;
import java.util.stream.Collectors;

public class FindingNLargestElementInArray {
    public static void main(String[] args) {
        System.out.println(new FindingNLargestElementInArray().nthLargestElementInArray(4));
    }

    private PriorityQueue<Integer> nthLargestElementInArray(int k) {
        int ints[] = {5,10,15,20,25,30,200,35,400,45,3,50,55,60,65,70,75,80,85,90,95,100};
        List<Integer> collect = Arrays.stream(ints).boxed().collect(Collectors.toList());
        int[] ints1 = collect.stream().mapToInt(Integer::intValue).toArray();
        PriorityQueue<Integer> integerPriorityQueue = new PriorityQueue<Integer>();

        for(int i = 0; i < ints.length - 1; i++) {
            integerPriorityQueue.add(ints[i]);
            if(integerPriorityQueue.size() > k) {
                integerPriorityQueue.poll();
            }
        }

        return integerPriorityQueue;
    }
}
