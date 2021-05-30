package com.interviewPrep.educative.algorithms.binarysearch;

public class OrderAgnostic {
    public int search(int[] nums, int key ) {
//        Edge case size 0 or 1
        if (nums.length == 0) return -1;
        if (nums.length == 1) {
            if (key == nums[0]) return 0;
            return -1;
        }

//        Looping logic for ascending
        int leftIndx = 0, rightIndx = nums.length - 1;

        if (nums[leftIndx] < nums[rightIndx]) {
            while (leftIndx <= rightIndx) {
                int mid = (leftIndx + rightIndx) / 2;
                if (key == nums[mid]) return mid;
                if (key < nums[mid]) {
                    if (key == nums[leftIndx]) return leftIndx;
                    if (key < nums[leftIndx]) return -1;
                    rightIndx = mid - 1;
                    leftIndx = leftIndx + 1;
                } else {
                    if (key == nums[rightIndx]) return rightIndx;
                    if (key > nums[rightIndx]) return -1;
                    leftIndx = mid + 1;
                    rightIndx = rightIndx - 1;
                }
            }
        } else {
            while (leftIndx <= rightIndx) {
                int mid = (leftIndx + rightIndx) / 2;
                if (key == nums[mid]) return mid;
                if (key > nums[mid]) {
                    if (key == nums[leftIndx]) return leftIndx;
                    if (key > nums[leftIndx]) return -1;
                    leftIndx = leftIndx + 1;
                    rightIndx = mid - 1;
                } else {
                    if (key == nums[rightIndx]) return rightIndx;
                    if (key < nums[rightIndx]) return -1;
                    leftIndx = mid + 1;
                    rightIndx = rightIndx - 1;
                }
            }
        }

        return -1;
    }
}
