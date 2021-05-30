package com.interviewPrep.leetCode.easy;

public class MoveZeroes {

    public int[] moveZeroes(int[] nums) {

//        for (int index = 0; index < nums.length; index++) {
//            if (nums[index] == 0) {
//                for (int swapIndex = index; swapIndex < nums.length - 1; swapIndex++) {
//                    nums[swapIndex] = nums[swapIndex + 1];
//                }
//                nums[nums.length - 1] = 0;
//            }
//        }
        int insertIndex = 0;
        for (int ele : nums) {
            if (ele != 0) nums[insertIndex++] = ele;
        }
        while (insertIndex < nums.length){
            nums[insertIndex++] = 0;
        }

        return nums;
    }
}
