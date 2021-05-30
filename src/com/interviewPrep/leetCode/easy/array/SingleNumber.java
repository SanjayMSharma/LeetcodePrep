package com.interviewPrep.leetCode.easy.array;

import java.util.*;

public class SingleNumber {
    public int singleNumber(int[] nums) {
        Map<Integer, Integer> numMap = new HashMap<>();
        PriorityQueue<Map.Entry<Integer, Integer>> minHeap = new PriorityQueue<>(
                (entry1, entry2) -> entry1.getValue() - entry2.getValue()
        );
        for (int elm: nums)
            numMap.put( elm,numMap.getOrDefault(elm, 0) + 1);
        for (Map.Entry<Integer, Integer> entry: numMap.entrySet())
            minHeap.add(entry);
        return minHeap.poll().getKey();
    }
}
