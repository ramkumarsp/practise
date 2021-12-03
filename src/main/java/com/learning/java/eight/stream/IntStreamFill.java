package com.practise.java.eight.stream;

import java.util.Arrays;
import java.util.stream.IntStream;

public class IntStreamFill {
    public static void main(String[] args) {
        //To get the sequence from start(0) to end 3
        IntStream.iterate(0, i -> i +1).limit(3).forEach(System.out::println);
        //To get the sequence from start(0) to end 3-1
        IntStream.range(0,3).forEach(System.out::println);
        //To get the sequence from start(0) to end 3
        IntStream.rangeClosed(0,3).forEach(System.out::println);
        //To get the sequence from start(a) to end (d-1 = c)
        IntStream.range('a', 'd').forEach(i -> System.out.println((char) i));
        //To get the sequence of char in the String from start to end
        Arrays.stream("MIND".split("")).forEach(System.out::println);
        //To get the sequence of char in reverse of the String from start to end
        Arrays.stream(new StringBuffer("MIND").reverse().toString().split("")).forEach(System.out::println);
    }
}
