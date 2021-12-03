package com.learning.algorithms.recursions;

public class FactorialUsingLoopsAndRecursion {
    public static void main(String[] args) {
        System.out.println(new FactorialUsingLoopsAndRecursion().factorialUsingLoop(5));
        System.out.println(new FactorialUsingLoopsAndRecursion().factorialUsingRecursion(4));
    }

    private int factorialUsingRecursion(int n) {
        if (n < 1) {
            return 1;
        } else {
            return factorialUsingRecursion(n - 1) * n;
        }


    }

    private int factorialUsingLoop(int n) {
        int factorialValue = 1;
        for (int i = 1; i <= n; i++) {
            factorialValue = factorialValue * i;
        }
        return factorialValue;
    }
}
