package com.learning.java.interview.test;

public class Return {
    public static void main(String[] args) {
        try {
            return;
        } catch (Exception e) {
            return;
        } finally {
            System.out.println("finally");
        }
    }
}
