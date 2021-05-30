package com.interviewPrep.leetCode.easy.array;

public class RunningSum1d {
    public int[] runningSum(int [] nums) {
        if (nums.length < 2) return nums;
        for (int indx = 1; indx < nums.length; indx++) {
            nums[indx] = nums[indx] + nums[indx - 1];
        }
        return nums;
    }
}
