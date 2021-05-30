package com.interviewPrep.educative.algorithms.topKElements;

import java.util.PriorityQueue;

public class SumofElements {
    public int sumElem (int[] nums, int k1, int k2) {
        int sumTotal = 0;
        PriorityQueue<Integer> elmMinHeap = new PriorityQueue<>(
                (elm1, elm2) -> elm1 - elm2
        );
        for (int elm : nums)
            elmMinHeap.add(elm);

        for (int counter = 0; counter < k2 - 1; counter++) {
            if (counter > k1 - 1) sumTotal = sumTotal + elmMinHeap.remove();
            else elmMinHeap.remove();
        }
        return sumTotal;
    }
}
