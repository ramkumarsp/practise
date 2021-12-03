package com.learning.java.interview.mindTree20112021;

public class CoreJavaProblemStatement {
    public static void main(String[] args) {

        String s = "MindMindTrakeeMind";
        String[] split = s.split("");





        //Given an int[] = {1,4,0,0,2,0} and Move all zero's to end of Array
        int[] array = {1, 4, 0, 0, 2, 0, 3};
        int zeroIndex = 0;
        int nonZeroIndex = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                zeroIndex = i;
                for (int j = i + 1; j < array.length; j++) {
                    if (array[j] != 0) {
                        nonZeroIndex = j;
                        break;
                    }
                }
                array[zeroIndex] = array[nonZeroIndex];
                array[nonZeroIndex] = 0;
//                swap(array, zeroIndex, nonZeroIndex);
            }
        }
        System.out.print("After ");
        for(int ar : array) {
            System.out.print(ar+" ");
        }
    }

    private static void swap(int[] array, int zeroIndex, int nonZeroIndex) {
        array[zeroIndex] = array[nonZeroIndex];
        array[nonZeroIndex] = 0;
//        array[nonZeroIndex] = array[zeroIndex] + array[nonZeroIndex];
//        array[zeroIndex] = array[nonZeroIndex] - array[zeroIndex];
//        array[nonZeroIndex] = array[nonZeroIndex] - array[zeroIndex];
    }
}
