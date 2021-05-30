package com.interviewPrep.leetCode.easy.array;

public class SubarraySumEqualsK {
    public int subarraySum(int[] nums, int k) {
        int totalSubArray = 0;
        int totalSum = 0;
        for(int startIndx = 0; startIndx < nums.length - 1; startIndx++) {
            totalSum = nums[startIndx];
            for (int endIndx = startIndx + 1; endIndx < nums.length; endIndx++) {
                totalSum = totalSum + nums[endIndx];
                if (totalSum == k) totalSubArray++;
            }
        }
        return totalSubArray;
    }
}
