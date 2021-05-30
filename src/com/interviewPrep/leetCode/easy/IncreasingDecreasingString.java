package com.interviewPrep.leetCode.easy;

public class IncreasingDecreasingString {
    public String sortString(String str) {
        char[] charStr =  str.toCharArray();
        char[] sortedStr = new char[charStr.length];
        int selectedChar = Integer.MAX_VALUE;
        boolean minSelect = true;
        int sortIndx = 0, selectIndx = -1;
        int prevSelChr = Integer.MIN_VALUE;

        while (sortIndx < charStr.length) {
            if(minSelect) {
                for (int indx = 0; indx < charStr.length; indx++) {
                    if(charStr[indx] < selectedChar && prevSelChr < charStr[indx] && !(0 == charStr[indx])) {
                        selectedChar = charStr[indx];
                        selectIndx = indx;
                    }
                }
                if (selectedChar == Integer.MAX_VALUE) {
                    minSelect = !minSelect;
                    selectedChar = Integer.MIN_VALUE;
                    prevSelChr = Integer.MAX_VALUE;
                } else {
                    sortedStr[sortIndx++] = (char) selectedChar;
                    prevSelChr = selectedChar;
                    selectedChar = Integer.MAX_VALUE;
                    charStr[selectIndx] = 0;
                }
            } else {
                for (int indx = 0; indx < charStr.length; indx++) {
                    if (selectedChar < charStr[indx] && prevSelChr > charStr[indx] && !(0 == charStr[indx])) {
                        selectedChar = charStr[indx];
                        selectIndx = indx;
                    }
                }
                if (selectedChar == Integer.MIN_VALUE) {
                    minSelect = !minSelect;
                    selectedChar = Integer.MAX_VALUE;
                    prevSelChr = Integer.MIN_VALUE;
                } else {
                    sortedStr[sortIndx++] = (char) selectedChar;
                    prevSelChr = selectedChar;
                    selectedChar = Integer.MIN_VALUE;
                    charStr[selectIndx] = 0;
                }
            }
        }
        return String.valueOf(sortedStr);
    }
}
