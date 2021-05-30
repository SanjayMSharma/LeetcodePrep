package com.interviewPrep.educative.algorithms.subsets;

import java.util.*;

public class Permutations {
    public List<List<Integer>> findPermutations(int[] nums) {
        Queue<List<Integer>> levelQ = new LinkedList<>();
        List<List<Integer>> rtnPermutation = new ArrayList<>();
        levelQ.add(Arrays.asList(nums[0]));
        int currLevel = 1;
        while (!levelQ.isEmpty()) {
            int childCount = levelQ.size();
            currLevel++;
            for (int levelChildIndx = 0; levelChildIndx < childCount; levelChildIndx++) {
                List<Integer> currentElm = levelQ.poll();
                for (int newElmIndx = 0; newElmIndx < currLevel; newElmIndx++) {
                    List<Integer> newChild = new ArrayList<>(currentElm);
                    newChild.add(newElmIndx, nums[currLevel - 1]);
                    if (currLevel == nums.length) rtnPermutation.add(newChild);
                    else levelQ.add(newChild);
                }
            }
        }
        return rtnPermutation;
    }

/*    public List<List<Integer>> findPermutations(int[] nums) {
        Queue<List<Integer>> levelQ = new LinkedList<>();
        levelQ.add(Arrays.asList(nums[0]));

        for (int debththIndx = 1; debththIndx < nums.length; debththIndx++) {
            int qSize = levelQ.size();

            for (int levelElmIndx = 0; levelElmIndx < qSize; levelElmIndx++) {
                List<Integer> currElm = levelQ.poll();

                for (int newSize = 0; newSize <= debththIndx; newSize++) {
                    List<Integer> newElmList = new ArrayList<>();

                    for (int elm : currElm) {
                        if (newElmList.size() == newSize) newElmList.add(nums[debththIndx]);
                        newElmList.add(elm);
                    }

                    if (newElmList.size() == debththIndx) newElmList.add(nums[debththIndx]);

                    levelQ.add(newElmList);
                }
            }
        }
        List<List<Integer>> rtnPremutation = new ArrayList<>(levelQ);

        return rtnPremutation;
    }*/
}
