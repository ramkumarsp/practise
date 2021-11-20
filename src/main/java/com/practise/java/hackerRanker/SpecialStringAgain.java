package com.practise.java.hackerRanker;

import org.apache.commons.lang3.StringUtils;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;

//A string is said to be a special string if either of two conditions is met:
//
//All of the characters are the same, e.g. aaa.
//All characters except the middle one are the same, e.g. aadaa.
//A special substring is any substring of a string which meets one of those criteria. Given a string, determine how many special substrings can be formed from it.
//
//Example
//asasd
// contains the following  special substrings: {a, s, a, s, d, asa, sas}
public class SpecialStringAgain {
    public static void main(String[] args) {
        String string = "asasd";
        AtomicInteger specialStringCount = new AtomicInteger(string.length());
        List<String> characterList = Arrays.asList(string.split(""));

        addRepeatedCharactesCount(specialStringCount, characterList);

        IntStream.rangeClosed(1, characterList.size() -2).peek(index -> {
            int specialCharacterCount = 0;
            int lengthFromIndex = 1;
                    while (index - lengthFromIndex >=0 && index + lengthFromIndex < characterList.size()) {
                        if(characterList.get(index - lengthFromIndex).equals(characterList.get(index + lengthFromIndex)) && StringUtils.equals(characterList.get(index), characterList.get(index - lengthFromIndex))) {
                            specialCharacterCount++;
                        }
                            lengthFromIndex++;
                    }
                    if(index == characterList.size() - 2 && specialCharacterCount > 0)
                        specialStringCount.getAndIncrement();
                }
        );


        print(specialStringCount);

    }

    private static void addRepeatedCharactesCount(AtomicInteger specialStringCount, List<String> characterList) {
        IntStream.rangeClosed(0, characterList.size() - 1).peek(index -> IntStream.rangeClosed(index, characterList.size() - 1).forEach(innerIndex -> {
            charactersrepeatitionCount(specialStringCount, characterList, index, innerIndex);
        }));
    }

    private static void charactersrepeatitionCount(AtomicInteger specialStringCount, List<String> characterArray, int index, int innerIndex) {
        int specialCharacterInnerCount = 1;
        if (characterArray.get(index) == characterArray.get(innerIndex))
            specialCharacterInnerCount++;
        if (innerIndex == characterArray.size() - 1 && specialCharacterInnerCount > 1)
            specialStringCount.getAndIncrement();
    }

    private static void print(Object o) {
        System.out.println(o);
    }
}

