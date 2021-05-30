package com.interviewPrep.educative.algorithms.binarysearch;

public class NumberRange {
    public int[] findRange(int[] arr, int key) {
//         Edge case 0 & 1
        if (arr.length == 0) return new int[] {-1 -1};
        if (arr.length == 1) {
            if (arr[0] == key) return new int[] {0, 0};
            return new int[] {-1, -1};
        }

        int start = 0, end = arr.length - 1, keyStartIndx = -1, keyEndIndx = -1;
        while (start <= end) {
            int mid = start + (end - start)/2;
            if (arr[mid] == key) {
                keyStartIndx = mid;
                keyEndIndx = mid;
//                lower elms
                for (int indx = mid - 1; indx >= 0; indx--) {
                    if (arr[indx] != key) break;
                    keyStartIndx = indx;
                }
//                high elms
                for (int indx = mid + 1; indx < arr.length; indx ++) {
                    if (arr[indx] != key) break;
                    keyEndIndx = indx;
                }
                break;
            }
            if (key < arr[mid]) end = mid - 1;
            if (key > arr[mid]) start = mid + 1;
        }
        return  new int[] {keyStartIndx, keyEndIndx};
    }
}
