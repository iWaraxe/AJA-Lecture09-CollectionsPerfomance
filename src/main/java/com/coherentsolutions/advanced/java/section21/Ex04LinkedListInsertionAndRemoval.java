package com.coherentsolutions.advanced.java.section21;

import java.util.LinkedList;

/**
 * This class demonstrates the time complexity of inserting and removing elements from a LinkedList.
 * Insertion and removal at the start or middle of the list is O(1) in a LinkedList.
 */
public class Ex04LinkedListInsertionAndRemoval {

    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        // Adding elements
        list.add("Element A");
        list.add("Element B");
        list.add("Element C");

        // Inserting an element at index 1 - O(1)
        list.add(1, "Element D");
        System.out.println("After Insertion: " + list);


        // Removing an element at index 1 - O(1)
        list.remove(1);
        System.out.println("After Removal: " + list);
    }
}
