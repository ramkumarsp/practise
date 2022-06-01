package com.learning.java.hackerRanker;

import java.math.BigInteger;
import java.util.Scanner;

public class BigIntegerSumAndMultiplocationWithOutLeadingZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger one = new BigInteger(sc.next());
        BigInteger two = new BigInteger(sc.next());
        System.out.println(one.add(two));
        System.out.println(one.multiply(two));
    }
}
