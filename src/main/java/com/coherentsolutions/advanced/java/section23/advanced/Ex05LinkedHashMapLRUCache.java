package com.coherentsolutions.advanced.java.section23.advanced;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Demonstrates how to implement an LRU (Least Recently Used) cache using LinkedHashMap.
 * LinkedHashMap in access-order mode automatically removes the least recently accessed entry.
 */
public class Ex05LinkedHashMapLRUCache {

    public static void main(String[] args) {
        // Creating a LinkedHashMap with access order and a maximum size of 3
        LinkedHashMap<Integer, String> lruCache = new LinkedHashMap<>(3, 0.75f, true) {
            @Override
            protected boolean removeEldestEntry(Map.Entry<Integer, String> eldest) {
                return size() > 3; // Remove the eldest entry if the size exceeds 3
            }
        };

        // Adding entries to the LRU cache
        lruCache.put(1, "Apple");
        lruCache.put(2, "Banana");
        lruCache.put(3, "Orange");

        // Accessing some entries to change the access order
        lruCache.get(1);

        // Adding another entry, which will cause the eldest (least recently used) entry to be removed
        lruCache.put(4, "Grapes");

        // Displaying the LRU cache
        System.out.println("LRU Cache: " + lruCache); // Output: {3=Orange, 1=Apple, 4=Grapes}
    }
}
