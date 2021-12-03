package com.practise.java.interview.test;

public class StringEquality {
    public static void main(String[] args) {
        String s = "Test";
        String s2 = new String("Test").intern();
        String s3 = new String("Test");
        System.out.println(s == s2);
        System.out.println(s==s3);
        System.out.println(s2==s3);
        System.out.println(s2!=s3);
    }
}
