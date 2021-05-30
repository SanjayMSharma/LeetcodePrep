package com.interviewPrep.educative.algorithms.topKElements;

import java.util.*;

public class KClosestNumber {
    public List<Integer> findClosestElements(int[] arr, int K, int X) {
        if (arr.length == 0) return new ArrayList<>();
        List<Integer> rthList = new ArrayList<>();
        Map<Integer, Integer> diffMap = new HashMap<>();
        for (int elm : arr)
            diffMap.put(elm, Math.abs(X - elm));
        PriorityQueue<Map.Entry<Integer, Integer>> diffsQ = new PriorityQueue<>(
                (elm1, elm2) -> (elm1.getValue() == elm2.getValue()) ?
                        elm1.getKey() - elm2.getKey() : elm1.getValue() - elm2.getValue()
        );
        for (Map.Entry<Integer, Integer> entry : diffMap.entrySet())
            diffsQ.add(entry);

        for (int counter = 0; counter < K; counter++)
            rthList.add(diffsQ.remove().getKey());

        return rthList;
    }
}
