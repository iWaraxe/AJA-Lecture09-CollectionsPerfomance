package com.coherentsolutions.advanced.java.section23;

import java.util.TreeMap;

/**
 * Demonstrates basic operations of TreeMap.
 * TreeMap sorts the keys automatically and provides O(log n) time complexity for basic operations.
 */
public class Ex02TreeMapDemo {

    public static void main(String[] args) {
        // Creating a TreeMap to store key-value pairs with sorted keys
        TreeMap<Integer, String> map = new TreeMap<>();

        // Adding key-value pairs
        map.put(3, "Orange");
        map.put(1, "Apple");
        map.put(2, "Banana");

        // Displaying the TreeMap (sorted by key)
        System.out.println("TreeMap (sorted by key): " + map); // Output: {1=Apple, 2=Banana, 3=Orange}

        // Accessing values by key - O(log n)
        System.out.println("Key 2 maps to: " + map.get(2)); // Output: Banana

        // Checking the first and last keys
        System.out.println("First key: " + map.firstKey()); // Output: 1
        System.out.println("Last key: " + map.lastKey()); // Output: 3
    }
}
