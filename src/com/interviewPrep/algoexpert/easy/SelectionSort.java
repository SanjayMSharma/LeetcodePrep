package com.interviewPrep.algoexpert.easy;

public class SelectionSort {
    public int[] selectionSort(int[] array) {
        for(int lowestPositionIndex = 0; lowestPositionIndex < array.length; lowestPositionIndex++){
            int lowestValueindex = lowestPositionIndex;
            for (int moveIndex = lowestPositionIndex; moveIndex < array.length; moveIndex ++) {
                if (array[lowestValueindex] > array[moveIndex]){
                    lowestValueindex = moveIndex;
                }
            }
            int tempValueHolder = array[lowestPositionIndex];
            array[lowestPositionIndex] = array[lowestValueindex];
            array[lowestValueindex] = tempValueHolder;
        }
        return array;
    }
}
