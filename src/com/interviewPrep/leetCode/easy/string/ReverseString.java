package com.interviewPrep.leetCode.easy.string;

public class ReverseString {

//    Practice 2
    public void reverseString(char[] s) {
        int endCounter = s.length - 1;
        int startCounter = 0;
        while (startCounter < endCounter) {
            char temp = s[endCounter];
            s[endCounter--] = s[startCounter];
            s[startCounter++] = temp;
        }
    }


//    Practice 1
  /*  public char[] reverseString (char[] s) {
        int leftIndx = 0, rightIndx = s.length - 1;
        while (leftIndx < rightIndx) {
            char tempChar;
            tempChar = s[leftIndx];
            s[leftIndx++] = s[rightIndx];
            s[rightIndx--] = tempChar;
        }
        return s;
    }

    public int reverseInt(int num) {
        String intStr = String.valueOf(num);
        char[] charstr = intStr.toCharArray();
        int leftIndx = 0, rightIndx = charstr.length - 1;
        while (leftIndx < rightIndx){
            char tempChar = charstr[leftIndx];
            charstr[leftIndx++] = charstr[rightIndx];
            charstr[rightIndx--] = tempChar;
        }
        intStr = String.valueOf(charstr);
        num = Integer.valueOf(intStr);

        return num;
    }*/
}
