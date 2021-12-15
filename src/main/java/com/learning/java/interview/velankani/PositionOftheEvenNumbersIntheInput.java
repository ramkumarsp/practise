package com.learning.java.interview.velankani;

import java.util.concurrent.atomic.AtomicLong;
import java.util.stream.IntStream;

public class PositionOftheEvenNumbersIntheInput {
    public static void main(String[] args) {
//        3455673246
        String numberAsString = "3455673246";
        Long aLong = 3455673246L;
        AtomicLong number = new AtomicLong(aLong);
        IntStream.range(0, numberAsString.length()).forEachOrdered(position -> {
            Long valueInPosition = number.get() % 10;
            if (valueInPosition % 2 == 0) {
                System.out.println(valueInPosition + " " + position);
            }
            long newValue = number.get() / 10;
            if (newValue > 0) {
                number.getAndSet(newValue);
            }
        });

    }
}
