package com.interviewPrep.educative.algorithms.topKElements;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class DistanceRearrangeString {
    public String rearrange(String str, int k) {
        char[] charStr = str.toCharArray();
        char[] rtnStr = new char[str.length()];
        int rtnStrCounter = 0;
        boolean isPrimary = true;
        Map<Character, Integer> charCountMap = new HashMap<>();
        for (char chr : charStr)
            charCountMap.put(chr, charCountMap.getOrDefault(chr, 0) + 1);
        PriorityQueue<Map.Entry<Character, Integer>> firstcharMaxHeap = new PriorityQueue<>(
                (chrEntry1, chrEntry2) -> chrEntry2.getValue() - chrEntry1.getValue()
        );

        PriorityQueue<Map.Entry<Character, Integer>> secChrMaxHeap = new PriorityQueue<>(
                (entry1, entry2) -> entry2.getValue() - entry1.getValue()
        );

        firstcharMaxHeap.addAll(charCountMap.entrySet());
        int counter = Integer.MAX_VALUE;
        while (rtnStrCounter < str.length()) {
            Map.Entry<Character, Integer> currentEntry;

            if (isPrimary) {
                if (counter < k) return "";
                counter = 0;
                while (!firstcharMaxHeap.isEmpty()) {
                    currentEntry = firstcharMaxHeap.poll();
                    rtnStr[rtnStrCounter++] = currentEntry.getKey();
                    if (currentEntry.getValue() > 1){
                        currentEntry.setValue(currentEntry.getValue() - 1);
                        secChrMaxHeap.add(currentEntry);
                    }
                    counter++;
                }
                isPrimary = !isPrimary;
            }
            else {
                if (counter < k) return "";
                counter = 0;
                while (!secChrMaxHeap.isEmpty()) {
                    currentEntry = secChrMaxHeap.poll();
                    rtnStr[rtnStrCounter++] = currentEntry.getKey();
                    if (currentEntry.getValue() > 1) {
                        currentEntry.setValue(currentEntry.getValue() - 1);
                        firstcharMaxHeap.add(currentEntry);
                    }
                    counter++;
                }
                isPrimary = !isPrimary;
            }
        }
        return String.valueOf(rtnStr);
    }
}
