package com.coherentsolutions.advanced.java.section22;

import java.util.LinkedHashSet;

/**
 * Demonstrates the basic operations of LinkedHashSet.
 * LinkedHashSet maintains the insertion order and provides O(1) performance for basic operations.
 */
public class Ex03LinkedHashSetDemo {

    public static void main(String[] args) {
        // Creating a LinkedHashSet to store unique elements with predictable iteration order
        LinkedHashSet<String> set = new LinkedHashSet<>();

        // Adding elements to the LinkedHashSet
        set.add("Apple");
        set.add("Banana");
        set.add("Orange");

        // LinkedHashSet maintains the order of insertion
        System.out.println("LinkedHashSet (insertion order): " + set); // Output: [Apple, Banana, Orange]

        // Adding a duplicate
        set.add("Apple"); // Ignored

        // Removing an element
        set.remove("Banana");

        // Checking if an element exists
        System.out.println("Contains Orange? " + set.contains("Orange")); // Output: true

        // Displaying the final LinkedHashSet
        System.out.println("Final LinkedHashSet: " + set); // Output: [Apple, Orange]
    }
}
