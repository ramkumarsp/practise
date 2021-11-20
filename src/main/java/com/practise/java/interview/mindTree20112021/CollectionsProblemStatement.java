package com.practise.java.interview.mindTree20112021;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.stream.IntStream;

public class CollectionsProblemStatement {
    public static void main(String[] args) {
        //Given an string "MindMindTrakeeMind", find the last non repeating character.
        String string = "MindMindTrakeeMind";
        HashMap<Character, Integer> characterCountMap = new LinkedHashMap<Character, Integer>();
        IntStream.range(0, string.length())
//                .peek(i-> {System.out.println("i ->"+i+" length ->"+length+" length - i ->"+ (length-i));})
                .map(i -> string.length()-(i+1))
                .forEach(i-> {
                    char key = string.charAt(i);
                    if (characterCountMap.containsKey(key)) {
                        Integer integer = characterCountMap.get(key);
                        integer++;
                        characterCountMap.put(key, integer);
                    } else {
                        characterCountMap.put(key, 1);
                    }
                });
        System.out.println(characterCountMap);
    }
}
