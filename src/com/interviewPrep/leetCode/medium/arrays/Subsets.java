package com.interviewPrep.leetCode.medium.arrays;

import java.util.ArrayList;
import java.util.List;

public class Subsets {

//      Backtracking:

//      Permutation combination
    /*public List<List<Integer>> subsets(int[] nums) {
        if (nums.length == 0 ) return new ArrayList<>();
        List<List<Integer>> finalList = new ArrayList<>();
        List<Integer> noElmList = new ArrayList<>();
        finalList.add(noElmList);
        subSetHelper(0, finalList, nums);
        return finalList;
    }
    public void subSetHelper(int level, List<List<Integer>> combinedList, int[] nums) {
//        Base Case
        if (level == nums.length) return;
        List<List<Integer>> currLevelList = new ArrayList<>();
        for (List<Integer> list: combinedList) {
            List<Integer> newList = new ArrayList<>();
            newList.addAll(list);
            newList.add(nums[level]);
            currLevelList.add(newList);
        }
        combinedList.addAll(currLevelList);
        subSetHelper(level+1, combinedList, nums);
    }*/
}
