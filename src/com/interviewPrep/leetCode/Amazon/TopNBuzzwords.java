package com.interviewPrep.leetCode.Amazon;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TopNBuzzwords {
    public List<String> topNToys(int numToys, int topToys, List<String> toys, int numQuotes, List<String> quotes) {
        List<String> topToysArray = new ArrayList<>(topToys);
        HashMap<String, Integer> toysMap = new HashMap<String, Integer>();
        for(String toy : toys) {
            toysMap.put(toy, 0);
        }
        for (String quote : quotes) {
            String[] words = quote.toLowerCase().split("\\s+");
            for(String word : words) {
                if (toysMap.containsKey(word)){
                    toysMap.put(word, (toysMap.get(word) == 0) ? 1 : toysMap.get(word) + 1);
                }
            }
        }

        return topToysArray;
    }
}
