package com.coherentsolutions.advanced.java.section10;

import java.util.HashSet;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;

/**
 * This class compares the performance of HashSet and List for duplicate handling.
 * It demonstrates how using a Set can improve performance when avoiding duplicates.
 */
public class Ex02HashSetVsListForDuplicates {

    public static void main(String[] args) {
        // Using a List to store unique values (inefficient)
        List<String> userList = new ArrayList<>();
        userList.add("user1");
        userList.add("user2");
        if (!userList.contains("user1")) {
            userList.add("user1"); // O(n) complexity for contains() check
        }

        System.out.println("List result: " + userList); // Output: [user1, user2]

        // Using a HashSet to store unique values (efficient)
        Set<String> userSet = new HashSet<>();
        userSet.add("user1");
        userSet.add("user2");
        userSet.add("user1"); // Duplicate entry, will be ignored (O(1) for add and contains)

        System.out.println("HashSet result: " + userSet); // Output: [user1, user2]
    }
}
