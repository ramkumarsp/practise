package com.learning.java.sort;

import org.assertj.core.util.Lists;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class HumanTest {
    @Test
    public void givenPreLambda_whenSortingEntitiesByName_thenCorrectlySorted() {
        List<Human> humans = Lists.newArrayList(
                new Human("Sarah", 10),
                new Human("Jack", 12)
        );
        Collections.sort(humans, new Comparator<Human>() {
            public  int compare(Human h1, Human h2) {
                return h1.getName().compareTo(h2.getName());
            }
        });
        Assertions.assertEquals(humans.get(0), new Human("Jack", 12));
    }

    @Test
    public void whenSortingEntitiesByName_thenCorrectlySorted() {
        List<Human> humans = Lists.newArrayList(
                new Human("Sarah", 10),
                new Human("Jack", 12)
        );
        humans.sort((Human h1, Human h2) -> h1.getName().compareTo(h2.getName()));
        Assertions.assertEquals(humans.get(1), new Human("Sarah", 10));
    }

    @Test
    public void
    givenLambdaShortForm_whenSortingEntitiesByName_thenCorrectlySorted() {

        List<Human> humans = Lists.newArrayList(
                new Human("Sarah", 10),
                new Human("Jack", 12)
        );
        humans.sort((h1, h2) -> h1.getName().compareTo(h2.getName()));
        Assertions.assertEquals(humans.get(0), new Human("Jack", 12));
    }

    @Test
    public void
    givenMethodDefinition_whenSortingEntitiesByNameThenAge_thenCorrectlySorted() {

        List<Human> humans = Lists.newArrayList(
                new Human("Sarah", 12),
                new Human("Sarah", 10),
                new Human("Jack", 12)
        );

        humans.sort(Human::compareByNameThenAge);
        Assertions.assertEquals(humans.get(0), new Human("Jack", 12));
        Assertions.assertEquals(humans.get(1), new Human("Sarah", 10));
        Assertions.assertEquals(humans.get(2), new Human("Sarah", 12));
    }

    @Test
    public void
    givenComposition_whenSortingEntitiesByNameThenAge_thenCorrectlySorted() {
        List<Human> humans = Lists.newArrayList(
                new Human("Sarah", 12),
                new Human("Sarah", 10),
                new Human("Zack", 12)
        );
        humans.sort(Comparator.comparing(Human::getName).thenComparing(Human::getAge));
        Assertions.assertEquals(humans.get(2), new Human("Zack", 12));
        Assertions.assertEquals(humans.get(0), new Human("Sarah", 10));
        Assertions.assertEquals(humans.get(1), new Human("Sarah", 12));
    }

    @Test
    public final void
    givenStreamNaturalOrdering_whenSortingEntitiesByName_thenCorrectlySorted() {
        List<String> letters = Lists.newArrayList("B", "A", "C");
        List<String> sortedLetters = letters.stream().sorted().collect(Collectors.toList());
        Assertions.assertEquals(sortedLetters.get(0), "A");
        Assertions.assertEquals(sortedLetters.get(2), "C");
    }

    @Test
    public final void
    givenStreamCustomOrdering_whenSortingEntitiesByName_thenCorrectlySorted() {
        List<Human> humans = Lists.newArrayList(new Human("Sarah", 10), new Human("Jack", 12));
        Comparator<Human> nameComparator = (h1, h2) -> h1.getName().compareTo(h2.getName());
        Comparator<Human> ageComparator = (h1, h2) -> h1.getAge() - h2.getAge();
        List<Human> sortedHumans = humans.stream().sorted(nameComparator).collect(Collectors.toList());
        Assertions.assertEquals(sortedHumans.get(0), new Human("Jack", 12));
        List<Human> humansNameThenAgeSortSeperatlyInOrder = humans.stream().sorted(nameComparator).sorted(ageComparator).collect(Collectors.toList());
        Assertions.assertEquals(humansNameThenAgeSortSeperatlyInOrder.get(1), new Human("Jack", 12));
        List<Human> humansNameAndAgeSortAllTogether = humans.stream()
                .sorted(Comparator
                        .comparing(Human::getName)
                        .thenComparing(ageComparator))
                .collect(Collectors.toList());
        Assertions.assertEquals(humansNameAndAgeSortAllTogether.get(0), new Human("Jack", 12));
        Assertions.assertEquals(humansNameAndAgeSortAllTogether.get(1), new Human("Sarah", 10));
    }

}