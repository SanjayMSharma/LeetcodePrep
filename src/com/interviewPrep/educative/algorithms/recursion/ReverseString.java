package com.interviewPrep.educative.algorithms.recursion;

public class ReverseString {
    public String reverseThis(String str) {
        if (str.length() == 1) return str;

        char firstChr = str.charAt(0);
        String remainingStr = str.substring(1);

//        return reverseThis(str.substring(1)).concat(String.valueOf(str.charAt(0)));

        return reverseThis(remainingStr).concat(String.valueOf(firstChr));
    }
}
