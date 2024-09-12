package com.coherentsolutions.advanced.java.section21;

import java.util.LinkedList;

/**
 * This class demonstrates the internal structure and basic operations of a LinkedList.
 * LinkedList is a doubly linked list where each node has references to the previous and next nodes.
 */
public class Ex03LinkedListStructure {

    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        // Adding elements
        list.add("Element First");
        list.add("Element Second");
        list.add("Element Third");

        // Displaying the LinkedList
        System.out.println("LinkedList: " + list);

        // Accessing an element by index - O(n)
        System.out.println("Access element at index 1: " + list.get(1));
    }
}
