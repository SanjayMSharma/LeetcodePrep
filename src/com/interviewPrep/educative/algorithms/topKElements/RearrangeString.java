package com.interviewPrep.educative.algorithms.topKElements;

import sun.applet.resources.MsgAppletViewer;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class RearrangeString {

    public String rearrangeStr(String str) {
        Map<Character, Integer> charCountMAp = new HashMap<>();
        StringBuilder sbr = new StringBuilder();
        for (char chr : str.toCharArray())
            charCountMAp.put(chr, charCountMAp.getOrDefault(chr, 0) + 1);

        PriorityQueue<Map.Entry<Character, Integer>> charMaxHeap = new PriorityQueue<>(
                (Entry1, Entry2) -> Entry2.getValue() - Entry1.getValue()
        );
        charMaxHeap.addAll(charCountMAp.entrySet());

        Map.Entry<Character, Integer> tempEntry = null;

        while (!charMaxHeap.isEmpty()) {
            Map.Entry<Character, Integer> currEntry = charMaxHeap.poll();
            sbr.append(currEntry.getKey());
            currEntry.setValue(currEntry.getValue() - 1);
            tempEntry = currEntry;
        }
        return "";
    }

    /*public String rearrangeStr(String str) {
        char[] charStr = str.toCharArray();
        char[] rtnStr = new char[charStr.length];
        int rtnStrCounter = 0;

        Map<Character, Integer> charCountMap = new HashMap<>();
        for (char chr : charStr)
            charCountMap.put(chr, charCountMap.getOrDefault(chr, 0) + 1);

        PriorityQueue<Map.Entry<Character, Integer>> maxCharCountHeap = new PriorityQueue<>(
                (chr1, chr2) -> chr2.getValue() - chr1.getValue()
        );

        Map.Entry<Integer, Integer> tempEntry ;

        for (Map.Entry<Character, Integer> chrEntry : charCountMap.entrySet() )
            maxCharCountHeap.add(chrEntry);

        int elm1Count = 0, elm2Count = 0;
        char elm1Char = 0, elm2Char = 0;
        while (!maxCharCountHeap.isEmpty()) {
            if (elm1Count == 0) {
                Map.Entry<Character, Integer> currentElm1 = maxCharCountHeap.poll();
                elm1Char = currentElm1.getKey();
                elm1Count = currentElm1.getValue();
            }
            if (elm2Count == 0 && !maxCharCountHeap.isEmpty()) {
                Map.Entry<Character, Integer> currentElm2 = maxCharCountHeap.poll();
                elm2Char = currentElm2.getKey();
                elm2Count = currentElm2.getValue();
            }
            while (elm1Count > 0 && elm2Count > 0) {
                rtnStr[rtnStrCounter++] = elm1Char;
                rtnStr[rtnStrCounter++] = elm2Char;
                elm1Count--;
                elm2Count--;
            }
        }
        if (elm1Count == 1) {
            if (rtnStr[rtnStrCounter - 1] != elm1Char) rtnStr[rtnStrCounter++] = elm1Char;
            else return "";
        }
        if (elm2Count == 1) {
            if (rtnStr[rtnStrCounter - 1] != elm2Char) rtnStr[rtnStrCounter++] = elm2Char;
            else return "";
        }
        return (rtnStrCounter >= str.length()) ? String.valueOf(rtnStr) : "";
        }*/

}
