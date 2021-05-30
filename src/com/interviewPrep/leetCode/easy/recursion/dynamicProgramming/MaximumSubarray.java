package com.interviewPrep.leetCode.easy.recursion.dynamicProgramming;

public class MaximumSubarray {
    public int maxSubArray(int[] nums) {
        int maxSum = 0;
        int currSum  = 0;
        int strtIndx, endIndx;

        for (int indx = 0; indx < nums.length; indx++) {
            if (currSum >= 0) {
                currSum = currSum + nums[indx];
            }
            else {
                currSum = nums[indx];
            }
            if (currSum > maxSum) maxSum = currSum;
        }
        return maxSum;
    }
}
