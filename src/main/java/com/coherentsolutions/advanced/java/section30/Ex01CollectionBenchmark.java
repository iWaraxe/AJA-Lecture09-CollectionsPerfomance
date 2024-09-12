package com.coherentsolutions.advanced.java.section30;

import org.openjdk.jmh.annotations.*;
import java.util.*;
import java.util.concurrent.TimeUnit;

/**
 * JMH Benchmark for adding, removing, and searching elements in ArrayList, LinkedList, HashSet, TreeSet, and HashMap.
 */
@BenchmarkMode(Mode.AverageTime)
@OutputTimeUnit(TimeUnit.MILLISECONDS)
@State(Scope.Thread)
public class Ex01CollectionBenchmark {

    private List<Integer> arrayList;
    private List<Integer> linkedList;
    private Set<Integer> hashSet;
    private Set<Integer> treeSet;
    private Map<Integer, String> hashMap;

    @Setup
    public void setup() {
        arrayList = new ArrayList<>();
        linkedList = new LinkedList<>();
        hashSet = new HashSet<>();
        treeSet = new TreeSet<>();
        hashMap = new HashMap<>();
    }

    @Benchmark
    public void addToArrayList() {
        for (int i = 0; i < 10; i++) {
            arrayList.add(i);
        }
    }

    @Benchmark
    public void addToLinkedList() {
        for (int i = 0; i < 10; i++) {
            linkedList.add(i);
        }
    }

    @Benchmark
    public void addToHashSet() {
        for (int i = 0; i < 10; i++) {
            hashSet.add(i);
        }
    }

    @Benchmark
    public void addToTreeSet() {
        for (int i = 0; i < 10; i++) {
            treeSet.add(i);
        }
    }

    @Benchmark
    public void addToHashMap() {
        for (int i = 0; i < 10; i++) {
            hashMap.put(i, "Value " + i);
        }
    }

    @Benchmark
    public void searchInArrayList() {
        arrayList.contains(5);
    }

    @Benchmark
    public void searchInLinkedList() {
        linkedList.contains(5);
    }

    @Benchmark
    public void searchInHashSet() {
        hashSet.contains(5);
    }

    @Benchmark
    public void searchInTreeSet() {
        treeSet.contains(5);
    }

    @Benchmark
    public void searchInHashMap() {
        hashMap.containsKey(5);
    }

    @Benchmark
    public void removeFromArrayList() {
        arrayList.remove(Integer.valueOf(5));
    }

    @Benchmark
    public void removeFromLinkedList() {
        linkedList.remove(Integer.valueOf(5));
    }

    @Benchmark
    public void removeFromHashSet() {
        hashSet.remove(5);
    }

    @Benchmark
    public void removeFromTreeSet() {
        treeSet.remove(5);
    }

    @Benchmark
    public void removeFromHashMap() {
        hashMap.remove(5);
    }
}
