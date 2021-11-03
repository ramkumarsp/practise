package com.sriram;

import java.util.*;

public class StringChecks {

    public static void main(String[] args) {
//        System.out.println("hello my friends".split(" ")[0]);

//        String[] array = new String[]{"A", "B","C"};
//        List<String> strings1 = Arrays.asList(array);
//        ArrayList<String> strings2 = new ArrayList<>(Arrays.asList(array));
//        ArrayList<String> strings3 = new ArrayList<>(Arrays.asList("A", new String("B"), "C"));
//        System.out.println(strings1.equals(strings2));
//        System.out.println(strings1.equals(strings3));
//        System.out.println(strings1 == strings2);
//        System.out.println(strings1 == strings3);

//        for(Pen) for each ?


        System.out.println("apple".compareTo("banana"));


//        Map<String, Integer> map = new HashMap<>();
//        map.put("g", 1200);
//        map.put("c", 3000);
//        map.put("x",4546);
//        map.put("c", 5464);
//        System.out.println(map.size());

//        new ArrayList<String>(){"a", "b"};

        String[] array = {"abc", "2", "10", "0", "A"};
        List<String> strings = Arrays.asList(array);
        Collections.sort(strings);
        System.out.println(Arrays.toString(array));
        Arrays.asList("q", "y");

    }

}
