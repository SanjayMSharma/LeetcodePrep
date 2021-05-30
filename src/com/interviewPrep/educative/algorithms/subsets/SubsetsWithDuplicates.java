package com.interviewPrep.educative.algorithms.subsets;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubsetsWithDuplicates {
    public List<List<Integer>> findSubSet(int[] nums) {
        List<List<Integer>> rtnSubSet = new ArrayList<>();

        rtnSubSet.add(new ArrayList<>());
        rtnSubSet.add(Arrays.asList((nums[0])));
        int rtnListSize = rtnSubSet.size();

        for (int numIndx = 1; numIndx < nums.length; numIndx++) {
            if (nums[numIndx] == nums[numIndx - 1]) {
                int newRtnSize = rtnSubSet.size();
                for (int rtnListPreSize = rtnListSize; rtnListPreSize < newRtnSize; rtnListPreSize++) {
                    List<Integer> currList = new ArrayList<>(rtnSubSet.get(rtnListPreSize));
                    currList.add(nums[numIndx]);
                    rtnSubSet.add(currList);
                }
            }
            else {
                rtnListSize = rtnSubSet.size();
                for (int indx = 0; indx < rtnListSize; indx++) {
                    List<Integer> currList = new ArrayList<>(rtnSubSet.get(indx));
                    currList.add(nums[numIndx]);
                    rtnSubSet.add(currList);
                }
            }
        }
        return rtnSubSet;
    }
}
