package com.coherentsolutions.advanced.java.section22;

import java.util.TreeSet;

/**
 * Demonstrates the basic operations of TreeSet.
 * TreeSet maintains the order of elements and provides O(log n) performance for basic operations.
 */
public class Ex02TreeSetDemo {

    public static void main(String[] args) {
        // Creating a TreeSet to store sorted unique elements
        TreeSet<String> set = new TreeSet<>();

        // Adding elements to the TreeSet
        set.add("Banana");
        set.add("Orange"); // O(log n)
        set.add("Apple");
        set.add("Banana");

        // TreeSet sorts the elements automatically
        System.out.println("TreeSet (sorted): " + set); // Output: [Apple, Banana, Orange]

        // TreeSet does not allow duplicates
        set.add("Apple"); // Ignored

        // Removing an element
        set.remove("Banana");

        // Checking if an element exists
        System.out.println("Contains Orange? " + set.contains("Orange")); // Output: true

        // Displaying the final TreeSet
        System.out.println("Final TreeSet: " + set); // Output: [Apple, Orange]
    }
}
