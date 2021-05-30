package com.interviewPrep.educative.algorithms.topKElements;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class KthSmallestNumber {
    public int findSmallest(int[] nums, int k) {
        if (nums == null) return -1;
        PriorityQueue<Integer> elemMinQ = new PriorityQueue<>(
                (elm1, elm2) -> (elm1 > elm2) ? 1: -1
        );
        for (int elm: nums)
            elemMinQ.add(elm);

        for (int counter = 0; counter < k - 1; counter++)
            elemMinQ.remove();
        return elemMinQ.remove();
    }
}
