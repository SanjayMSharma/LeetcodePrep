package com.interviewPrep.leetCode.easy;

public class DefangIPAddr {
    public String defangIPAddr (String address) {
        char[] addrChar = address.toCharArray();
        char[] newChar = new char[addrChar.length + 10];
        int newCharIndx = 0;
        for(int indx = 0; indx < addrChar.length; indx++) {
            if(addrChar[indx] == '.') {
                newChar[newCharIndx++] = '[';
                newChar[newCharIndx++] = '.';
                newChar[newCharIndx++] = ']';

            } else {
                newChar[newCharIndx++] = addrChar[indx];
            }
        }
        String returnString = String.valueOf(newChar);

        return returnString.trim();
    }
}
