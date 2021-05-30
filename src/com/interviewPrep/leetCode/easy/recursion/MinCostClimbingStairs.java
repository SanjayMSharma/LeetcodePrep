package com.interviewPrep.leetCode.easy.recursion;

public class MinCostClimbingStairs {
    int[] memo;
    public int minCostClimbingStairs(int[] cost) {
        memo = new int[cost.length];
        return Math.min(minCostHelp(cost, 0), minCostHelp(cost, 1));
    }

    public int minCostHelp(int[] cost, int indx) {
//        base
        if (indx >= cost.length) return 0;
        if (memo[indx] == 0)
            memo[indx] = cost[indx] + Math.min(minCostHelp(cost, indx + 1), minCostHelp(cost, indx + 2));

        return memo[indx];

    }
}
