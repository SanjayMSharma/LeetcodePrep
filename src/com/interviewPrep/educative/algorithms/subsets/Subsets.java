package com.interviewPrep.educative.algorithms.subsets;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Subsets {
    public List<List<Integer>> findSubset(int[] nums) {
        List<List<Integer>> rtnList = new ArrayList<>();
        rtnList.add(new ArrayList<>());
        for (int indx = 0; indx < nums.length; indx++) {
            int rtnSize = rtnList.size();

            for (int listIndx = 0; listIndx < rtnSize; listIndx++) {
                List<Integer> currList = new ArrayList<>(rtnList.get(listIndx));

                currList.add(nums[indx]);
                rtnList.add(currList);
            }
        }
        return rtnList;
    }
}
