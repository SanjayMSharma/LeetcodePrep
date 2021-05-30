package com.interviewPrep.educative.algorithms.binarysearch;

public class CeilingOfANumber {
    public int searchCeilingOfANumber(int[] arr, int key) {
//        Edge case 0,1 &  greater than or less than
        if (arr.length == 0) return -1;
        if (key < arr[0]) return 0;
        if (arr.length == 1) {
            if (key == arr[0]) return 0;
            else return -1;
        }

//        Logic
        int leftIndx = 0, rightIndx = arr.length - 1, mid = Integer.MIN_VALUE;
        if (key > arr[rightIndx]) return -1;

        while (leftIndx <= rightIndx) {
            mid = leftIndx + (rightIndx - leftIndx) / 2;
            if (key == arr[mid]) return mid;
            if (key < arr[mid]) rightIndx = mid - 1;
            if (key > arr[mid]) leftIndx = mid + 1;
        }
        if (key < arr[mid]) return mid;
        return mid + 1;
    }
}
