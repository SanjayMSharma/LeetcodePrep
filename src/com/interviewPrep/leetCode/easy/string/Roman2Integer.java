package com.interviewPrep.leetCode.easy.string;

import java.util.HashMap;
import java.util.Map;

public class Roman2Integer {
    public int romanToInt(String roman) {
        if (roman.length() == 0) return 0;
        char[] romanCharArr = roman.toCharArray();
        int totalSum = 0;
        Map<Character, Integer> romanMap = new HashMap<>();
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);
        for (int indx = 0; indx < romanCharArr.length; indx++) {
//            base case
            if (indx == romanCharArr.length - 1) {
                totalSum += romanMap.get(romanCharArr[indx]);
            } else {
                int firstChar = romanMap.get(romanCharArr[indx]);
                int secondChar = romanMap.get(romanCharArr[indx + 1]);
                if (firstChar < secondChar) {
                    totalSum += (secondChar - firstChar);
                    indx++;
                } else {
                    totalSum += firstChar;
                }
            }
        }
        return totalSum;
    }
}
