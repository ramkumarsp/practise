package com.learning.algorithms.search;

public class binarySearch {
    public static void main(String[] args) {
        int a[] = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int searchElement = 0;
        System.out.println(binarySearch(a, searchElement, 0, a.length - 1));
    }

    private static int binarySearch(int[] a, int searchElement, int firstIndex, int lastIndex) {
        int median = ((lastIndex - firstIndex) / 2); //2 -> 3 ?
//        int median = ((lastIndex-firstIndex)/2) <= a.length ? ((lastIndex-firstIndex)/2)+firstIndex : ((lastIndex-firstIndex)/2);
        median+=firstIndex;
        if (a[median] == searchElement) {
            return median;
        } else if (a[median] > searchElement) {
            return binarySearch(a, searchElement, firstIndex, median - 1);
        } else {
            return binarySearch(a, searchElement, median + 1, lastIndex);
        }
    }

}
