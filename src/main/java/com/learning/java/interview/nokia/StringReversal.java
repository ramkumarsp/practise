package com.learning.java.interview.nokia;

import java.util.Arrays;
import java.util.StringJoiner;

public class StringReversal {
    public static void main(String[] args) {
        String string = "reversal";
        String[] split = string.split("");
        int length = string.length();
        for(int i = 0; i < length; i++) {
            String a = split[i];
            String b = split[length - 1 - i];
            split[i] = b;
            split[length-1-i] = a;
        }

        StringJoiner sj = new StringJoiner("");
        Arrays.stream(split).forEachOrdered(sj::add);
        System.out.println(sj.toString());
    }

//    01234567
//    reversal
}
