package com.interviewPrep.leetCode.easy.array;

public class ShuffleArray {
    public int[] suffleArray (int[] nums, int n) {
        if (nums.length < 2) return nums;
        int[] rtnArray = new int[nums.length];
        int xIndx = 0;
        for (int indx = 0; indx < nums.length; indx++) {
            rtnArray[indx++] = nums[xIndx++];
            rtnArray[indx] = nums[n++];
        }
        return rtnArray;
    }
}
