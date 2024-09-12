package com.coherentsolutions.advanced.java.section23;

import java.util.HashMap;

/**
 * Demonstrates basic operations of HashMap.
 * HashMap offers O(1) time complexity for inserting, retrieving, and deleting elements.
 */
public class Ex01HashMapDemo {

    public static void main(String[] args) {
        // Creating a HashMap to store key-value pairs
        HashMap<Integer, String> map = new HashMap<>();

        // Adding key-value pairs to the HashMap
        map.put(1, "Apple");
        map.put(2, "Banana");
        map.put(3, "Orange");

        // Accessing values by key - O(1)
        System.out.println("Key 1 maps to: " + map.get(1)); // Output: Apple

        // Updating a value
        map.put(1, "Grapes");

        // Checking if a key exists
        System.out.println("Contains key 2? " + map.containsKey(2)); // Output: true

        // Removing an entry
        map.remove(3);

        // Displaying the final HashMap
        System.out.println("Final HashMap: " + map); // Output: {1=Grapes, 2=Banana}
    }
}
