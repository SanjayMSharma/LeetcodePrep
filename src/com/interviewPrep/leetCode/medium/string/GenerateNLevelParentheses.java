package com.interviewPrep.leetCode.medium.string;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class GenerateNLevelParentheses {

//    Backtracking
    public List<String> generateParenthesis(int n) {
        ArrayList<String> validParenthesis = new ArrayList<>();
        validParenthesisGenerator(validParenthesis,"(", 1, 0,  n);
        return validParenthesis;
    }
    public void validParenthesisGenerator( List<String> validParenthesis,String str, int openCount, int closeCount, int n) {
//        Base case
        if (str.length() == n*2) {
            validParenthesis.add(str);
            return ;
        }
//        Bounding Function
        if (openCount < n)
            validParenthesisGenerator(validParenthesis,str+"(", openCount + 1, closeCount, n);
        if (closeCount < openCount)
            validParenthesisGenerator(validParenthesis,str + ")", openCount, closeCount + 1, n);
    }

//    Self generated Technique, Adding "()" at index 0 - n
    /*public List<String> generateParenthesis(int n) {
        HashSet<String> nullSet = new HashSet<>();
        nullSet.add("");
        Set<String> rtnSet = parenthesisGenerator(1, n, nullSet);
        List<String> rtnParenthesis = new ArrayList<>(rtnSet);
        return rtnParenthesis;
    }
    public Set<String> parenthesisGenerator(int currLevel, int n, Set<String> parentSet) {
        Set<String> currSet = new HashSet<>();
        for (String elm: parentSet) {
            for (int indx = 0; indx < currLevel; indx++) {
                currSet.add(new StringBuilder(elm).insert(indx, "()").toString());
            }
        }
        if (currLevel != n)
            return parenthesisGenerator(currLevel + 1, n, currSet);
        else return currSet;
    }*/
}

//  BackTracking Bottom-up (Done): Started State space tree, worked on bounding function for '(' count less than n and ')' count less than open  ||

//  Subset: Added "()" parentheses at all the inded from 0 - n, for all the previously generated elm.