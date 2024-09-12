package com.coherentsolutions.advanced.java.section21;

import java.util.ArrayList;

/**
 * This class demonstrates the time complexity for accessing and inserting elements in an ArrayList.
 * - Access time: O(1) for getting an element by index.
 * - Insertion/removal: O(n) for middle elements, O(1) for appending.
 */
public class Ex02ArrayListAccessAndInsertion {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        // Adding elements
        list.add("Element A");
        list.add("Element B");
        list.add("Element C");

        // Accessing an element by index - O(1)
        System.out.println("Access element at index 1: " + list.get(1));

        // Inserting an element in the middle - O(n)
        list.add(1, "Element D");

        // Removing an element from the middle - O(n)
        list.remove(1);

        System.out.println("Final List: " + list);
    }
}
