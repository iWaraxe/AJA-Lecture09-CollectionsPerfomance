package com.coherentsolutions.advanced.java.section23;

import java.util.LinkedHashMap;

/**
 * Demonstrates basic operations of LinkedHashMap.
 * LinkedHashMap maintains the insertion order of keys and provides O(1) time complexity for basic operations.
 */
public class Ex03LinkedHashMapDemo {

    public static void main(String[] args) {
        // Creating a LinkedHashMap to store key-value pairs with insertion order maintained
        LinkedHashMap<Integer, String> map = new LinkedHashMap<>();

        // Adding key-value pairs to LinkedHashMap
        map.put(1, "Apple");
        map.put(2, "Banana");
        map.put(3, "Orange");

        // Displaying the LinkedHashMap (insertion order)
        System.out.println("LinkedHashMap (insertion order): " + map); // Output: {1=Apple, 2=Banana, 3=Orange}

        // Accessing a value and updating access order
        System.out.println("Accessing key 2: " + map.get(2)); // Output: Banana

        // Displaying LinkedHashMap after access
        System.out.println("LinkedHashMap after access (insertion order): " + map); // Output: {1=Apple, 2=Banana, 3=Orange}

        // Enabling access-order mode (elements accessed most recently come last)
        LinkedHashMap<Integer, String> accessOrderedMap = new LinkedHashMap<>(16, 0.75f, true);

        // Adding key-value pairs and accessing them
        accessOrderedMap.put(1, "Apple");
        accessOrderedMap.put(2, "Banana");
        accessOrderedMap.put(3, "Orange");
        accessOrderedMap.get(1);

        // Displaying LinkedHashMap (access order)
        System.out.println("LinkedHashMap (access order): " + accessOrderedMap); // Output: {2=Banana, 3=Orange, 1=Apple}
    }
}
