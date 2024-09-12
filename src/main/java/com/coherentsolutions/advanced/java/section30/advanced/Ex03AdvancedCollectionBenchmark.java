package com.coherentsolutions.advanced.java.section30.advanced;

import org.openjdk.jmh.annotations.*;
import java.util.*;
import java.util.concurrent.TimeUnit;

/**
 * Advanced JMH Benchmark with larger dataset and multi-threading.
 */
@BenchmarkMode(Mode.AverageTime)
@OutputTimeUnit(TimeUnit.MILLISECONDS)
@State(Scope.Thread)
public class Ex03AdvancedCollectionBenchmark {

    private List<Integer> largeArrayList;
    private List<Integer> largeLinkedList;
    private Set<Integer> largeHashSet;
    private Set<Integer> largeTreeSet;
    private Map<Integer, String> largeHashMap;

    @Setup(Level.Trial)
    public void setup() {
        largeArrayList = new ArrayList<>();
        largeLinkedList = new LinkedList<>();
        largeHashSet = new HashSet<>();
        largeTreeSet = new TreeSet<>();
        largeHashMap = new HashMap<>();

        // Initialize with 10000 elements
        for (int i = 0; i < 10000; i++) {
            largeArrayList.add(i);
            largeLinkedList.add(i);
            largeHashSet.add(i);
            largeTreeSet.add(i);
            largeHashMap.put(i, "Value " + i);
        }
    }

    @Benchmark
    public void advancedSearchInArrayList() {
        largeArrayList.contains(9999);
    }

    @Benchmark
    public void advancedSearchInLinkedList() {
        largeLinkedList.contains(9999);
    }

    @Benchmark
    public void advancedSearchInHashSet() {
        largeHashSet.contains(9999);
    }

    @Benchmark
    public void advancedSearchInTreeSet() {
        largeTreeSet.contains(9999);
    }

    @Benchmark
    public void advancedSearchInHashMap() {
        largeHashMap.containsKey(9999);
    }
}
