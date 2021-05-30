package com.interviewPrep.leetCode.easy.array;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindDisappearedNumbers {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> rtnList = new ArrayList<>();
        for (int indx = 0; indx < nums.length; indx++) {
            int val = Math.abs(nums[indx]);
            if(nums[val - 1] > 0) {
                nums[val - 1] =  -(nums[val - 1]);
            }
        }
        for(int indx = 0; indx < nums.length; indx++) {
            if(nums[indx] > 0) {
                rtnList.add(indx+1);
            }
        }
        return  rtnList;
    }

}
