package com.coherentsolutions.advanced.java.section22.advanced;

import java.util.Comparator;
import java.util.TreeSet;

/**
 * Demonstrates TreeSet with a custom comparator.
 * TreeSet allows us to define custom sorting logic using a Comparator.
 */
public class Ex05TreeSetWithCustomComparator {

    public static void main(String[] args) {
        // Creating a TreeSet with a custom comparator (reverse alphabetical order)
        TreeSet<String> set = new TreeSet<>(Comparator.reverseOrder());

        // Adding elements to the TreeSet
        set.add("Banana");
        set.add("Apple");
        set.add("Orange");

        // Displaying the TreeSet (sorted in reverse alphabetical order)
        System.out.println("TreeSet (custom comparator): " + set); // Output: [Orange, Banana, Apple]
    }
}
