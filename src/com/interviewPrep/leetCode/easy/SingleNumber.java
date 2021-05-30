package com.interviewPrep.leetCode.easy;

import java.util.*;

public class SingleNumber {

    public int[] singleNumber3(int[] nums) {
        int[] rtnArry = new int[2];
        int indx = 0;
        Set<Integer> numSet = new HashSet<>();

        for (int elm : nums) {
            if(numSet.contains(elm)) {
                numSet.remove(elm);
            } else {
                numSet.add(elm);
            }
        }

        for(int elm : numSet) {
            rtnArry[indx++] = elm;
        }

        return rtnArry;
    }

    public int singleNumber2(int[] nums) {
        int[] numCount = new int[32];

        return 0;
    }

    /*public int singleNumber2(int[] nums) {
        Map<Integer, Integer> numMap = new HashMap<>();
        for (int elm : nums) {
            numMap.put(elm, numMap.getOrDefault(elm, 0) + 1);
        }
        for (int key : numMap.keySet()) {
            if (numMap.get(key) == 1) {
                return key;
            }
        }
        return 0;
    }*/

    public int singleNumber (int[] nums) {
        Set<Integer> numSet = new HashSet<>();
        int rtnNum = 0;
        for (int elm : nums) {
            if (numSet.contains(elm)) {
                numSet.remove(elm);
            } else {
                numSet.add(elm);
            }
        }
        for (int elm : numSet) {
            rtnNum = elm;
        }
        return rtnNum;
    }

    /*public int singleNumber(int[] nums) {
        Map<Integer, Integer> countMap = new HashMap<>();
        for (int elm : nums) {
            countMap.put(elm ,countMap.getOrDefault(elm, 0) + 1);
        }
        for (int key : countMap.keySet()) {
            if (countMap.get(key) == 1) {
                return key;
            }
        }
        return 0;
    }*/


   /* public int singleNumber(int[] nums) {
        List<Integer> countArr = new ArrayList<Integer>();
        for(int elm : nums) {
            if ((countArr.contains(elm))) {
                countArr.remove(elm);
            } else {
                countArr.add(elm);
            }
        }

        return countArr.get(0);
    }*/
}
