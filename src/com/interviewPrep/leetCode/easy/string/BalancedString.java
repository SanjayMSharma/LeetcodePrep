package com.interviewPrep.leetCode.easy.string;

import java.util.ArrayList;
import java.util.List;

public class BalancedString {

    public int balancedStringSplit(String s) {
        if (s.length() == 0) return 0;
        if (s.length() == 2) return 1;
        int LCounter = 0, RCounter = 0, totalSubStr = 0;
        for (int indx = 0; indx < s.length(); indx++) {
            if (s.charAt(indx) == 'r' || s.charAt(indx) == 'R') RCounter++;
            else LCounter++;
            if (LCounter > 0 && LCounter == RCounter) {
                totalSubStr++;
                LCounter = 0;
                RCounter = 0;
            }
        }
        return totalSubStr;
    }
    /*public int balancedStringSplit(String s) {
        int totalCount = 0;
        int lCount = 0, rCount = 0, beginIndx = 0;
        List<String> subStrArry = new ArrayList<>();

        char[] charArry = s.toCharArray();

        for (int indx = 0; indx < s.length(); indx++) {
            if(charArry.length == 0 || (lCount !=0 && rCount != 0 && (lCount - rCount == 0)) || (indx == s.length() - 1)) {
                String subString = s.substring(beginIndx, (indx));
                subStrArry.add(subString);
                totalCount++;
                beginIndx = indx;
                rCount = 0;
                lCount = 0;
                if (indx != s.length() - 1)
                    indx--;
            } else {
                if (charArry[indx] == 82 ) {
                    rCount++;
                } else if (charArry[indx] == 76 ) {
                    lCount++;
                }
            }
        }
        int rtn = totalCount;
        return (subStrArry.size() == 0) ? 0 : totalCount;
    }*/
}
