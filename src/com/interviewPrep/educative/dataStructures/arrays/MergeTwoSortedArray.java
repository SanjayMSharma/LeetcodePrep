package com.interviewPrep.educative.dataStructures.arrays;

public class MergeTwoSortedArray {
    public int[] mergeTeo(int[] arr1, int[] arr2) {
        int[] newArry = new int[arr1.length + arr2.length];
        int arr1Indx = 0, arr2Indx = 0;
        for (int indx = 0; indx < newArry.length; indx++) {
            if (arr1Indx < arr1.length) {
                if (arr1[arr1Indx] <= arr2[arr2Indx]) {
                    newArry[indx] = arr1[arr1Indx++];
                } else {
                    newArry[indx] = arr2[arr2Indx++];
                }
            } else {
                newArry[indx] = arr2[arr2Indx++];
            }

        }
        return newArry;
    }
}
