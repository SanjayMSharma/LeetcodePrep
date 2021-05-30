package com.interviewPrep.leetCode.medium;

public class StringToInteger {
    public int myAtoi(String str) {
        char[] strChar = str.toCharArray();
        int strIndx = 0;
        boolean isLetter = false, iniWht = false;
        while(strIndx < strChar.length) {
            while(Character.isSpaceChar(strChar[strIndx])) {
                strIndx++;
            }
            if (Character.isLetter(strChar[strIndx])) {

            }
        }
        return 0;
    }
}
