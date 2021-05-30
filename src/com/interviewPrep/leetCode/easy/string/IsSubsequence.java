package com.interviewPrep.leetCode.easy.string;

import java.util.*;

public class IsSubsequence {
    public boolean isSubsequence(String s, String t) {
        char[] charStr = t.toCharArray();
        List<String> subStrArr = new ArrayList<>();
        Set<String> subSeqSet = new HashSet<>();
        subStrArr.add("");
        subSeqSet.add("");
        for (char chr : charStr) {
            int subSeqArrSize = subStrArr.size();
            for (int indx = 0; indx < subSeqArrSize; indx++) {
                String newSubStr = subStrArr.get(indx).concat(String.valueOf(chr));
                subStrArr.add(newSubStr);
                subSeqSet.add(newSubStr);
            }
        }
        if (subSeqSet.contains(s)) return true;
        return false;
    }
}
