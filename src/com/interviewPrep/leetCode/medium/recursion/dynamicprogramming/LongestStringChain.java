package com.interviewPrep.leetCode.medium.recursion.dynamicprogramming;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class LongestStringChain {
    Map<String, Integer> memoMap = new HashMap<>();
    public int longestStrChain(String[] words) {

        if (words.length <= 1) return words.length;

        Arrays.sort(words, (a, b)-> a.length()-b.length());

        for (String word : words)
            memoMap.put(word, 0);
        int maxChain = 0;
        for (String word : words) {
            maxChain = Math.max( maxChain, strChainCount (word));
        }
        return maxChain;
    }

    public int strChainCount (String word) {
//        Base
        if (word.length() == 1) {
            if (memoMap.get(word) == null) return 0;
            return 1;
        }

//        Rec logic
        int maxChain = 0;

        if (memoMap.get(word) != null) {
            if (memoMap.get(word) == 0) {

                for (int indx = 0; indx < word.length(); indx++) {
                    String curStr = word.substring(0, indx) + word.substring(indx + 1);
                    maxChain = Math.max(maxChain ,strChainCount(curStr));
                }

                memoMap.put(word, maxChain + 1);
                return memoMap.get(word);
            } return memoMap.get(word);
        } else return 0;
    }
}
