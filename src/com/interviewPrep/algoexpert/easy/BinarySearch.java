package com.interviewPrep.algoexpert.easy;

public class BinarySearch {
    public int binarySearch(int[] sortedArray, int target) {
        int leftIndex = 0;
        int rightIndex = sortedArray.length - 1;
        for (int counter = 0; counter <= sortedArray.length; counter++) {
            int currentIndex = ((rightIndex + leftIndex) / 2);
            if (rightIndex == leftIndex) {
                if (sortedArray[rightIndex] == target) {
                    return rightIndex;
                } else {
                    return -1;
                }
            } else if (sortedArray[currentIndex] == target) {
                return currentIndex;
            } else if (sortedArray[currentIndex] > target) {
                    rightIndex = currentIndex - 1;
            } else if (sortedArray[currentIndex] < target) {
                    leftIndex = currentIndex + 1;
            }
        }
        return -1;
    }
}
