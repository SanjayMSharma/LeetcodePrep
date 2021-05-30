package com.interviewPrep.leetCode.Amazon;

import java.util.*;

public class TopKFrequentWords {
    public List<String> topKFrequentWords(String[] words, int k) {
        List<String> topKFreqWrd = new ArrayList<>();
        HashMap<String, Integer> wordCountMap = new HashMap<>();
        PriorityQueue<HashMap.Entry<String, Integer>> topKElementQ = new PriorityQueue<HashMap.Entry<String, Integer>>(
                (a, b) -> (a.getValue() == b.getValue()) ? a.getKey().compareTo(b.getKey()) : (b.getValue() - a.getValue())
        );

        for(String word : words) {
            wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
        }

        for(HashMap.Entry entrySet : wordCountMap.entrySet() ) {
            topKElementQ.add(entrySet);
        }

        for (int count = 0; count < k; count++) {
            HashMap.Entry<String, Integer> topWord = topKElementQ.poll();
            topKFreqWrd.add(topWord.getKey());
        }

        return topKFreqWrd;
    }
}
