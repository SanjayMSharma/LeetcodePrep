package com.interviewPrep.educative.algorithms.topKElements;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class StrCharFrequencySort {
    public String sortCharacterByFrequency(String str) {
        char[] strChar = str.toCharArray();
        Map<Character, Integer> charCount = new HashMap<>();
        for (char chr : strChar) charCount.put(chr, charCount.getOrDefault(chr, 0) + 1);

        PriorityQueue<Map.Entry<Character, Integer>> topCharQ = new PriorityQueue<>(
                (char1Entry, char2Entry) -> (char1Entry.getValue() == char2Entry.getValue()) ? char1Entry.getKey() - char2Entry.getKey() : char2Entry.getValue() - char1Entry.getValue()
        );
        for (Map.Entry<Character, Integer> chrCountMap : charCount.entrySet()) topCharQ.add(chrCountMap);

        for (int indx = 0; indx < strChar.length; indx++) {
            Map.Entry<Character, Integer> topCharCount = topCharQ.remove();
            for (int indxCont = 0; indxCont < topCharCount.getValue(); indxCont++) {
                strChar[indx + indxCont] = topCharCount.getKey();
                if (indxCont == topCharCount.getValue() - 1)
                    indx = indx + indxCont;
            }
        }
        return String.valueOf(strChar);
    }
}
