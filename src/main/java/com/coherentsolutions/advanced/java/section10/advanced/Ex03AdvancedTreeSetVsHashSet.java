package com.coherentsolutions.advanced.java.section10.advanced;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * This class demonstrates the difference between HashSet and TreeSet.
 * TreeSet maintains a sorted order, while HashSet offers better performance for unsorted sets.
 */
public class Ex03AdvancedTreeSetVsHashSet {

    public static void main(String[] args) {
        // Using a HashSet for fast access but no ordering
        Set<String> hashSet = new HashSet<>();
        hashSet.add("apple");
        hashSet.add("banana");
        hashSet.add("orange");

        System.out.println("HashSet result: " + hashSet); // Output: Unordered set (e.g., [banana, orange, apple])

        // Using a TreeSet for sorted elements
        Set<String> treeSet = new TreeSet<>();
        treeSet.add("apple");
        treeSet.add("banana");
        treeSet.add("orange");

        System.out.println("TreeSet result: " + treeSet); // Output: Ordered set [apple, banana, orange]
    }
}
