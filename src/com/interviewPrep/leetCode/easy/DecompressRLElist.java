package com.interviewPrep.leetCode.easy;

public class DecompressRLElist {
    public int[] decompressRLElist(int[] nums) {
        int newLeng = 0 ;
        for (int indx = 0; indx < nums.length; indx++) {
            if ((indx % 2) == 0) {
                newLeng = newLeng + nums[indx];
            }
        }
        int[] decompList = new int[newLeng];
        int decompListIndx = 0;
        for (int indx = 0; indx < nums.length; indx++) {
            if ((indx % 2) == 0) {
                for (int insrtIndx = 0; insrtIndx < nums[indx]; insrtIndx++) {
                    decompList[decompListIndx++] = nums[indx + 1];
                }
            }
        }

        return decompList;
    }
}
