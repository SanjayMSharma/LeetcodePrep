package com.interviewPrep.leetCode.easy.string;

import java.util.HashMap;
import java.util.Map;

public class FindUniqueChar {
    public int firstUniqChar(String s) {
        char[] charStr = s.toCharArray();
        Map<Character, Integer> charMap = new HashMap<>();
        for (char elm : charStr) {
            charMap.put(elm , (charMap.get(elm) != null) ? charMap.get(elm) + 1 : 1);
        }
        for (int indx = 0; indx < charStr.length; indx++) {
            if (charMap.get(charStr[indx]) == 1) {
                return indx;
            }
        }
        return -1;
    }
}
