package com.interviewPrep.educative.algorithms.twoPointers;

public class PairTargetSum {
    public int[] targetSum(int[] arr, int target) {
        int firstPointer = 0, secondPointer = arr.length - 1;
        while (firstPointer < secondPointer) {
            if (arr[firstPointer] + arr[secondPointer] == target) return new int[] {firstPointer, secondPointer};
            else if (arr[firstPointer] + arr[secondPointer] < target) firstPointer++;
            else secondPointer--;
        }
        return new int[2];
    }
}
