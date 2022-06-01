package com.learning.daily.coding.problem;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

//The expression is given as a list of numbers and operands. For example: [5, 3, '+'] should return 5 + 3 = 8.
//For example, [15, 7, 1, 1, '+', '-', '/', 3, '*', 2, 1, 1, '+', '+', '-'] should return 5, since it is equivalent to ((15 / (7 - (1 + 1))) * 3) - (2 + (1 + 1)) = 5.
public class ReversePolishNotation {
    public static void main(String[] args) {
        List<String> operators = Arrays.asList("+", "-", "/", "*");
        List<String> stringsForReversePolishCalculation = Stream.of("15", "7", "1", "1", "+", "-", "/", "3", "*", "2", "1", "1", "+", "+", "-").collect(Collectors.toList());
        System.out.println(stringsForReversePolishCalculation.size());
        System.out.println(stringsForReversePolishCalculation.get(0));
        System.out.println(stringsForReversePolishCalculation.get(14));
        System.out.println(calculateValueOnRegressions(stringsForReversePolishCalculation, operators));
    }

    private static int calculateValueOnRegressions(List<String> stringsForReversePolishCalculation, List<String> operators) {
        AtomicInteger index = new AtomicInteger(0);
        IntStream.range(0, stringsForReversePolishCalculation.size())
                .forEachOrdered(value -> {
                    index.incrementAndGet();

                })

                .findFirst(index -> {
                    int value = index;
                    return operators.contains(stringsForReversePolishCalculation.get(index.));
                })
                .orElse(null);
        operators.contains(stringsForReversePolishCalculation.get(4));
        return 0;
    }
}
