package com.interviewPrep.leetCode.easy.recursion.dynamicProgramming;

import java.util.Arrays;

public class HouseRobber {
    int[] memo ;
    public int rob(int[] nums) {
        if ((nums.length == 0)) return 0;
        if (nums.length == 1) return nums[0];
        memo = new int[nums.length];
        Arrays.fill(memo, -1);
        return Math.max(maxAmount(nums, 0), maxAmount(nums, 1));
    }

    public int maxAmount (int[] nums , int indx) {
//        Base case
        if (indx >= nums.length) return 0;
        if (memo[indx] > -1) return memo[indx];
        else memo[indx] = nums[indx] + Math.max(maxAmount(nums, indx + 2), maxAmount(nums, indx + 3));
        return memo[indx];
    }


//    Fine working Code
/*    int[] houses;
    int[] memo;
    public int rob(int[] nums) {
//        Edge Case
        if (nums.length == 0) return 0;
        if (nums.length == 1) return nums[0];
        houses = nums;
        memo = new int[nums.length];
        return Math.max(maxHouse(0), maxHouse(1));
    }
    public int maxHouse (int indx) {
//        Base
        if (indx >= houses.length) return 0;

//        Memo
        if (memo[indx] != 0) return memo[indx];

//        RecLogic and memo the new result
         memo[indx] = houses[indx] + Math.max(maxHouse( indx + 2), maxHouse(indx + 3));
         return memo[indx];
    }*/
}
