package com.learning.java.interview.mindTree20112021;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.stream.IntStream;

public class CollectionsProblemStatement {
    public static void main(String[] args) {
        //Given an string "MindMindTrakeeMind", find the last non repeating character.
        String string = "MindMindTrakeeMind";
        HashMap<Character, Integer> characterCountMap = new LinkedHashMap<Character, Integer>();
        IntStream.range(0, string.length())
                .map(i -> string.length() - (i + 1))
                .forEach(i -> {
                    char key = string.charAt(i);
                    if (characterCountMap.containsKey(key)) {
                        characterCountMap.put(key, characterCountMap.get(key) + 1);
                    } else {
                        characterCountMap.put(key, 1);
                    }
                });
        Character character = characterCountMap.entrySet().stream()
                .filter(characterIntegerEntry -> characterIntegerEntry.getValue() == 1)
                .findFirst()
                .map(characterIntegerEntry -> characterIntegerEntry.getKey())
                .orElse(null);
        System.out.println(character);
//        System.out.println(characterCountMap);
//        int length = 4;
//        IntStream.range(0, length)
//                .peek(i-> {System.out.println("i ->"+i+" length ->"+length+" length - i ->"+ (length-i-1));})
//                .map(i -> length-(i+1))
//                .forEach(System.out::println);
//        IntStream.rangeClosed(0, length-1)
//                .peek(i-> {System.out.println("i ->"+i+" length ->"+length+" length - i ->"+ (length-i-1));})
//                .map(i -> length-(i+1))
//                .forEach(System.out::println);
    }
}
