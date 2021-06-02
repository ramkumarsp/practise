package com.practise.java.eight.stream;

import com.practise.java.pojo.FourWheeler;
import com.practise.java.pojo.Individual;
import com.practise.java.pojo.TwoWheeler;
import com.practise.java.pojo.Vehicle;

import java.io.PrintStream;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamPractise {
    public static void main(String[] args) {
        List<Individual> individuals = getIndividuals();
//        flatMapPractise(individuals);
//        find(individuals);
        List<Vehicle> vehicleList = Arrays.asList(new FourWheeler(Vehicle.Make.MARUTI, "Swift", 5), new TwoWheeler(Vehicle.Make.HONDA, "Activa", 2), new TwoWheeler(Vehicle.Make.TVS, "Apache", 2), new TwoWheeler(Vehicle.Make.HERO, "Splendor", 2), new TwoWheeler(Vehicle.Make.BAJAJ, "M80", 2), new TwoWheeler(Vehicle.Make.HONDA, "Unicorn", 2), new FourWheeler(Vehicle.Make.FORCE, "Gurka", 9), new FourWheeler(Vehicle.Make.MARUTI, "Baleno", 5), new FourWheeler(Vehicle.Make.HONDA, "CRV", 5), new FourWheeler(Vehicle.Make.HYUNDAI, "Alcazar", 7), new FourWheeler(Vehicle.Make.MAHINDRA, "XUV500", 7), new FourWheeler(Vehicle.Make.TOYOTO, "Innova Crysta", 7), new FourWheeler(Vehicle.Make.HYUNDAI, "Creta", 5), new FourWheeler(Vehicle.Make.KIA, "Seltos", 5), new FourWheeler(Vehicle.Make.TATA, "Gravitas", 7));
    }

    private static void find(List<Individual> individuals) {
        System.out.println("Find any -> " + individuals.stream().findAny());
        System.out.println("Get Find any ->" + individuals.stream().findAny().get());
        Optional<Individual> first = individuals.stream().findFirst();
        System.out.println("Find first -> " + first);
        System.out.println("Get Find first ->" + first.get());
        System.out.print("Find first isPresent -> ");
        System.out.println(first.isPresent() ? first.get() : first);
    }

    private static void flatMapPractise(List<Individual> individuals) {
        System.out.println("Count of Map and Flatmap combination with List :" + individuals.stream().map(individual -> individual.getVehicles()).flatMap(vehicles -> vehicles.stream()).collect(Collectors.toList()).stream().count());
        System.out.println("Distinct Count in the List :" + individuals.stream().flatMap(individual -> individual.getVehicles().stream()).distinct().count());
        System.out.println("Count of Flatmap combination :" + individuals.stream().flatMap(individual -> individual.getVehicles().stream()).count());
        System.out.println("Count of Flatmap combination with Set :" + individuals.stream().flatMap(individual -> individual.getVehicles().stream()).collect(Collectors.toSet()).stream().count());
    }

    private static List<Individual> getIndividuals() {
        return Arrays.asList(
                new Individual("Suresh", Arrays.asList(
                        new TwoWheeler(Vehicle.Make.ROYAL_ENFIELD, "Thunderbird", 2),
                        new TwoWheeler(Vehicle.Make.HERO, "Splendor", 2),
                        new FourWheeler(Vehicle.Make.HYUNDAI, "Creta", 5))),
                new Individual("Ramesh", Arrays.asList(
                        new TwoWheeler(Vehicle.Make.BAJAJ, "M80", 2),
                        new FourWheeler(Vehicle.Make.MAHINDRA, "XUV500", 7),
                        new FourWheeler(Vehicle.Make.TOYOTO, "Innova Crysta", 7))),
                new Individual("Vignesh", Arrays.asList(
                        new TwoWheeler(Vehicle.Make.HONDA, "Unicorn", 2),
                        new FourWheeler(Vehicle.Make.KIA, "Seltos", 5))),
                new Individual("Ramkumar", Arrays.asList(
                        new FourWheeler(Vehicle.Make.MARUTI, "Swift", 5),
                        new TwoWheeler(Vehicle.Make.HONDA, "Activa", 2),
                        new TwoWheeler(Vehicle.Make.HONDA, "Unicorn", 2),
                        new FourWheeler(Vehicle.Make.MARUTI, "Baleno", 5),
                        new FourWheeler(Vehicle.Make.HYUNDAI, "Alcazar", 7))),
                new Individual("Rahul", Arrays.asList(
                        new FourWheeler(Vehicle.Make.HYUNDAI, "I20", 5),
                        new TwoWheeler(Vehicle.Make.HONDA, "Activa", 2))),
                new Individual("Magesh", Arrays.asList(
                        new FourWheeler(Vehicle.Make.HYUNDAI, "Creta", 5),
                        new TwoWheeler(Vehicle.Make.TVS, "xl50", 2)))
        );
    }

}
