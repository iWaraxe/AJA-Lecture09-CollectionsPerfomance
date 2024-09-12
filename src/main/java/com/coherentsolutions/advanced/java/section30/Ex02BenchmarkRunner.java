package com.coherentsolutions.advanced.java.section30;

import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.options.Options;
import org.openjdk.jmh.runner.options.OptionsBuilder;

/**
 * Runs the JMH benchmark for various collection operations.
 */
public class Ex02BenchmarkRunner {

    public static void main(String[] args) throws Exception {
        Options options = new OptionsBuilder()
                .include(Ex01CollectionBenchmark.class.getSimpleName())
                .forks(1)
                .warmupIterations(3)
                .measurementIterations(5)
                .build();

        new Runner(options).run();
    }
}
