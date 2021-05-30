package com.interviewPrep.leetCode.easy.string;

public class PalindromeCheck2 {

    public boolean validPalindrome(String s) {
//        if it empty or 1 just return str
        if(s.length() <= 1) return true;
        int rightIndx = s.length();
        boolean isOnceDiff = false;

        for(int leftIndx = 0; leftIndx < s.length(); leftIndx++) {
            if(s.charAt(leftIndx) == s.charAt(rightIndx)) rightIndx--;
            else {
                if(isOnceDiff) return false;
                isOnceDiff = true;
                if(s.charAt(leftIndx) == s.charAt(rightIndx - 1)) rightIndx--;
                else if (s.charAt(leftIndx + 1) == s.charAt(rightIndx)) leftIndx++;
                else return false;
            }
            if (leftIndx > rightIndx) return true;
        }
        return false;
    }
    /*public boolean validPalindrome(String s) {
   *//*     char[] charStr = s.toCharArray();
        char c = s.charAt();
        if (charStr.length < 2) return true;
        int leftIndex = 0, rightIndex = (charStr.length - 1);
        boolean specialCaseFlag = false;
        while (leftIndex < rightIndex) {
            if (!(Character.toLowerCase(charStr[leftIndex])  == Character.toLowerCase(charStr[rightIndex]))){
                return pelindromeHelper(charStr, (leftIndex + 1), rightIndex) || pelindromeHelper(charStr, leftIndex, (rightIndex - 1));
            }
            else {
                leftIndex++;
                rightIndex--;
            }
        }
        return true;
    }

    public boolean pelindromeHelper(char[] charStr, int leftIndex, int rightIndex) {
        while (leftIndex < rightIndex) {
            if(!( Character.toLowerCase(charStr[leftIndex++]) == Character.toLowerCase(charStr[rightIndex--]))) {
                return false;
            }
        }
        return true;
    *//*
        *//*char[] charStr = s.toCharArray();
        int leftIndex = 0, rightIndex = (s.length() - 1);
        while (leftIndex < rightIndex) {
            if(!(charStr[leftIndex++] == charStr[rightIndex--])) {
                return palindromeHelper(charStr, leftIndex, rightIndex + 1) || palindromeHelper(charStr, leftIndex - 1, rightIndex);
            }
        }
        return true;
    }

    public boolean palindromeHelper(char[] charStr,int leftIndex,int rightIndex) {

        while (leftIndex < rightIndex) {
            if(!(charStr[leftIndex++] == charStr[rightIndex--])) {
                return false;
            }
        }
        return true;
    }*//*

        if(s==null || s.length()<2){
            return true;
        }
        return isPalindrome(s,0,s.length()-1,1);
    }*/
    private boolean isPalindrome(String s,int left , int right, int miss) {
        if(miss<0){
            return false;
        }
        while(left<right){
            if(s.charAt(left)==s.charAt(right)){
                left++;
                right--;
            }
            else{
                return isPalindrome(s,left+1,right,miss-1)||isPalindrome(s,left,right-1,miss-1);
            }
        }
        return true;
    }

}
