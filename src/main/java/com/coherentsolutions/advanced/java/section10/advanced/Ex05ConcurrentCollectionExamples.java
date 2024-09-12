package com.coherentsolutions.advanced.java.section10.advanced;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;

/**
 * This class demonstrates thread-safe collections such as ConcurrentHashMap and ConcurrentLinkedQueue.
 * These collections are highly useful in multi-threaded environments.
 */
public class Ex05ConcurrentCollectionExamples {

    public static void main(String[] args) {
        // Using a ConcurrentHashMap for thread-safe key-value storage
        ConcurrentHashMap<String, Integer> concurrentMap = new ConcurrentHashMap<>();
        concurrentMap.put("task1", 1);
        concurrentMap.put("task2", 2);

        System.out.println("ConcurrentHashMap: " + concurrentMap);

        // Using a ConcurrentLinkedQueue for thread-safe queue operations
        ConcurrentLinkedQueue<String> queue = new ConcurrentLinkedQueue<>();
        queue.add("Job1");
        queue.add("Job2");

        System.out.println("ConcurrentLinkedQueue: " + queue);

        // In a real-world scenario, these collections would be accessed by multiple threads without additional locking.
    }
}
