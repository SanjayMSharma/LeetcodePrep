package com.interviewPrep.leetCode.easy.recursion;

import java.util.HashMap;
import java.util.Map;

public class climbingStairs {
    Map<Integer, Integer> stepCountMap = new HashMap<>();

    public int climbStairs(int n) {
        if (n <= 2) return n;
        stepCountMap.put(1, 1);
        stepCountMap.put(2, 2);

        return stairsStepCount(n);
    }

    public int stairsStepCount (int n) {

        if (stepCountMap.containsKey(n)) return stepCountMap.get(n);

        int result = stairsStepCount(n - 1) + stairsStepCount(n - 2);
        stepCountMap.put(n, result);

        return result;
    }
}
