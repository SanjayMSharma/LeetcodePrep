package com.interviewPrep.leetCode.easy.array;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int[] rtnIndx = new int[2];
        Map<Integer, Integer> diffMap = new HashMap<>();
        for (int indx = 0; indx < nums.length; indx++) {
            boolean hasIndx = diffMap.containsKey(nums[indx]);
            if (hasIndx) {
                rtnIndx[0] = diffMap.get(nums[indx]);
                rtnIndx[1] = indx;
                return rtnIndx;
            }
            diffMap.put((target - nums[indx]), indx);
        }
        return rtnIndx;
    }
}
