package com.interviewPrep.leetCode.easy.array;

public class MaximumSubarray {
    public int maxSubArray(int[] nums) {
        if(nums.length == 0) return 0;
//         Edge case 0 or 1 elm:
        if(nums.length == 1) return nums[0];
        int globalSum = Integer.MIN_VALUE;
        int currSumArrSum = nums[0];
//        Traverse 0 - N
        for (int indx = 1; indx < nums.length; indx++) {
//        Logic: if sum of curr & prev elm-subArrSum is less than curr elm, replace currSubArrSum to current arr
            currSumArrSum = Math.max(nums[indx], currSumArrSum + nums[indx]);
            globalSum = Math.max(globalSum, currSumArrSum);
        }

        return globalSum;
    }
}
