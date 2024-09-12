package com.coherentsolutions.advanced.java.section21.advanced;

import java.util.ArrayList;

/**
 * This class demonstrates how you can control the capacity of an ArrayList to avoid unnecessary resizing.
 * By setting an initial capacity, you can avoid the overhead of copying data when the array grows.
 */
public class Ex05ArrayListCapacityManagement {

    public static void main(String[] args) {
        // Initial capacity of 1000, prevents frequent resizing
        ArrayList<Integer> list = new ArrayList<>(1000);

        for (int i = 0; i < 1000; i++) {
            list.add(i);
        }

        System.out.println("Size of ArrayList: " + list.size());
    }
}
