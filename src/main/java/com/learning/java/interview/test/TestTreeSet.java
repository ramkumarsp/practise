package com.practise.java.interview.test;

import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

class EmployeeTest1 implements Comparable<EmployeeTest1>{
    int id;
    String name;

    public EmployeeTest1(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return String.valueOf(id) + "-" + name;
    }

    @Override
    public int compareTo(EmployeeTest1 o) {
        return Objects.compare(this.id, o.id, Integer::compare) + Objects.compare(this.name, o.name, String::compareTo);
//        if(o.id == this.id) {
//            return this.name.compareTo(o.name);
//        } else
//            return this.id - o.id;
    }
}

public class TestTreeSet {
    public static void main(String[] args) {

        EmployeeTest1 e1 = new EmployeeTest1(1, "a");
        EmployeeTest1 e2 = new EmployeeTest1(1, "a");
        EmployeeTest1 e3 = new EmployeeTest1(1, "b");
        System.out.println(e1);
        System.out.println(e2);
        TreeSet<EmployeeTest1> treeSet = new TreeSet<EmployeeTest1>();
        treeSet.add(e1);
        treeSet.add(e2);
        treeSet.add(e3);
        System.out.println(treeSet);
    }
}
