package com.interviewPrep.algoexpert.easy;

public class NextLetter {
    public char searchNextLetter(char[] letters, char key) {
//        Edge case:
        if (letters.length == 0) return key;
        if (letters.length == 1) return letters[0];

//        Traversing logic
        int start = 0, end = letters.length - 1, mid = Integer.MIN_VALUE;
        while (start <= end) {
            mid = start + (end - start) / 2;
            if (letters[mid] == key) break;
            if (letters[mid] > key) end = mid - 1;
            if (letters[mid] < key) start = mid + 1;
        }
        if (letters[mid] <= key) {
            if (mid == letters.length - 1) return letters[0];
            return letters[mid + 1];
        }
        return letters[mid];
    }
}
