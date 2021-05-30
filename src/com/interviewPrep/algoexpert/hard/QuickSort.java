package com.interviewPrep.algoexpert.hard;

import com.sun.org.slf4j.internal.Logger;
import com.sun.org.slf4j.internal.LoggerFactory;

public class QuickSort {
    private static Logger LOGGER = LoggerFactory.getLogger(QuickSort.class);
    public int[] quickSort(int[] array) {

        int[] sortedArray = new int[array.length];

        if (array.length > 1) {
            int pivot = array.length - 1;
//            List<Integer> leftArray = new ArrayList<Integer>();
//            List<Integer> rightArray = new ArrayList<Integer>();
            int[] leftArray = new int[array.length];
            int leftIndexCounter = 0, rightIndexCounter = 0;
            int[] rightArray = new int[array.length];
            for (int index = 0; index < array.length - 1; index++ ){
                if (array[index] <= array[pivot]) {
                    leftArray[leftIndexCounter++] = array[index];
//                    leftArray.add(array[index]);
                } else {
                    rightArray[rightIndexCounter++] = array[index];
//                    rightArray.add(array[index]);
                }
            }
            if (leftIndexCounter >= 1) {
                leftArray = quickSort(leftArray);
                for (int index = 0; index < leftIndexCounter; index++) {
                    sortedArray[index] = leftArray[index];
                }
            }
            sortedArray[leftIndexCounter] = array[pivot];

            if (rightIndexCounter >= 1) {
                rightArray = quickSort(rightArray);
                for (int index = 0; index < rightIndexCounter; index++) {
                    sortedArray[leftIndexCounter + index] = rightArray[index];
                }
            }
        } else {
            return array;
        }

/*        int pivot = array[(array.length / 2) - 1];
        int leftCount = 0, rightCount = array.length - 1;
        int [] sortedArray = new int[array.length];
        for (int index = 0; index < array.length; index++){
//            if (leftCount == rightCount){
//                sortedArray[leftCount] = pivot;
//            } else {
//                LOGGER.error("LeftIndex is not Equal to right");
//            }
            if (index == pivot){
                sortedArray[index] = array[index];
            } else if (array[index] <= array[pivot]) {
                sortedArray[leftCount] = array[index];
                leftCount++;
            } else if (array[index] > array[pivot]) {
                sortedArray[rightCount] = array[index];
                rightCount--;
            }
        }
        int[] leftSortedArray = new int[leftCount];
        for (int index = 0; index < leftCount; index++){
            leftSortedArray[index] = array[index];
        }
        if (leftSortedArray.length > 0) {
            leftSortedArray = quickSort(leftSortedArray);
        }
        int[] rightSortedArray = new int[array.length - leftCount];
        for (int index = 0; index < (array.length - leftCount); index++) {
            rightSortedArray[index] = array[(leftCount + 1) + index];
        }
        if (rightSortedArray.length > 0) {
            rightSortedArray = quickSort(rightSortedArray);
        }
        for (int index = 0; index < leftSortedArray.length ; index++){
            sortedArray[index] = leftSortedArray[index];
        }
        for (int index = 0; index < rightSortedArray.length; index++) {
            sortedArray[leftSortedArray.length + index] = rightSortedArray[index];
        }*/

        return sortedArray;
    }
}
