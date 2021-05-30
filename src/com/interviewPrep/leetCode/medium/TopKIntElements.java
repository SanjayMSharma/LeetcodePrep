package com.interviewPrep.leetCode.medium;

import java.util.*;

public class TopKIntElements {
    public List<Integer> topKFrequent(int[] nums, int k) {

//        Wrong approach
        /*List<Integer> topInt = new ArrayList<>(k);
        HashMap<Integer, Integer> intCountMap = new HashMap<>();
        PriorityQueue<Map.Entry<Integer, Integer>> numCountQ = new PriorityQueue<>(
                (a,b) -> {
                    return (a.getValue() == b.getValue()) ? a.getKey().compareTo(b.getKey()) : (b.getValue() - a.getValue());
                }
        );
        for(int num : nums) {
            intCountMap.put(num, intCountMap.getOrDefault(num, 0) + 1);
        }
        for (Map.Entry<Integer, Integer> numsCount : intCountMap.entrySet()) {
            numCountQ.add(numsCount);
        }

        for (int topCounter = 0; topCounter < k; topCounter++) {
            topInt.add(numCountQ.poll().getKey());
        }

        return topInt;*/

        return null;
    }
}
