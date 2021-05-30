package com.interviewPrep.algoexpert.easy;

public class InsertionSort {
    public int[] insertionSort(int[] array) {
        /*for(int index = 0; index < array.length - 1; index++) {
            if (array[index] > array [index+1]){
                for (int insertingIndex = 0; insertingIndex < index ; insertingIndex++) {
                    if (array[insertingIndex] > array[index + 1]) {
                        int temp = array[index + 1];
                        for (int swipIndex = index ; swipIndex >= insertingIndex; swipIndex--) {
                            array[swipIndex + 1] = array[swipIndex];
                        }
                        array[insertingIndex] = temp;
                    }
                }
            }
        }
        return array;*/

        for (int moveIndex = 0; moveIndex < array.length - 1; moveIndex++) {
            if (array[moveIndex] > array[moveIndex + 1]) {
                int holdLowValue = array[moveIndex + 1];
                for (int placeIndex = moveIndex + 1; placeIndex > 0; placeIndex-- ) {
                    if (holdLowValue < array[placeIndex - 1]) {
                        array[placeIndex] = array[placeIndex - 1];
                        array[placeIndex - 1] = holdLowValue;
                    }
                    else {
                        break;
                    }
                }
            }
        }

        return array;
    }
}
