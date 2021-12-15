package com.learning.algorithms.recursions;

public class CombinationFormula {
    public static void main(String[] args) {
        System.out.println(new CombinationFormula().combinationUsingFactorial(5, 2));
        //pascal's triangl  e
        System.out.println(new CombinationFormula().combinationUsingRecursion(5, 2));
    }

    private int combinationUsingRecursion(int n, int r) {
        if (r == 0 || n == r) {
            return 1;
        } else {
            return combinationUsingRecursion(n - 1, r - 1) + combinationUsingRecursion(n - 1, r);
        }
    }

    private int combinationUsingFactorial(int n, int r) {
        FactorialUsingLoopsAndRecursion f = new FactorialUsingLoopsAndRecursion();
        int nFactorial = f.factorialUsingLoop(n);
        int rFactorial = f.factorialUsingLoop(r);
        int nMinusRFactorial = f.factorialUsingLoop(n - r);
        return nFactorial / (rFactorial * nMinusRFactorial);
    }
}
