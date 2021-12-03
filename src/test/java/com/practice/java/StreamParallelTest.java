package com.practice.java;

import org.junit.jupiter.api.Test;
import org.springframework.util.StopWatch;

import java.util.stream.IntStream;

public class StreamParallelTest {
    @Test
    public void forEachVsStreamVsParallelStream_Test() {
        IntStream range = IntStream.range(Integer.MIN_VALUE, Integer.MAX_VALUE);
        StopWatch stopWatch = new StopWatch();

        stopWatch.start("for each");
        int forEachResult = 0;
        for (int i = Integer.MIN_VALUE; i < Integer.MAX_VALUE; i++) {
            if (i % 15 == 0)
                forEachResult++;
        }
        stopWatch.stop();


        stopWatch.start("stream");
        long streamResult = range
                .filter(v -> (v % 15 == 0))
                .count();
        stopWatch.stop();


        range = IntStream.range(Integer.MIN_VALUE, Integer.MAX_VALUE);
        stopWatch.start("parallel stream");
        long parallelStreamResult = range
                .parallel()
                .filter(v -> (v % 15 == 0))
                .count();
        stopWatch.stop();

        System.out.println(String.format("forEachResult: %s%s" +
                        "parallelStreamResult: %s%s" +
                        "streamResult: %s%s",
                forEachResult, System.lineSeparator(),
                parallelStreamResult, System.lineSeparator(),
                streamResult, System.lineSeparator()));

        System.out.println("prettyPrint: " + stopWatch.prettyPrint());
        System.out.println("Time Elapsed: " + stopWatch.getTotalTimeSeconds());
    }
}
