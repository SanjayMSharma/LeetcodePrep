package com.interviewPrep.leetCode.easy.array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> returnList = new ArrayList<>();
        List<Integer> subList;
        Map<Integer, Integer> numsMap = new HashMap<>();
        for (int indx = 0; indx< nums.length; indx++) {
           numsMap.put(nums[indx], indx);
        }
        for (int primeIndx = 0; primeIndx < nums.length - 1 ; primeIndx++) {
            for (int secondIndx = primeIndx + 1; secondIndx < nums.length; secondIndx++) {
                int need = -(nums[primeIndx] + nums[secondIndx]);
                if (numsMap.containsKey(need)) {
                    subList = new ArrayList<>();
                    int thirdIndx = numsMap.get(need);
                    numsMap.remove(need);
                    if (thirdIndx < primeIndx) {
                        subList.add(nums[thirdIndx]);
                        subList.add(nums[primeIndx]);
                        subList.add(nums[secondIndx]);
                    } else if (thirdIndx > secondIndx) {
                        subList.add(nums[primeIndx]);
                        subList.add(nums[secondIndx]);
                        subList.add(nums[thirdIndx]);
                    } else {
                        subList.add(nums[primeIndx]);
                        subList.add(nums[thirdIndx]);
                        subList.add(nums[secondIndx]);
                    }
                    returnList.add(subList);
                }
            }
        }
        return returnList;
    }
}
