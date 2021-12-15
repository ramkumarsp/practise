package com.learning.java.interview.nokia;

public class HighestInArray {
    public static void main(String[] args) {
        int[] array = {30,30,2,4,6,8,25,9};
        int hignest = 0;
        int highestMinusOne = 0;
        for(int i =0; i < array.length; i++) {
            int value = array[i];
            if(value > hignest) {
                highestMinusOne = hignest;
                hignest = value;
            } else if(value > highestMinusOne) {
                highestMinusOne = value;
            }
        }
        System.out.println(highestMinusOne+" "+hignest);
    }
}
