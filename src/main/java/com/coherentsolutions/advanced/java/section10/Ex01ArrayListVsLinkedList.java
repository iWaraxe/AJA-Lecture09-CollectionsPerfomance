package com.coherentsolutions.advanced.java.section10;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * This class demonstrates the performance differences between ArrayList and LinkedList.
 * It shows how access time and removal time differ when using these two collections.
 */
public class Ex01ArrayListVsLinkedList {

    public static void main(String[] args) {
        // Choosing between ArrayList and LinkedList
        List<String> arrayList = new ArrayList<>();
        List<String> linkedList = new LinkedList<>();

        // Adding elements
        for (int i = 0; i < 1_000_000; i++) {
            arrayList.add("Element " + i);
            linkedList.add("Element " + i);
        }

        // Accessing elements by index - ArrayList is faster
        long start = System.nanoTime();
        arrayList.get(500_000); // O(1) access in ArrayList
        long end = System.nanoTime();
        System.out.println("ArrayList access time: " + (end - start) + " ns");

        // Accessing elements by index - LinkedList is slower
        start = System.nanoTime();
        linkedList.get(500_000); // O(n) access in LinkedList
        end = System.nanoTime();
        System.out.println("LinkedList access time: " + (end - start) + " ns");

        // Removing from the middle - LinkedList can be faster for modifications
        start = System.nanoTime();
        linkedList.remove(500_000); // O(1) removal in LinkedList if node is known
        end = System.nanoTime();
        System.out.println("LinkedList removal time: " + (end - start) + " ns");

        start = System.nanoTime();
        arrayList.remove(500_000); // O(n) removal in ArrayList
        end = System.nanoTime();
        System.out.println("ArrayList removal time: " + (end - start) + " ns");
    }
}
