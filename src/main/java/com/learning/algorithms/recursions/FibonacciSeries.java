package com.learning.algorithms.recursions;

import java.util.Arrays;

public class FibonacciSeries {
    public static void main(String[] args) {
        System.out.println(new FibonacciSeries().fibonacciUsingLoop(200));
        System.out.println(new FibonacciSeries().fibonacciUsingRecursion(200));
        int n = 200;
        int[] fArray = new int[n + 1];
        Arrays.fill(fArray, -1);
        System.out.println(new FibonacciSeries().fibonacciUsingRecursionMemoization(fArray, n));
    }

    private int fibonacciUsingRecursionMemoization(int[] fArray, int n) {
        if (n < 2) {
            fArray[n] = n;
            return n;
        } else {
            if (fArray[n - 2] == -1) {
                fArray[n - 2] = fibonacciUsingRecursionMemoization(fArray, n - 2);
            }
            if (fArray[n - 1] == -1) {
                fArray[n - 1] = fibonacciUsingRecursionMemoization(fArray, n - 1);
            }
            return fArray[n - 2] + fArray[n - 1];
        }
    }

    private int fibonacciUsingRecursion(int n) {
        if (n < 2) {
            return n;
        } else {
            return fibonacciUsingRecursion(n - 2) + fibonacciUsingRecursion(n - 1);
        }
    }

    private int fibonacciUsingLoop(int n) {
        int nMinus2 = 0, nMinus1 = 1, f = 0;
        if (n < 2) {
            f = n;
        }
        for (int i = 2; i <= n; i++) {
            f = nMinus1 + nMinus2;
            nMinus2 = nMinus1;
            nMinus1 = f;
        }
        return f;
    }
}
