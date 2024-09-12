package com.coherentsolutions.advanced.java.section21.advanced;

import java.util.LinkedList;

/**
 * This class demonstrates how a LinkedList can be used as both a Stack and a Queue.
 * LinkedList allows constant time insertions/removals from both ends.
 */
public class Ex06LinkedListAsStackAndQueue {

    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        // Using LinkedList as a Stack (LIFO)
        list.push("Element 1"); // Push to the stack
        list.push("Element 2");
        System.out.println("LinkedList as Stack: " + list);
        System.out.println("Pop from Stack: " + list.pop()); // Pop from the stack

        // Using LinkedList as a Queue (FIFO)
        list.offer("Element 3"); // Enqueue
        list.offer("Element 4");
        System.out.println("LinkedList as Queue: " + list);
        System.out.println("Dequeue from Queue: " + list.poll()); // Dequeue
    }
}
