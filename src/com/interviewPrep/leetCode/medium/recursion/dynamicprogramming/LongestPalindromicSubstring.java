package com.interviewPrep.leetCode.medium.recursion.dynamicprogramming;

import java.util.HashMap;
import java.util.Map;

public class LongestPalindromicSubstring {

    char[] charStr;
    int leastStart = 0, maxEnd = 0, maxDist = 0;
    public String longestPalindrome(String s) {
//        Edge
        if (s.length() < 2) return s;
        charStr = s.toCharArray();
        for (int indx = 0; indx < s.length() - 1; indx++) {
            if (charStr[indx] == charStr[indx + 1])
                isPalindrome(indx, indx + 1);

            isPalindrome(indx, indx);
        }
        return s.substring(leastStart, maxEnd + 1);
    }

    public void isPalindrome(int start, int end) {
        if (start < 0 || end > charStr.length - 1) return;

        if (charStr[start] == charStr[end]) {
            if (maxDist < (end - start)) {
                maxDist = end - start;
                leastStart = start;
                maxEnd = end;
            }
            isPalindrome(start - 1, end + 1);
        } else return;
    }


/*
    char[] charStrArry;
    int leastStart= 0, maxEnd = 0;
    public String longestPalindrome(String s) {

        if (s.length() < 2) return s;

        charStrArry = s.toCharArray();
        boolean isTrue =  longestPalindromeHelper(0, charStrArry.length - 1);
        return (leastStart < maxEnd) ? s.substring(leastStart, maxEnd+1) : s.substring(0, 1);
    }

    public boolean longestPalindromeHelper(int start, int end) {
//        Base
        if (start >= end) return true;

        if (charStrArry[start] == charStrArry[end]) {
            if (longestPalindromeHelper(start + 1, end - 1)){
                if ((maxEnd - leastStart) < (end - start )) {
                    leastStart = start;
                    maxEnd = end;
                }
                return true;
            }
        } else {
            if (longestPalindromeHelper(start, end - 1)){
                if ((maxEnd - leastStart) < (end - start )) {
                    leastStart = start;
                    maxEnd = end - 1;
                }
            }

            if (longestPalindromeHelper(start + 1, end)){
                if ((maxEnd - leastStart) < (end - start )) {
                    leastStart = start + 1;
                    maxEnd = end;
                }
            }
        }
        return false;
    }
*/

//    Not the most effective: Time exceed exception
    /*Map<String, Boolean> isPalindromeCheck = new HashMap<>();
    public String longestPalindrome(String s) {
        return longestPalindromeHelper(s);
    }
    public String longestPalindromeHelper(String str) {

//        Base / Edge case
        if (str.length() <= 1) return null;

        if (isPalindromeCheck.get(str) != null) {
            if (isPalindromeCheck.get(str)) return str;
            else return null;
        }

        boolean isPalindrome = true;
        int startIndx = 0, endIndx = str.length() - 1;
        char[] chararr = str.toCharArray();
        while (isPalindrome && (startIndx < endIndx)) {
            if (chararr[startIndx] == chararr[endIndx]) {
                startIndx++;
                endIndx--;
            } else isPalindrome = false;
        }


        String rtnStr = null;
        if (isPalindrome) {
            isPalindromeCheck.put(str, true);
            return str;
        }


        else {
            String reduceEnd = str.substring(0, str.length() - 1);
            String reducesEndRtn = longestPalindromeHelper(reduceEnd);
            String reducedStart = str.substring(1, str.length());
            String reducedStartRtn = longestPalindromeHelper(reducedStart);

            if (reducedStartRtn != null && reducesEndRtn != null) {
                rtnStr = (reducedStartRtn.length() > reducesEndRtn.length()) ? reducedStartRtn : reducesEndRtn;
                isPalindromeCheck.put(reducedStartRtn, true);
                isPalindromeCheck.put(reducesEndRtn, true);
            } else if (reducedStartRtn != null) {
                rtnStr = reducedStartRtn;
                isPalindromeCheck.put(reducedStartRtn, true);
                isPalindromeCheck.put(reducesEndRtn, false);
            } else if (reducesEndRtn != null) {
                rtnStr = reducesEndRtn;
                isPalindromeCheck.put(reducesEndRtn, true);
                isPalindromeCheck.put(reducedStartRtn, false);
            }
        }
        return rtnStr;
    }
*/
}
