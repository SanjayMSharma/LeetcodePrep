package com.interviewPrep.leetCode.easy;

public class NonDecreasingArray {
    public boolean checkIfNonDecreasing(int[] nums) {
        int counter = 0;
        for (int indx = 0; indx < nums.length - 1; indx++) {
            if(nums[indx] > nums[indx+1]) {
                if(counter >= 1){
                    return false;
                }
                counter++;
                if(indx > 0 ) {
                    if ((nums[indx - 1] <= nums[indx+1])) {
                        nums[indx] = nums[indx+1];
                    } else {
                        nums[indx+1] = nums[indx];
                    }
                } else {
                    nums[indx] = nums[indx + 1];
                }
            }
        }
        return (counter > 1) ? false : true;
    }
}
