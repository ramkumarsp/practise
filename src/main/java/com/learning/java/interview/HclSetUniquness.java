package com.learning.java.interview;

import lombok.Data;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Data
class HclStudent
//        implements Comparable<HclStudent>
{
private Integer id;
private String name;


public HclStudent(Integer id, String name) {
        this.id = id;
        this.name = name;
        }

//    @Override
//    public int compareTo(HclStudent o) {
//        return this.id.compareTo(o.id);
//    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HclStudent that = (HclStudent) o;
        return Objects.equals(id, that.id)
//                && Objects.equals(name, that.name)
                ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}

public class HclSetUniquness {
    public static void main(String[] args) {
        Set<HclStudent> set=new HashSet<>();
        HclStudent s1=new HclStudent(1,"abc");
        HclStudent s2=new HclStudent(1,"abc");
        HclStudent s3=new HclStudent(2,"xyz");
        HclStudent s4=s3;
        set.add(s1);
        set.add(s2);
        set.add(s3);
        set.add(s4);
        System.out.println(set.size());
        System.out.println(set);
    }
}
