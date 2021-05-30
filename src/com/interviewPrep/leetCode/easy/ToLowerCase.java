package com.interviewPrep.leetCode.easy;

public class ToLowerCase {
    public String toLowerCase(String str) {
        char[] charArr = str.toCharArray();
        for (int indx = 0; indx < str.length(); indx++) {
            if(charArr[indx] < 91 && charArr[indx] > 64) {
                int charInt = charArr[indx] + 32;
                charArr[indx] = (char) charInt;
            }
        }
        return String.valueOf(charArr);
    }
}
