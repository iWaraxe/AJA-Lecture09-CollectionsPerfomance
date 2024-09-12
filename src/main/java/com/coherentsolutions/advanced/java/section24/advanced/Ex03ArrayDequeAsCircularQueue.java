package com.coherentsolutions.advanced.java.section24.advanced;

import java.util.ArrayDeque;

/**
 * Demonstrates how ArrayDeque can be used as a circular queue.
 * This class mimics circular queue behavior using ArrayDeque.
 */
public class Ex03ArrayDequeAsCircularQueue {

    public static void main(String[] args) {
        ArrayDeque<Integer> circularQueue = new ArrayDeque<>(5);

        // Adding elements to the queue
        for (int i = 1; i <= 5; i++) {
            circularQueue.addLast(i);
        }

        System.out.println("Initial Circular Queue: " + circularQueue);

        // Simulate circular behavior by removing and adding elements
        Integer transferedElement = circularQueue.removeFirst();
        circularQueue.addLast(transferedElement);

        System.out.println("Circular Queue after rotation: " + circularQueue); // Output: [2, 3, 4, 5, 6]
    }
}
