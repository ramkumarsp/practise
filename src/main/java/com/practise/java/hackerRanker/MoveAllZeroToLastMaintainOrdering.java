package com.practise.java.hackerRanker;

import java.util.Arrays;
import java.util.stream.Collectors;

public class MoveAllZeroToLastMaintainOrdering {
    public static void main(String[] args) {
        int[] ints = new MoveAllZeroToLastMaintainOrdering().moveAllZeroToLast(new int[]{1, 2, 0, 4, 3, 0, 5, 0});
        System.out.println(Arrays.stream(ints).boxed().collect(Collectors.toList()));
    }

    private int[] moveAllZeroToLast(int[] ints) {
        for (int i = 0; i < ints.length - 1; ) {
            int j = i + 1;
            if (ints[i] == 0) {
                if (ints[j] != 0) {
                    swap(ints, j, i);
                } else {
                    while (ints[j] == 0 && j < ints.length - 1) {
                        ++j;
                    }
                    swap(ints, i, j);
                    ++i;
                }
            } else {
                ++i;
            }
        }
        return ints;
    }

    private void handleDoubleZeros(int[] ints, int i, int j) {
        if (ints[j] != 0) {
            swap(ints, j, i);
        } else {
            ++j;
        }
        if (j == ints.length - 1) {
            return;
        }
    }

    private void swap(int[] ints, int j, int i) {
        ints[j] = ints[i] + ints[j];
        ints[i] = ints[j] - ints[i];
        ints[j] = ints[j] - ints[i];
    }
}
