package com.interviewPrep.educative.dataStructures.LinkedList;

import java.util.HashSet;
import java.util.Set;

public class HappyNumber {
    public boolean find(int nums) {
        if (nums == 0) return false;
        if (nums == 1) return true;
        Set<Integer> visitedNums = new HashSet<>();
        while (!visitedNums.contains(nums)) {
            visitedNums.add(nums);
            int newNums = 0;
            while (nums > 0) {
                int modeVal = nums % 10;
                modeVal = modeVal * modeVal;
                newNums += modeVal;
                nums = nums / 10;
            }
            nums = newNums;
            if (nums == 1) return true;
        }
        return false;
    }
}
