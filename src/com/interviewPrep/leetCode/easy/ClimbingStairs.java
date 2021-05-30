package com.interviewPrep.leetCode.easy;

import java.util.Arrays;

public class ClimbingStairs {
    public int climbStairs (int n) {
        int[] storeCount = new int[n-1];
        storeCount[0] = 1;
        storeCount[1] = 2;
        for(int indx = 2; indx < n-1; indx++) {
            storeCount[indx] = storeCount[indx-1] + storeCount[indx-2];
        }
        return storeCount[n - 1];
    }
}
