package com.interviewPrep.educative.algorithms.binarysearch;

public class BitonicArrayMax {
    public int findMax(int[] arr) {
        if (arr.length == 1) return arr[0];
        int start = 0, end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (mid != 0 && arr[mid - 1] > arr[mid]) end = mid - 1;
            else if (mid != arr.length - 1 && arr[mid] < arr[mid + 1]) start = mid + 1;
            else return arr[mid];
        }
        return -1;
    }
}


