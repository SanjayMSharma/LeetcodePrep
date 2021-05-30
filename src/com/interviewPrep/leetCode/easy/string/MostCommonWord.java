package com.interviewPrep.leetCode.easy.string;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.PriorityQueue;

public class MostCommonWord {
    public String mostCommonWord(String paragraph, String[] banned) {
        String[] splitPara = paragraph.split("\\s+|,\\s*|\\.\\s*");
        HashSet<String> bannedSet = new HashSet<>();
        PriorityQueue<Map.Entry<String, Integer>> maxHeap = new PriorityQueue<>(
                (entry1, entry2) -> entry2.getValue() - entry1.getValue()
        );
        HashMap<String, Integer> wordCount = new HashMap<>();

        for (String word: banned)
            bannedSet.add(word);
        for (String word: splitPara) {
            String onlyWord = word.replaceAll("[\\W]", "").toLowerCase();
            if (!bannedSet.contains(onlyWord)) wordCount.put(onlyWord, wordCount.getOrDefault(onlyWord, 0) + 1);
        }
        maxHeap.addAll(wordCount.entrySet());
        return maxHeap.poll().getKey();
    }
}
