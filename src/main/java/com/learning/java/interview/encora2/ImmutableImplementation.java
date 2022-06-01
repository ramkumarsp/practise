package com.learning.java.interview.encora2;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.commons.lang3.ObjectUtils;
import org.springframework.data.annotation.Immutable;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@Data
@NoArgsConstructor
//@AllArgsConstructor
final class Student{
    String fname;
    String lname;
    List<String> hobbies;

    public List<String> getHobbies() {
        return Collections.unmodifiableList(hobbies);
    }

    public Student(String fname, String lname, List<String> hobbies) {
        this.fname = fname;
        this.lname = lname;
        this.hobbies = Collections.unmodifiableList(hobbies);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(fname, student.fname) && Objects.equals(lname, student.lname) && Objects.equals(hobbies, student.hobbies);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fname, lname, hobbies);
    }

    //setters private
}

public class ImmutableImplementation {

    public static void main(String[] args) {
        List<Student> students = null;
        List<Student> sortedWithFName = students.stream().sorted(Comparator.comparing(Student::getFname)).collect(Collectors.toList());
        List<Integer> integerList = Arrays.asList(1,2,3,4,5);


        Integer sumOfSquareOfOddNumbers = integerList.stream().filter(integer -> integer % 2 == 1).map(integer -> integer * integer).collect(Collectors.summingInt(Integer::intValue));
        Double sumOfSquareOfOddNumbers0 = integerList.stream().filter(integer -> integer % 2 == 1).map(integer -> Math.pow(integer, 2)).collect(Collectors.summingDouble(Double::intValue));
        int sumOfSquareOfOddNumbers1 = integerList.stream().filter(integer -> integer % 2 == 1).map(integer -> integer * integer).mapToInt(Integer::intValue).sum();
        Integer sumOfSquareOfOddNumbers2 = integerList.stream().filter(integer -> integer % 2 == 1).map(integer -> integer * integer).reduce(0, (a, b) -> a + b);
        Integer sumOfSquareOfOddNumbers3 = integerList.stream().filter(integer -> integer % 2 == 1).map(integer -> integer * integer).reduce(0, Integer::sum);


        List<Integer> l = Arrays.asList(1,2,3,4,5);
        int k = 1;
        List<Pair> pairs = returnPairsWithDifferenceAsK(l, k);
        System.out.println(pairs);
    }

    private static List<Pair> returnPairsWithDifferenceAsK(List<Integer> l, int k) {
        List<Pair> pairs = new ArrayList<Pair>();
        Collections.sort(l);
        IntStream.range(0, l.size()).forEachOrdered(index -> {
            if(index+1 < l.size()) {
                if(l.get(index) - l.get(index + 1) == k) {
                    pairs.add(new Pair(l.get(index), l.get(index+1)));
                    System.out.println(l.get(index)+" "+ l.get(index+1));
                }
            }
        });
        return pairs;
    }
}
