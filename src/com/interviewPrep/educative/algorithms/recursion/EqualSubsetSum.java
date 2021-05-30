package com.interviewPrep.educative.algorithms.recursion;

import java.util.*;

public class EqualSubsetSum {

    int[] globalNums;
    Boolean[][] memo;
    public boolean canPartition(int[] nums) {
        globalNums = nums;
        int totalSum = 0;
        for (int elm : nums)
            totalSum += elm;
        if (totalSum % 2 != 0) return false;
        memo = new Boolean[nums.length][totalSum + 1];
        return partitionHelper(0, totalSum / 2);
    }

    public boolean partitionHelper(int level, int remainingSum) {
//        Base
        if (remainingSum == 0) return true;
        if (level == globalNums.length) return false;

//        Rec log
        if (memo[level][remainingSum] != null) return memo[level][remainingSum];

        if (globalNums[level] <= remainingSum) {
            if (partitionHelper(level + 1, remainingSum - globalNums[level]))
                return true;
        }

        memo[level][remainingSum] = partitionHelper(level + 1, remainingSum);
        return memo[level][remainingSum];
    }

//    Recursive Dynamic programming
 /*   int[] globanNum;
    Boolean[][] memo;
    public boolean canPartition(int[] nums) {
        globanNum = nums;
        int totalSum = 0;
        for (int elm : nums)
            totalSum = totalSum + elm;

        if (totalSum % 2 != 0) return false;

        memo = new Boolean[nums.length][totalSum / 2 + 1];
//        Arrays.fill(memo, null);
        return partitionKnapsack(0, totalSum / 2);
    }

    public boolean partitionKnapsack(int level, int remainingSum) {
//        Base
        if (remainingSum == 0) return true;
        if (level == globanNum.length) return false;

        if (null != memo[level][remainingSum] ) return memo[level][remainingSum];

//        Rec Kanpsack logic
        if (globanNum[level] <= remainingSum) {
            if (partitionKnapsack(level + 1, remainingSum - globanNum[level]))
                return true;
        }

        memo[level][remainingSum] = partitionKnapsack(level + 1, remainingSum);
        return memo[level][remainingSum];
    }*/

    /*int[] globalNums;
    Map<Integer, List<List<Integer>>> allSubSet = new HashMap<>();
    int totalSum = 0;

    public boolean canPartition(int[] nums) {
        if (nums.length == 0) return false;
        globalNums = nums;
        for (int elm : nums) {
            totalSum = totalSum + elm;
        }
        if (totalSum % 2 != 0) return false;
        totalSum = totalSum / 2;
        allSubSet.put(totalSum, new ArrayList<>());
        partitionKnapsack(new ArrayList<>(), 0, 0);
        List<List<Integer>> finalLists= allSubSet.get(totalSum);
        if (finalLists.size() == 2) return true;
        return false;
    }

    public void partitionKnapsack(List<Integer> addedNumList, int level, int sum) {
//        Base
        if (level == globalNums.length ) {
            if (totalSum == sum) {
                List<List<Integer>> finalList = allSubSet.get(totalSum);
                finalList.add(addedNumList);
            }
            return;
        }

//        Rec Logic
        List<Integer> currList = new ArrayList<>(addedNumList);

        partitionKnapsack(currList, level + 1, sum);

        currList.add(globalNums[level]);
        partitionKnapsack(currList, level + 1, sum + globalNums[level]);
        return;
    }*/

}
