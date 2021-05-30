package com.interviewPrep.educative.algorithms.topKElements;

import java.util.*;

public class TopKFrequentNumbers {
    public List<Integer> topKNumbers(int[] nums, int k) {
        List<Integer> rtnTopElm = new ArrayList<>();
        Map<Integer, Integer> elmCountMap = new HashMap<>();
        for (int elm : nums) elmCountMap.put(elm, elmCountMap.getOrDefault(elm, 0) + 1);
        PriorityQueue<Map.Entry<Integer, Integer>> topElmQ = new PriorityQueue<>(
                (elm1Entry, elm2Entry) -> (elm1Entry.getValue() == elm2Entry.getValue()) ? elm1Entry.getKey() - elm2Entry.getKey() : elm2Entry.getValue() - elm1Entry.getValue()
        );
        for (Map.Entry<Integer, Integer> elmEntry: elmCountMap.entrySet()) {
            topElmQ.add(elmEntry);
        }
        for (int counter = 0; counter < k; counter++) {
            rtnTopElm.add(topElmQ.remove().getKey());
        }
        return rtnTopElm;
    }
}
