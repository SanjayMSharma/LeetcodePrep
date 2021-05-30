package com.interviewPrep.leetCode.easy.recursion.dynamicProgramming;

public class PaintHouse {
    int[][] memo;
    public int minCost(int[][] costs) {
        if (costs.length == 0) return 0;
        memo = new int[costs.length][costs[0].length];
        int min = Integer.MAX_VALUE;
        for (int color = 0; color < costs[0].length; color++)
            min = Math.min(min, minCostHelper(costs, 0, color));
        return min;
    }

    public int minCostHelper(int[][] costs, int level, int color) {
//        Base
        if (level == costs.length) return 0;
        if (memo[level][color] != 0) return memo[level][color];

        int minCost = Integer.MAX_VALUE;

        for (int colorIndx = 0; colorIndx < costs[0].length; colorIndx++) {
            if (colorIndx != color) {
                minCost = Math.min(minCost, minCostHelper(costs, level+1, colorIndx)) ;
            }
        }
        memo[level][color] = minCost + costs[level][color];
        return memo[level][color];
    }
}
