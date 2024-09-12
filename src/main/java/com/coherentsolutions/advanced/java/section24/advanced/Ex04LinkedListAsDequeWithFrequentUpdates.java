package com.coherentsolutions.advanced.java.section24.advanced;

import java.util.LinkedList;

/**
 * Demonstrates frequent insertions and deletions using LinkedList as a deque.
 * This class focuses on handling frequent changes in the structure.
 */
public class Ex04LinkedListAsDequeWithFrequentUpdates {

    public static void main(String[] args) {
        LinkedList<String> deque = new LinkedList<>();

        // Initial insertions
        deque.addFirst("First");
        deque.addLast("Last");
        deque.addFirst("New First");
        deque.addLast("New Last");

        System.out.println("Deque after multiple insertions: " + deque);

        // Removing elements from both ends
        deque.removeFirst();
        deque.removeLast();

        System.out.println("Deque after removing from both ends: " + deque); // Output: [First, Last]

        // More updates
        deque.addFirst("Very First");
        deque.addLast("Very Last");

        System.out.println("Final Deque after more updates: " + deque); // Output: [Very First, First, Last, Very Last]
    }
}
