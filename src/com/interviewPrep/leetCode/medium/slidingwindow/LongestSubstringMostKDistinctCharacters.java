package com.interviewPrep.leetCode.medium.slidingwindow;

import javafx.scene.control.SelectionMode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class LongestSubstringMostKDistinctCharacters {
//        Scenarios
//        1: Edge case: K 0, 1, elm aaabbccc
//        2: Edge case: string len less than k = 10, aaaaa
//        3: Distinct elm less than k: k=3, aaabbbb
//        4: Distinct elm more than k: K 2, aaabbcccss

//        Traversing tech: Nested for loop

//        Sudo code:
        /*for each loop on each elm
                create a new set to add distinct elm
                if the size of the set increase than k end the loop
                else increase the count of the length of the subArray
                check it with global len, if its max then replace*/

//        Sudo second:
    /* Loop through all the elm
            add the elm to ElmMap
            check if the size is more then K start reducing the size of the widow by increasing left counter
            if elmMap size is less, increase the size of the window and compare to the longestSubString and replace*/

    public int lengthOfLongestSubstringKDistinct(String s, int k) {
        if (k == 0) return 0;
        int longestSubStr = Integer.MIN_VALUE;
        Map<Character, Integer> charCounter = new HashMap<>();
        int leftSide = 0;
        for (int indx = 0; indx < s.length(); indx++) {
            charCounter.put( s.charAt(indx), charCounter.getOrDefault(s.charAt(indx), 0) + 1);
            while(charCounter.size() > k) {
                if(charCounter.get(s.charAt(leftSide)) > 1) charCounter.put(s.charAt(leftSide), charCounter.get(s.charAt(leftSide)) - 1);
                else charCounter.remove(s.charAt(leftSide));
                leftSide++;
            }
            longestSubStr = Math.max(longestSubStr, indx - leftSide );
        }
        return longestSubStr+1;
    }
   /* public int lengthOfLongestSubstringKDistinct(String s, int k) {
        if (k == 0) return 0;
        int longestSubString = Integer.MIN_VALUE;
        for (int indx = 0; indx < s.length(); indx++) {
            Set<Character> distinctSet = new HashSet<>();
            int currSubLen = 0;
            for (int secondIndx = indx; secondIndx < s.length(); secondIndx++) {
                if(!distinctSet.contains(s.charAt(secondIndx))) {
                    distinctSet.add(s.charAt(secondIndx));
                }
                if(distinctSet.size() <= k) {
                    longestSubString = Math.max(longestSubString, ++currSubLen);
                }else break;
            }
        }
        return longestSubString;
    }*/
}
