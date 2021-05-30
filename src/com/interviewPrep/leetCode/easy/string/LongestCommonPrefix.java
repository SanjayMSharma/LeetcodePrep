package com.interviewPrep.leetCode.easy.string;

public class LongestCommonPrefix {

    public String longestCommonPrefix(String[] s) {
//        edge cases: single, null or empty array
        if(s.length == 0) return "";
        if(s.length == 1) return s[0];
//        Find smallest str
        String smallestStr = s[0];
        for(String str : s) {
            if(str.length() < smallestStr.length()) smallestStr = str;
        }
//        Iterate through all the strings.chars and loop until all the char are same
        int preFixEndIndx = 0;
        boolean stopFirstLoop = false;
        for (int smallestStrChrIndx = 0; smallestStrChrIndx < smallestStr.length(); smallestStrChrIndx++) {
            if(stopFirstLoop) break;
            preFixEndIndx = smallestStrChrIndx;
            for(int indx = 0; indx < s.length; indx++) {
                if(!(smallestStr.charAt(smallestStrChrIndx) == s[indx].charAt(smallestStrChrIndx))) {
                    preFixEndIndx--;
                    stopFirstLoop = true;
                    break;
                }
            }
        }
        return smallestStr.substring(0, preFixEndIndx+1);
    }

//    First attempt: Success
    /*public String longestCommonPrefix(String[] s) {
        if (s.length == 0) return "";
        if (s.length == 1) return s[0];
        StringBuffer sb = new StringBuffer();
        boolean isSame = true;
        int minLenStr = Integer.MAX_VALUE;
        for (String str : s) {
            if (str.length() < minLenStr) minLenStr = str.length();
        }
        for (int indx = 0; indx < minLenStr; indx++) {
            char currChr = s[0].charAt(indx);
            for (int strArrIndx = 1; strArrIndx < s.length; strArrIndx++) {
                if (s[strArrIndx].charAt(indx) != currChr) isSame = false;
            }
            if (!isSame) break;
            sb.append(currChr);
        }
        return sb.toString();
    }*/
}
