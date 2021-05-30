package com.interviewPrep.educative.algorithms.recursion;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Knapsack01 {

    public int solveKnapsack(int[] profit, int[] weight, int capacity) {
//        Edge
        if (profit.length == 0) return 0;
        return solveKnapsackHelper(profit, weight, capacity, 0);
    }
    public int solveKnapsackHelper(int[] profit, int[] weight, int capacity, int level) {
//        Base
        if (level == profit.length ) return 0;
        if (capacity == 0) return 0;

//        recursive case
        int added = 0;
        if (capacity - weight[level] >= 0) {
            added = profit[level] + solveKnapsackHelper(profit, weight, capacity - weight[level], level + 1);
        }
        int notAdded = solveKnapsackHelper(profit, weight, capacity, level + 1);

        return Math.max(notAdded, added);
    }

    /*public int calculateMax(int[] profit, int[] weight, int capacity) {

        return calMaxHelper(profit, weight, capacity, 0);
    }

    public Integer calMaxHelper(int[] profit, int[] weight, int capacity, int level ) {
        if (level == profit.length) return 0;

        int addedSum = 0;
        if (weight[level] <= capacity)
            addedSum = profit[level] + calMaxHelper(profit, weight, capacity - weight[level], level+ 1);

        int nonAdded = calMaxHelper(profit, weight, capacity, level+ 1);
        return Math.max(addedSum, nonAdded);
    }*/
}
