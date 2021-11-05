package com.practise.java.eight.stream;

import com.practise.java.pojo.FourWheeler;
import com.practise.java.pojo.Individual;
import com.practise.java.pojo.TwoWheeler;
import com.practise.java.pojo.Vehicle;

import java.util.*;
import java.util.stream.Collectors;

public class sortingImplemetation {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(10, 23, -4, 0, 18);
        List<Integer> sortedIntegerList = integerList.stream().sorted().collect(Collectors.toList());
        List<Integer> sortedIntegerListReverseOrder = integerList.stream()
                .sorted(Collections.reverseOrder())
                .collect(Collectors.toList());


        System.out.println(integerList);
        System.out.println(sortedIntegerList);
        System.out.println(sortedIntegerListReverseOrder);


        List<String> stringList = Arrays.asList("John", "Mark", "Robert", "Lucas", "Brandon");
        List<String> sortedStringList = stringList.stream().sorted().collect(Collectors.toList());
        List<String> sortedStringListReverseOrder = stringList.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList());

        System.out.println(sortedStringList);
        System.out.println(sortedStringListReverseOrder);


        List<Individual> individuals = StreamPractise.getIndividuals();
        List<Individual> collect = individuals.stream().sorted((i1, i2) -> {
            return i1.getName().compareTo(i2.getName());
        }).collect(Collectors.toList());
//        printIndividuals(collect);

        List<Individual> collect1 = new ArrayList<>();
        collect.stream().forEach(individual -> {
            List<FourWheeler> fourWheelers1 = individual.getFourWheelers().stream().sorted(Comparator.comparingInt(FourWheeler::getSeatingCapacity)).collect(Collectors.toList());
            List<TwoWheeler> twoWheelers1 = individual.getTwoWheelers().stream().sorted(Comparator.comparing(tw -> tw.getMake())).collect(Collectors.toList());
            collect1.add(new Individual(individual.getName(), null, twoWheelers1, fourWheelers1, null));
        });
        printIndividuals(collect1);
    }

    private static void printIndividuals(List<Individual> collect) {
        collect.forEach(System.out::println);
    }
}
