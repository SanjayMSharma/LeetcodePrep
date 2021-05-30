package com.interviewPrep.leetCode.easy.array;

import java.util.HashMap;
import java.util.Map;

public class TwoSumII {
    public int[] twoSum(int[] numbers, int target) {
            Map<Integer, Integer> numsIndxMap = new HashMap<>();
            for(int indx = 0;indx < numbers.length; indx++) {
                if(numsIndxMap.containsKey(target - numbers[indx])) {
                    int [] returnIndx = new int[2];
                    returnIndx[0] = numsIndxMap.get(target - numbers[indx]);
                    returnIndx[1] = indx;
                    return returnIndx;
                }
                numsIndxMap.put(numbers[indx], indx);
            }
            int [] returnIndx2 = new int[2];
            return returnIndx2;
        }
    }

