package com.practise.java.collection;

import java.util.Vector;

public class VectorImplementation {
    public static void main(String[] args) {
        String name = "vector22";
        System.out.println(name);
        Vector<String> vector22 = new Vector<>(2, 2);
        size(vector22, name);
        capacity(name, vector22);
        vector22.add("1");
        size(vector22, name);
        capacity(name, vector22);
        vector22.add("2");
        size(vector22, name);
        capacity(name, vector22);
        vector22.add("3");
        size(vector22, name);
        capacity(name, vector22);
        vector22.add("4");
        size(vector22, name);
        capacity(name, vector22);
        vector22.add("5");
        size(vector22, name);
        capacity(name, vector22);
        vector22.add("6");
        size(vector22, name);
        capacity(name, vector22);

        name = "vectorNull";
        System.out.println(name);
        Vector<String> vectorNull = new Vector<>();
        size(vectorNull, "vectorNull");
        capacity(name, vectorNull);
        vectorNull.add("1");
        size(vectorNull, "vectorNull");
        capacity(name, vectorNull);
        vectorNull.add("2");
        size(vectorNull, "vectorNull");
        capacity(name, vectorNull);
        vectorNull.add("3");
        size(vectorNull, "vectorNull");
        capacity(name, vectorNull);
        vectorNull.add("4");
        size(vectorNull, "vectorNull");
        capacity(name, vectorNull);
        vectorNull.add("5");
        size(vectorNull, "vectorNull");
        capacity(name, vectorNull);
        vectorNull.add("6");
        size(vectorNull, "vectorNull");
        capacity(name, vectorNull);

        name = "vector2";
        System.out.println(name);
        Vector<String> vector2 = new Vector<>(2);
        size(vector2, "vector2");
        capacity(name, vector2);
        vector2.add("1");
        size(vector2, "vector2");
        capacity(name, vector2);
        vector2.add("2");
        size(vector2, "vector2");
        capacity(name, vector2);
        vector2.add("3");
        size(vector2, "vector2");
        capacity(name, vector2);
        vector2.add("4");
        size(vector2, "vector2");
        capacity(name, vector2);
        vector2.add("5");
        size(vector2, "vector2");
        capacity(name, vector2);
        vector2.add("6");
        size(vector2, "vector2");
        capacity(name, vector2);
    }

    private static void capacity(String name, Vector<String> vector21) {
        System.out.println("capacity of "+name+" is -> "+vector21.capacity());
    }

    private static void size(Vector<String> vector21, String s) {
        System.out.println("size of "+s+" -> "+vector21.size());
    }
}
