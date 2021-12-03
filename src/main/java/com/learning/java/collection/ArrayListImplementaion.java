package com.learning.java.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class ArrayListImplementaion {
    public static void main(String[] args) {
        {
            String name = "arrayList";
            System.out.println(name);
            List<String> arrayList = new ArrayList<>();
            size(arrayList, name);
            arrayList.add("1");
            size(arrayList, name);
            arrayList.add("2");
            size(arrayList, name);
            arrayList.add("3");
            size(arrayList, name);
            arrayList.add("4");
            size(arrayList, name);
            arrayList.add("5");
            size(arrayList, name);
            arrayList.add("6");
            size(arrayList, name);

            name = "vectorNull";
            System.out.println(name);
            Vector<String> vectorNull = new Vector<>();
            size(vectorNull, "vectorNull");
            vectorNull.add("1");
            size(vectorNull, "vectorNull");
            vectorNull.add("2");
            size(vectorNull, "vectorNull");
            vectorNull.add("3");
            size(vectorNull, "vectorNull");
            vectorNull.add("4");
            size(vectorNull, "vectorNull");
            vectorNull.add("5");
            size(vectorNull, "vectorNull");
            vectorNull.add("6");
            size(vectorNull, "vectorNull");

            name = "vector2";
            System.out.println(name);
            Vector<String> vector2 = new Vector<>(2);
            size(vector2, "vector2");
            vector2.add("1");
            size(vector2, "vector2");
            vector2.add("2");
            size(vector2, "vector2");
            vector2.add("3");
            size(vector2, "vector2");
            vector2.add("4");
            size(vector2, "vector2");
            vector2.add("5");
            size(vector2, "vector2");
            vector2.add("6");
            size(vector2, "vector2");
        }
    }

    private static void size(List<String> list, String s) {
        System.out.println("size of "+s+" -> "+list.size());
    }
}
