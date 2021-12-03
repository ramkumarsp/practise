package com.learning.algorithms.recursions;

//Taylor series => e^x = 1 + (x/1) + (x^2/2!) + (x^3/3!) + ......
public class TaylorSeries {
    static double p = 1, f = 1;
    static double s = 1;

    public static void main(String[] args) {
        System.out.println(new TaylorSeries().taylorSeriesUsingRecursion(1, 10));
        System.out.println(new TaylorSeries().taylorSeriesUsingHornersRuleUsingLoop(1, 10));
        System.out.println(new TaylorSeries().taylorSeriesUsingHornersRuleUsingRecursion(1, 10));
    }

    private double taylorSeriesUsingHornersRuleUsingRecursion(double x, double n) {
        if (n == 0) {
            return s;
        } else {
            s = 1 + ((x / n) * s);
            return taylorSeriesUsingHornersRuleUsingRecursion(x, n - 1);
        }
    }

    private double taylorSeriesUsingHornersRuleUsingLoop(double x, double n) {
        double sum = 1;
        for (; n > 0; n--) {
            sum = 1 + sum * (x / n);
        }
        return sum;
    }

    private double taylorSeriesUsingRecursion(int x, int n) {
        double r;
        if (n == 0) {
            return 1;
        } else {
            r = taylorSeriesUsingRecursion(x, n - 1);
            p = p * x;
            f = f * n;
            return (r + (p / f));
        }
    }
}
