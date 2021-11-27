package com.practise.java.hackerRanker;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;

public class MinimumStepHopsNeededWithFixedStepJumpCapability {
    public static void main(String[] args) {
        List<Integer> jumpPosibilities = Arrays.asList(1, 3, 5);

        AtomicInteger count = new AtomicInteger(0);
        AtomicInteger remainingSteps = new AtomicInteger(18);
        IntStream.range(0,3)
                .map(i -> 3 - (i+1))
//                .peek(i -> System.out.println(i+" "+jumpPosibilities.get(i)))
                .forEach(step -> {
//                    System.out.println("Before "+count.get()+" "+ remainingSteps.get());
                    if (remainingSteps.get() > 0) {
                        Integer integer = jumpPosibilities.get(step);
                        count.addAndGet(remainingSteps.get()/ integer);
                        remainingSteps.set(remainingSteps.get()%integer);
                    }
//                    System.out.println("After "+count.get()+" "+ remainingSteps.get());
                });
        System.out.println(count.get());
    }
}
