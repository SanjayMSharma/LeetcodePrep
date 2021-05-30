package com.interviewPrep.educative.algorithms.topKElements;

import java.util.*;

public class MaximumDistinctElements {
    public int maxDistinct(int[] nums, int k){
        if (nums.length == 0) return 0;
        List<Integer> distinctList = new ArrayList<>();
        Map<Integer, Integer> countMap = new HashMap<>();
        PriorityQueue<Map.Entry<Integer, Integer>> nonDistinctQ = new PriorityQueue<>(
                (elm1, elm2) -> elm1.getValue() - elm2.getValue()
        );
        for (int elm : nums)
            countMap.put(elm, countMap.getOrDefault(elm, 0) + 1);

        for (Map.Entry<Integer, Integer> countMapEntry : countMap.entrySet()) {
            if (countMapEntry.getValue() == 1)
                distinctList.add(countMapEntry.getKey());
            else
                nonDistinctQ.add(countMapEntry);
        }
        for (Map.Entry<Integer, Integer> nonDistinctElm: nonDistinctQ) {
            if (k <= 0) break;
            if (nonDistinctElm.getValue() > k) {
                if (nonDistinctElm.getValue() - k == 1) distinctList.add(nonDistinctElm.getKey());
                else {
                    k = k - nonDistinctElm.getValue();
                    break;
                }
            } else {
                k = k - (nonDistinctElm.getValue() - 1);
                distinctList.add(nonDistinctElm.getKey());
            }
        }
        if (k > 0) {
            for (int counter = 0; counter < k; counter++)
                distinctList.remove(distinctList.size() - 1);
        }
        return distinctList.size();
    }
}
