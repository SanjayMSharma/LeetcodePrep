package com.interviewPrep.leetCode.easy.string;

public class DefangingIPAddress {

    public String defangIPaddr(String address) {
        StringBuilder rtnStr = new StringBuilder();
        Character checkChr = '.';
        for (int indx = 0; indx < address.length(); indx++) {
            if ( checkChr.equals(address.charAt(indx)))
                rtnStr.append("[.]");
            else
                rtnStr.append(address.charAt(indx));
        }
        return rtnStr.toString();
    }

    /*public String defangIPaddr(String address) {
        char[] strChr = address.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (char c : strChr) {
            if (c == 46)
                sb.append("[.]");
            else sb.append(c);
        }
        return sb.toString();
    }*/
}
