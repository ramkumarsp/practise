package com.learning.algorithms.recursions;

public class PowerUsingLoopsAndRecursion {
    public static void main(String[] args) {
        System.out.println(new PowerUsingLoopsAndRecursion().powerUsingLoop(5, 3));
        System.out.println(new PowerUsingLoopsAndRecursion().powerUsingRecursion(5, 3));
//        System.out.println(new PowerUsingLoopsAndRecursion().powerUsingLoopAndMath(5, 3));
        System.out.println(new PowerUsingLoopsAndRecursion().powerUsingRecursionAndMath(5, 3));
    }

    //dono how to do
    //m^n = m^(n/2) * m^(n/2) = m^(n/4) * m^(n/4)
//    private int powerUsingLoopAndMath(int m, int n) {
//        int powerValue = 1;
//        for(int i = n; i <= 1; i--) {
//            int same = (m * m) * (n / 2);
//            int temp = (n % 2 == 0) ? same : m*same;
//
////            if (n % 2 == 0) {
////                powerValue = (m*m)*(n/2);
////            } else {
////                return m * powerUsingLoopAndMath(m * m, (n-1) / 2);
////            }
//        }
//        return powerValue;
//    }

    private int powerUsingRecursionAndMath(int m, int n) {
        if (n == 0) {
            return 1;
        } else if (n % 2 == 0) {
            return powerUsingRecursionAndMath(m * m, n / 2);
        } else {
            return m * powerUsingRecursionAndMath(m * m, (n-1) / 2);
        }
    }

    private int powerUsingRecursion(int m, int n) {
        if (n == 0) {
            return 1;
        } else {
            return powerUsingRecursion(m, n - 1) * m;
        }
    }

    private int powerUsingLoop(int m, int n) {
        int powerValue = 1;
        for (int i = 1; i <= n; i++) {
            powerValue = powerValue * m;
        }
        return powerValue;
    }
}
