package com.interviewPrep.educative.algorithms.subsets;

import java.util.ArrayList;
import java.util.List;

public class StringPermutations {
    public List<String> findLetterCaseStringPermutations(String str) {
        char[] charStr = str.toCharArray();
        List<String> rtnStr = new ArrayList<>();
        rtnStr.add(String.valueOf(charStr));
        for (int indx = 0; indx < charStr.length; indx++) {
            if (Character.isLetter(charStr[indx]) && Character.isLowerCase(charStr[indx])) {
                List<String> tempList = new ArrayList<>();
                for (String currStr : rtnStr) {
                    char[] currStrChar = currStr.toCharArray();
                    currStrChar[indx] = Character.toUpperCase(currStrChar[indx]);
                    tempList.add(String.valueOf(currStrChar));
                }
                for (String strElm : tempList){
                    rtnStr.add(strElm);
                }
            }
        }
        return rtnStr;
    }
}
