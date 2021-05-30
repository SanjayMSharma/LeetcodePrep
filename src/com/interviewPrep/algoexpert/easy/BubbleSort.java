package com.interviewPrep.algoexpert.easy;

public class BubbleSort {
    public int[] bubbleSort(int[] array) {
//        for (int counter = 1; counter <= array.length; counter++){
//            for (int index = 0; index < array.length - counter; index++) {
//                if (array[index] > array[index + 1]) {
//                    int temp = array[index + 1];
//                    array[index + 1] = array[index];
//                    array[index] = temp;
//                }
//            }
//        }
        boolean didSwap = true;
        while (didSwap) {
            didSwap = false;
            for (int index = 0; index < array.length - 1; index ++) {
                if (array[index] > array[index + 1]) {
                    int temp = array[index];
                    array[index] = array[index + 1];
                    array[index + 1] = temp;
                    didSwap = true;
                }
            }
        }
        return array;
    }
}
