package com.practise.java.hackerRanker;

import java.util.PriorityQueue;

public class FindingNthLargestElementInArray {
    public static void main(String[] args) {
        System.out.println(new FindingNthLargestElementInArray().nthLargestElementInArray(2));
    }

    private Integer nthLargestElementInArray(int k) {
        int ints[] = {5,10,15,20,25,30,200,35,400,45,3,50,55,60,65,70,75,80,85,90,95,100};
        PriorityQueue<Integer> integerPriorityQueue = new PriorityQueue<Integer>();

        for (int i = 0; i < ints.length; i++) {
            integerPriorityQueue.add(ints[i]);
            if (integerPriorityQueue.size() > k) {
                integerPriorityQueue.poll();
            }
        }


        return integerPriorityQueue.peek();
    }
}
