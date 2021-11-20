package com.practise.java.hackerRanker;

import org.springframework.util.CollectionUtils;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class balancedArray {

    public static void main(String[] args) {
        List<Integer> list =
                Arrays.asList(1, 2, 3, 4, 6);
//                Arrays.asList(1, 2);
        //index -> 3 0,2 4,5
//        System.out.println(list.subList(0, 3));
//        System.out.println(list.subList(4, 5));
        System.out.println(balancedNode(list));
    }

    private static int balancedNode(List<Integer> list) {
        if (!CollectionUtils.isEmpty(list) && list.size() > 2) {
            OptionalInt balancedIndex = IntStream.range(1, list.size() - 1)
//                    .peek(index -> System.out.print(index+" "))
//                    .peek(index -> System.out.println(" -> list("+index+") -> "+ list.get(index)))
                    .filter(index -> {
                        if (subListSum(list.subList(0,index)) == subListSum(list.subList(index+1, list.size()))) {
                            return true;
                        } else {
                            return false;
                        }
                    })
//                    .peek(index -> System.out.println("The filtered index is -> "+index+" Ans the value of variable in list is "+ list.get(index)))
                    .findFirst();
//            System.out.println("This is the index got -> "+balancedIndex.orElse(-1));
            return balancedIndex.isPresent() ? list.get(balancedIndex.getAsInt()) : -1;
        } else {
            return -1;
        }
    }

    private static int subListSum(List<Integer> subList) {
        int sum = subList.stream().reduce(0, (a, b) -> a + b).intValue();
//        System.out.println("list -> " + arr + " startingIndex -> {" + startingIndex + "} endingIndex -> {" + endingIndex + "} sub list -> " + subList + " sum -> {" + sum + "}");
        return sum;
    }
}
