package com.coherentsolutions.advanced.java.section10.advanced;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * This class highlights the memory overhead differences between LinkedList and ArrayList.
 * LinkedList uses more memory due to node references, whereas ArrayList has a contiguous memory block.
 */
public class Ex04MemoryEfficiencyLinkedListVsArrayList {

    public static void main(String[] args) {
        // ArrayList uses contiguous memory, lower overhead
        List<Integer> arrayList = new ArrayList<>();

        // LinkedList has higher memory overhead due to node structure
        List<Integer> linkedList = new LinkedList<>();

        // Add elements to both lists
        for (int i = 0; i < 1000; i++) {
            arrayList.add(i);
            linkedList.add(i);
        }

        System.out.println("ArrayList size: " + arrayList.size());
        System.out.println("LinkedList size: " + linkedList.size());

        // Analyze memory usage using an external profiler (e.g., VisualVM or JProfiler)
        // ArrayList typically consumes less memory than LinkedList due to the node overhead in LinkedList.
    }
}
