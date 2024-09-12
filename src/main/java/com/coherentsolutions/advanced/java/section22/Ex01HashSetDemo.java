package com.coherentsolutions.advanced.java.section22;

import java.util.HashSet;

/**
 * Demonstrates the basic operations of HashSet.
 * HashSet provides fast O(1) performance for adding, removing, and checking elements.
 */
public class Ex01HashSetDemo {

    public static void main(String[] args) {
        // Creating a HashSet to store unique elements
        HashSet<String> set = new HashSet<>();

        // Adding elements to the HashSet
        set.add("Apple");
        System.out.println("HashSet: " + set); // Output: [Apple, Orange]

        set.add("Banana");
        System.out.println("HashSet: " + set); // Output: [Apple, Orange]

        set.add("Orange");
        System.out.println("HashSet: " + set); // Output: [Apple, Orange]

        set.add("Pineapple");
        System.out.println("HashSet: " + set); // Output: [Apple, Orange]



        // Duplicates are not allowed
        set.add("Apple"); // Will not add again

        // Displaying the elements of HashSet
        System.out.println("HashSet: " + set); // Output: [Apple, Orange]



        // Checking if an element exists
        System.out.println("Contains Apple? " + set.contains("Apple")); // Output: true

        // Removing an element
        set.remove("Banana");

        // Displaying the elements of HashSet
        System.out.println("HashSet: " + set); // Output: [Apple, Orange]
    }
}
