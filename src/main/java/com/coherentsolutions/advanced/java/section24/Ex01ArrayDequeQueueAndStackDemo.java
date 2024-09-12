package com.coherentsolutions.advanced.java.section24;

import java.util.ArrayDeque;

/**
 * Demonstrates how ArrayDeque can be used as both a queue (FIFO) and a stack (LIFO).
 */
public class Ex01ArrayDequeQueueAndStackDemo {

    public static void main(String[] args) {
        // Using ArrayDeque as a Queue (FIFO)
        ArrayDeque<String> queue = new ArrayDeque<>();

        // Adding elements to the queue
        queue.addLast("First");
        queue.addLast("Second");
        queue.addLast("Third");

        // Removing elements from the front (FIFO behavior)
        System.out.println("Queue - Removing: " + queue.removeFirst()); // Output: First
        System.out.println("Queue - Removing: " + queue.removeFirst()); // Output: Second
        System.out.println("Queue - Removing: " + queue.removeFirst()); // Output: Third

        // Using ArrayDeque as a Stack (LIFO)
        ArrayDeque<String> stack = new ArrayDeque<>();

        // Pushing elements onto the stack
        stack.addFirst("First");
        stack.addFirst("Second");
        stack.addFirst("Third");

        // Popping elements from the stack (LIFO behavior)
        System.out.println("Stack - Popping: " + stack.removeFirst()); // Output: Third
        System.out.println("Stack - Popping: " + stack.removeFirst()); // Output: Second
        System.out.println("Stack - Popping: " + stack.removeFirst()); // Output: First
    }
}
