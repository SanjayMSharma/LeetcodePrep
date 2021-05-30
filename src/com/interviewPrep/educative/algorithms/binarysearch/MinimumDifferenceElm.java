package com.interviewPrep.educative.algorithms.binarysearch;

public class MinimumDifferenceElm {
    public int searchMinDiffElm(int[] arr, int k) {
        if (arr.length == 0) return -1;
        if (arr.length == 1) return arr[0];

        int start = 0, end = arr.length - 1, mid = 0;
        while (start <= end) {
            mid = start + (end - start) / 2;
            if (arr[mid] == k) return k;
            if (arr[mid] > k) end = mid - 1;
            if (arr[mid] < k) start = mid + 1;
        }
        int rtnElm = arr[mid], midDiff = Math.abs(k - arr[mid]);
        if (mid > 0) {
            if (Math.abs(k - arr[mid - 1]) < midDiff ) rtnElm = arr[mid - 1];
        }
        if (mid < arr.length - 1) {
            if (Math.abs(k - arr[mid + 1]) < midDiff) rtnElm = arr[mid + 1];
        }
        return rtnElm;
    }
}
