package com.coherentsolutions.advanced.java.section22.advanced;

import java.util.Iterator;
import java.util.LinkedHashSet;

/**
 * Demonstrates LinkedHashSet and its predictable iteration order.
 * LinkedHashSet maintains the order of elements in the order they were inserted.
 */
public class Ex06LinkedHashSetIterationOrder {

    public static void main(String[] args) {
        LinkedHashSet<String> set = new LinkedHashSet<>();

        // Adding elements to LinkedHashSet
        set.add("Banana");
        set.add("Apple");
        set.add("Orange");

        // Iterating over LinkedHashSet
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println("Element: " + iterator.next());
        }
    }
}
