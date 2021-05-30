package com.interviewPrep.algoexpert.Strings.easy;

public class PalindromeCheck {
   /* public boolean isPalindrome(String str) {
        char[] charArray = str.toCharArray();
        if (charArray.length < 2) return true;
        int leftIndex = 0, rightIndex = (charArray.length - 1);
        while (leftIndex < rightIndex) {
            while (!Character.isLetterOrDigit(charArray[leftIndex]) && leftIndex < rightIndex) {
                leftIndex = leftIndex + 1;
            }
            while (!Character.isLetterOrDigit(charArray[rightIndex]) && rightIndex > leftIndex) {
                rightIndex = rightIndex - 1;
            }
            if (!(Character.toLowerCase( charArray[leftIndex++]) == Character.toLowerCase(charArray[rightIndex--]))) {
                return false;
            }
        }
        return true;
    }*/

   public boolean isPalindrome(String s) {
       char[] strChar = s.toCharArray();
       if(s.isEmpty()) return true;
       int leftIndx = 0, rightIndx = strChar.length - 1;
       while(leftIndx < rightIndx) {
           while(!Character.isLetterOrDigit(s.charAt(leftIndx))) {
               leftIndx++;
           }
           while(!Character.isLetterOrDigit(s.charAt(rightIndx))) {
               rightIndx--;
           }
           if(!(Character.toLowerCase(s.charAt(leftIndx++)) == Character.toLowerCase(s.charAt(rightIndx--)))) {
               return false;
           }
       }
       return true;
   }
}
