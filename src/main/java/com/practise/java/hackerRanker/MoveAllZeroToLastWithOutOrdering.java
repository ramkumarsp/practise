package com.practise.java.hackerRanker;

import java.util.Arrays;
import java.util.stream.Collectors;

public class MoveAllZeroToLastWithOutOrdering {
    public static void main(String[] args) {
        int[] ints = new MoveAllZeroToLastWithOutOrdering().moveAllZeroToLast(new int[]{1, 2, 0, 4, 3, 0, 5, 0});
        System.out.println(Arrays.stream(ints).boxed().collect(Collectors.toList()));
    }

    private int[] moveAllZeroToLast(int[] ints) {
        int j = ints.length - 1;
        for (int i = 0; i < ints.length - 1; ) {
            if (ints[i] == 0) {
                if (ints[j] != 0) {
                    swap(ints, j, i);
                } else {
                    --j;
                }
            } else {
                ++i;
            }
            if (i == j) {
                break;
            }
        }
        return ints;
    }

    private void swap(int[] ints, int j, int i) {
        ints[j] = ints[i] + ints[j];
        ints[i] = ints[j] - ints[i];
        ints[j] = ints[j] - ints[i];
    }
}
