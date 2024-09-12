package com.coherentsolutions.advanced.java.section23.advanced;

import java.util.Comparator;
import java.util.TreeMap;

/**
 * Demonstrates TreeMap with a custom comparator.
 * TreeMap allows sorting by custom order using a Comparator.
 */
public class Ex04TreeMapWithCustomComparator {

    public static void main(String[] args) {
        // Creating a TreeMap with a custom comparator (reverse order)
        TreeMap<Integer, String> map = new TreeMap<>(Comparator.reverseOrder());

        // Adding key-value pairs
        map.put(1, "Apple");
        map.put(2, "Banana");
        map.put(3, "Orange");

        // Displaying the TreeMap (sorted in reverse order by key)
        System.out.println("TreeMap (custom comparator): " + map); // Output: {3=Orange, 2=Banana, 1=Apple}
    }
}
