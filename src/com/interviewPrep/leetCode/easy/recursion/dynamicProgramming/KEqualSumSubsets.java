package com.interviewPrep.leetCode.easy.recursion.dynamicProgramming;

import java.util.ArrayList;
import java.util.List;

public class KEqualSumSubsets {

    int[] global;
    boolean[] visited;
    public boolean canPartitionKSubsets(int[] nums, int k) {
        global = nums;
        visited = new boolean[nums.length];
        int totalSum = 0;
        for (int elm: nums) totalSum += elm;
        if (totalSum % k != 0) return false;
        totalSum = totalSum / k;
        while (k > 0 && (partitionHelper(0, totalSum))){
            k--;
        }
        return k == 0;
    }
    public boolean partitionHelper(int level, int remainingSum) {
//        Base
        if (remainingSum == 0) return true;
        if (level == global.length) return false;


//        Rec logic
        if (global[level] <= remainingSum && !visited[level]) {
            visited[level] = true;
            if (partitionHelper(level + 1, remainingSum - global[level]))
                return true;
            else visited[level] = false;
        }

        return partitionHelper(level + 1, remainingSum);

    }

    /*int[] globalNums;
    List<Integer> subList = new ArrayList<>();
    public boolean canPartitionKSubsets(int[] nums, int k) {
        int totalSum = 0;
        for (int elm : nums)
            totalSum += elm;
        if (totalSum % k != 0) return false;
        globalNums = nums;
        boolean returnSub = true;
        int totalSubSet = 0;
        while (returnSub) {
             if (partitionHelper(0, totalSum / k)) {
                 totalSubSet++;
                 for (int indx = 0; indx < globalNums.length; indx++) {
                     if (subList.contains(globalNums[indx])) {
                         subList.remove(globalNums[indx]);
                         globalNums[indx] = 0;
                     }
                 }
              }else returnSub = false;
        }
        if (totalSubSet == k) return true;
        return false;
    }

    public boolean partitionHelper(int level, int remainingSum) {
//        Base
        if (remainingSum == 0) return true;
        if (level == globalNums.length) return false;

//        Rec logic
        if (globalNums[level] <= remainingSum)
         if (partitionHelper(level + 1, remainingSum - globalNums[level])) {
             subList.add(globalNums[level]);
             return true;
         }

         return partitionHelper(level + 1, remainingSum);
    }
*/
}
