package com.learning.java.interview.test;

public class TestThreadNames {
    public static void main(String[] args) {
        Thread t = new Thread(){
            @Override
            public void run(){
                System.out.println(Thread.currentThread().getName());
            }
        };
//        t.run(); //main and main
        t.start();
        System.out.println(Thread.currentThread().getName());
    }
}
