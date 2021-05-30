package com.interviewPrep.leetCode.easy.recursion.dynamicProgramming;

public class RangeSumQueryImmutable {
    int[][] dp;
    int[] nums;
    public void NumArray(int[] nums) {
        dp = new int[nums.length][nums.length];
        this.nums = nums;
        if (nums.length > 0)
            recursion01Knapsack( 0,0,0);
    }

    public int recursion01Knapsack( int sum, int startIndx, int endIndx) {

//        Base 2
        if (endIndx == this.nums.length - 1){
            dp[startIndx][endIndx] = sum + nums[endIndx];
            return 0;
        }

//        Base 1
        if (dp[startIndx][endIndx] != 0) return dp[startIndx][endIndx];


//        Rec Logic
//      Do not add  curr elm
        recursion01Knapsack(0, endIndx + 1, endIndx + 1);

//      Add curr elm
        dp[startIndx][endIndx] = sum + nums[endIndx];
        recursion01Knapsack(dp[startIndx][endIndx], startIndx, endIndx + 1);

        return 0;
    }

    public int sumRange(int i, int j) {
        if (dp.length == 0) return 0;

        return dp[i][j];
    }

}
