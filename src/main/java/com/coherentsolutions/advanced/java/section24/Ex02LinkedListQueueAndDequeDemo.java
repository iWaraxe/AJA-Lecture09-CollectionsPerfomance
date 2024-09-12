package com.coherentsolutions.advanced.java.section24;

import java.util.LinkedList;

/**
 * Demonstrates how LinkedList can be used as both a queue (FIFO) and a deque (double-ended queue).
 */
public class Ex02LinkedListQueueAndDequeDemo {

    public static void main(String[] args) {
        // Using LinkedList as a Queue (FIFO)
        LinkedList<String> queue = new LinkedList<>();

        // Adding elements to the queue
        queue.addLast("First");
        queue.addLast("Second");
        queue.addLast("Third");

        // Removing elements from the front (FIFO behavior)
        System.out.println("Queue - Removing: " + queue.removeFirst()); // Output: First
        System.out.println("Queue - Removing: " + queue.removeFirst()); // Output: Second
        System.out.println("Queue - Removing: " + queue.removeFirst()); // Output: Third

        // Using LinkedList as a Deque (Double-Ended Queue)
        LinkedList<String> deque = new LinkedList<>();

        // Adding elements to both ends
        deque.addFirst("First");
        deque.addLast("Second");
        deque.addFirst("Zero");

        // Removing elements from both ends
        System.out.println("Deque - Removing first: " + deque.removeFirst()); // Output: Zero
        System.out.println("Deque - Removing last: " + deque.removeLast());  // Output: Second
        System.out.println("Deque - Removing first: " + deque.removeFirst()); // Output: First
    }
}
