package com.learning.designPatterns.singleton;

public class MySingltonTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        MySingleton instance = MySingleton.getInstance();
        MySingleton instance1 = MySingleton.getInstance();

        //Will allow cloning but return same pattern
        instance.clone();
    }
}
