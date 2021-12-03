package com.practise.java.interview;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class mapComparisonAnagram {

    public static void main(String[] args) {
        String a = "silent";
        String b = "listen";

        Arrays.stream(a.split("")).forEach(c -> System.out.println(c));
        Map<String, Integer> collecta = getCollect(a);
        Map<String, Integer> collectb = getCollect(b);

        boolean anagram = collecta.entrySet().stream().noneMatch(entry -> collectb.get(entry.getKey()) != entry.getValue());
        //sort the arrays and compare to do this easily
      //  String[] aSplit = a.split("");
      //  String[] aSplit = a.split("");
//        b.split(.)
//        Arrays.sort(aSplit);
//        Arrays.sort(aSplit);
        for (int i=0;i<a.length();i++){
            int index=b.indexOf(String.valueOf(a.charAt(i)));
            if(index>0){
//                b.
            }
        }


    }

    private static Map<String, Integer> getCollect(String a) {
        return Arrays.stream(a.split("")).collect(Collectors.toMap(s -> s, s -> 1));
    }
}
