package com.coherentsolutions.advanced.java.section21;

import java.util.ArrayList;

/**
 * This class demonstrates how ArrayList automatically resizes itself when the capacity is exceeded.
 */
public class Ex01ArrayListResize {

    public static void main(String[] args) {
        // Initial capacity of 2
        ArrayList<String> list = new ArrayList<>(2);

        // Adding elements
        list.add("Element 1");
        list.add("Element 2");

        System.out.println("Initial size: " + list.size());

        // This triggers internal array resizing
        list.add("Element 3");

        System.out.println("New size after resizing: " + list.size());
    }
}
