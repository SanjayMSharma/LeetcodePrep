package com.interviewPrep.leetCode.easy;

public class RemoveDuplicate {
    public int removeDuplicates(int[] nums) {
        int uniqueIndx = (nums.length > 0) ? 1 : 0;
        for(int indx = 1; indx < nums.length; indx++) {
            if (nums[indx - 1] < nums[indx]) {
                nums[uniqueIndx++] = nums[indx];
            }
        }
        return uniqueIndx;
    }
        /*int counter = (nums.length > 0)? 1: 0;
        for (int indx = 1; indx < nums.length; indx++) {
            if (nums[indx]> nums[indx - 1]) {
                nums[counter++] = nums[indx];
            }
        }
        return counter;
    }*/
}
