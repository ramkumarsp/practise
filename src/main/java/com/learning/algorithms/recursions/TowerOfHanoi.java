package com.learning.algorithms.recursions;

import java.util.StringJoiner;

public class TowerOfHanoi {
    public static void main(String[] args) {
        towerOfHannoi(3, 1, 2, 3);
    }

    private static void towerOfHannoi(int n, int a, int b, int c) {
        if (n > 0) {
            towerOfHannoi(n - 1, a, c, b);
            System.out.println("[" + a + ", " + c + "]");
            towerOfHannoi(n - 1, b, a, c);
        }
    }
}
