package com.interviewPrep.leetCode.easy;

import javax.swing.text.AttributeSet;

public class IntegerToAlphabet {
    public String intToAlpha(String s) {
        StringBuilder sb = new StringBuilder();
        for(int indx = 0; indx < s.length(); indx++) {
            if(s.charAt(indx) == '#') {
                continue;
            } else if ((indx + 2) < s.length()){
                if(s.charAt(indx + 2) == '#') {
                    int firstAlpa = (Character.getNumericValue(s.charAt(indx)) ) * 10;
                    int secChar = Character.getNumericValue(s.charAt(indx+1));
                    sb.append((char) (96 + (firstAlpa + secChar )));
                    indx = indx + 2;
                } else {
                    sb.append ((char) (96 + (Character.getNumericValue(s.charAt(indx)))));
                }
            } else {
                sb.append ((char) +(96 + (Character.getNumericValue(s.charAt(indx)))));
            }
        }
        return sb.toString();
    }
}
