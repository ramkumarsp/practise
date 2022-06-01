package com.learning.daily.coding.problem;

import com.learning.java.eight.stream.IntStreamFill;

import java.util.Arrays;
import java.util.stream.IntStream;

public class PerfectNumberSumsUpto10 {
    //A number is considered perfect if its digits sum up to exactly 10.
    //Given a positive integer n, return the n-th perfect number.
    //For example, given 1, you should return 19. Given 2, you should return 28.
    public static void main(String[] args) {
        IntStream.rangeClosed(1, 200).forEach(n -> {
            int number = n;
            int sum = 0;
            while (n > 0) {
                sum += n % 10;
                n = n / 10;
            }
            int result = 0;
            if(sum == 10) {
                int difference = 10 - sum;
                result =
                        //number > 9 ? number + difference :
                        (number * 10) + difference;
            } else {
                result = number;
            }
            System.out.println(number + " -> " + result);
        });
    }
}
