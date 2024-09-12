package com.coherentsolutions.advanced.java.section21.advanced;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * This class compares the performance of ArrayList and LinkedList
 * when performing operations such as adding, accessing, and removing elements.
 * It includes basic time measurements to demonstrate the differences in time complexity.
 */
public class Ex07ArrayListVsLinkedListPerformance {

    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

        // Adding elements
        for (int i = 0; i < 1_000_000; i++) {
            arrayList.add(i);
            linkedList.add(i);
        }

        // Measuring access time for ArrayList
        long start = System.nanoTime();
        arrayList.get(500_000); // ?O(1) or O(n) for ArrayList
        long end = System.nanoTime();
        System.out.println("ArrayList access time: " + (end - start) + " ns");

        // Measuring access time for LinkedList
        start = System.nanoTime();
        linkedList.get(500_000); // O(n) for LinkedList
        end = System.nanoTime();
        System.out.println("LinkedList access time: " + (end - start) + " ns");

        // Measuring removal time for ArrayList
        start = System.nanoTime();
        arrayList.remove(500_000); // O(n) for ArrayList
        end = System.nanoTime();
        System.out.println("ArrayList removal time: " + (end - start) + " ns");

        // Measuring removal time for LinkedList
        start = System.nanoTime();
        linkedList.remove(500_000); // ?O(1) or O(n) for LinkedList
        end = System.nanoTime();
        System.out.println("LinkedList removal time: " + (end - start) + " ns");
    }
}
