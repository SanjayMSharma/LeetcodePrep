package com.interviewPrep.educative.algorithms.topKElements;

import java.util.*;

public class TopKNumbers {

    public List<Integer> findKLargestNumbers(int[] nums, int k) {
        if (nums == null) return new ArrayList<>();
        List<Integer> rtnList = new ArrayList<>();
        PriorityQueue<Integer> maxHeapQ = new PriorityQueue<>(
                (elm1, elm2) -> (elm1 > elm2) ? 1 : -1
        );
        for (int elm : nums) {
            maxHeapQ.add(elm);
        }
        for (int elmCounter = 0; elmCounter < k; elmCounter++) {
            rtnList.add(maxHeapQ.remove());
        }
        return rtnList;
    }

    /*public List<Integer> findKLargestNumbers(int[] nums, int k) {
        if (nums == null) return new ArrayList<>();
        List<Integer> topElmList = new ArrayList<>();
        Map<Integer, Integer> elmCountMap = new HashMap<>();
        PriorityQueue<Map.Entry<Integer, Integer>> topElmQ = new PriorityQueue<>(
                (elm1, elm2) -> (elm1.getValue() > elm2.getValue()) ? 1 : -1
        );
        for (int eml : nums) {
            if (elmCountMap.containsKey(eml)) elmCountMap.put(eml, elmCountMap.get(eml) + 1);
            else elmCountMap.put(eml, 1);
        }
        for ( Map.Entry<Integer, Integer> entry : elmCountMap.entrySet()) {
            topElmQ.add(entry);
            if (topElmQ.size() > k) {
                topElmQ.poll();
            }
        }
        for (int elmCounter = 0; elmCounter < topElmQ.size(); elmCounter++ ) {
            topElmList.add(topElmQ.poll().getKey());
        }
        return topElmList;
    }*/
}
