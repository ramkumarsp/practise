package com.practise.java.hackerRanker;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class PrintAnagramsTogether {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("cat","dog","ogd","god","atc");

        for(String string : list) {
            HashMap<Character, Integer> innerHashMap = new HashMap<>();
            for (int i = 0; i< string.length(); i++) {
                char c = string.charAt(i);
//                if()
            }
        }
    }
}
