package com.practise.java.interview;

public class TestArrayIndex {

    public static void main(String[] args) {
        try {
            int[] a = new int[5];
            a[5] = 1;
            System.out.println(a[5]);
        } catch (Exception e) {
            System.out.println("1");
//        } catch (ArrayIndexOutOfBoundsException ae) {
//            System.out.println("2");
        }
    }
}
