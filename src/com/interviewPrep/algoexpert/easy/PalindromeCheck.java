package com.interviewPrep.algoexpert.easy;

public class PalindromeCheck {
    public boolean isPalindrome (String str) {
        boolean isPalindrome = false;
        char[] charArray = str.toCharArray();
        int charLength =  charArray.length;
        int midCharIndex = 0;
        if ((charLength % 2) == 0) {
           midCharIndex = (charArray.length / 2) - 1;
            for (int index = 0; index <= midCharIndex ; index++){
                if (charArray[midCharIndex - index] == charArray[(midCharIndex + 1) + index]) {
                    isPalindrome = true;
                } else {
                    isPalindrome = false;
                    break;
                }
            }
        } else {
            midCharIndex = charArray.length / 2;
            for (int index = 0; index <= midCharIndex ; index++){
                if (charArray[midCharIndex - index] == charArray[midCharIndex + index]) {
                    isPalindrome = true;
                } else {
                    isPalindrome = false;
                    break;
                }
            }
        }
        return isPalindrome;
    }
}
