package com.practise.java.eight.stream;

import com.practise.java.pojo.FourWheeler;
import com.practise.java.pojo.Individual;
import com.practise.java.pojo.TwoWheeler;

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
            List<FourWheeler> fourWheelers = individual.getFourWheelers();
            List<FourWheeler> fourWheelers1 = fourWheelers.stream().sorted(Comparator.comparingInt(FourWheeler::getSeatingCapacity)).collect(Collectors.toList());
            List<TwoWheeler> twoWheelers = individual.getTwoWheelers();
            List<TwoWheeler> twoWheelers1 = twoWheelers.stream().sorted(Comparator.comparing(TwoWheeler::getMake)).collect(Collectors.toList());
//            collect1.add(new Individual(individual.getName(), null, twoWheelers1, fourWheelers1, null));
//            printTwoWheeler("sortTwoWheelerWithMakeAndThenSeatingCapacity", twoWheelers);
        });
//        printIndividuals(collect1);
        printIndividuals(individuals);
        Individual individualNamedRamkumar = individuals.stream().filter(individual -> individual.getName().equals("Ramkumar")).findFirst().orElse(null);
        //The changes are cascaded to the individuals object
        List<FourWheeler> fourWheelers = individualNamedRamkumar.getFourWheelers();
//        //The changes are not cascaded to the individuals object
//        List<FourWheeler> fourWheelers = new ArrayList<>(individualNamedRamkumar.getFourWheelers());
        fourWheelers.sort(Comparator.comparingInt(FourWheeler::getSeatingCapacity)
                .thenComparing(FourWheeler::getMake)
                .thenComparing(FourWheeler::getModel));
        printFourWheeler("sortFourWheelerWithSeatingCapacityAndThenMakeAndThenModelIn1StepDirectly", fourWheelers);
//        individualSortingSoOrderisChangedEveryTime(individualNamedRamkumar);
//        individualSortingInOneCommand(individualNamedRamkumar);
        printIndividuals(individuals);
    }

    private static void individualSortingInOneCommand(Individual ramkumar) {
        List<FourWheeler> sortFourWheelerWithSeatingCapacityAndThenMakeAndThenModelIn1StepInDirectly = ramkumar.getFourWheelers().stream()
                .sorted(Comparator.comparingInt(FourWheeler::getSeatingCapacity))
                .sorted(Comparator.comparing(FourWheeler::getMake))
                .sorted(Comparator.comparing(FourWheeler::getModel))
                .collect(Collectors.toList());
        printFourWheeler("sortFourWheelerWithSeatingCapacityAndThenMakeAndThenModelIn1StepInDirectly", sortFourWheelerWithSeatingCapacityAndThenMakeAndThenModelIn1StepInDirectly);
    }

    private static void individualSortingSoOrderisChangedEveryTime(Individual ramkumar) {
        List<FourWheeler> fourWheelers2 = ramkumar.getFourWheelers();
        List<FourWheeler> sortFourWheelerWithSeatingCapacityAlone = fourWheelers2.stream()
                .sorted(Comparator.comparingInt(FourWheeler::getSeatingCapacity))
                .collect(Collectors.toList());
        printFourWheeler("sortFourWheelerWithSeatingCapacityAlone", sortFourWheelerWithSeatingCapacityAlone);
        List<FourWheeler> sortFourWheelerWithSeatingCapacityAndThenMake = sortFourWheelerWithSeatingCapacityAlone.stream()
                .sorted(Comparator.comparing(FourWheeler::getMake))
                .collect(Collectors.toList());
        printFourWheeler("sortFourWheelerWithSeatingCapacityAndThenMake", sortFourWheelerWithSeatingCapacityAndThenMake);
        List<FourWheeler> sortFourWheelerWithSeatingCapacityAndThenMakeAndThenModelIn3Steps = sortFourWheelerWithSeatingCapacityAndThenMake.stream()
                .sorted(Comparator.comparing(FourWheeler::getModel))
                .collect(Collectors.toList());
        printFourWheeler("sortFourWheelerWithSeatingCapacityAndThenMakeAndThenModelIn3Steps", sortFourWheelerWithSeatingCapacityAndThenMakeAndThenModelIn3Steps);
    }

    private static void printFourWheeler(String sortPattern, List<FourWheeler> fourWheelers) {
        System.out.println(sortPattern);
        fourWheelers.forEach(fourWheeler -> System.out.println(fourWheeler));
    }

    private static void printTwoWheeler(String sortPattern, List<TwoWheeler> twoWheelers2) {
        System.out.println(sortPattern);
        twoWheelers2.forEach(twoWheeler -> System.out.println(twoWheeler));
    }

    private static void printIndividuals(List<Individual> collect) {
        collect.forEach(System.out::println);
    }
}
