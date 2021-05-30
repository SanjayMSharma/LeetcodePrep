package com.interviewPrep.interview;

import java.util.*;

public class Interview {
//    String s ="abc abc def def abc def xyz abc"

    public Map<String, Integer> countWords(String str) {

        List<String>  allStr = Arrays.asList(str.split(" "));

        Map<String, Integer> counterMap = new HashMap<>();

        for(String word: allStr) {
            counterMap.put(word, counterMap.getOrDefault(word, 0) + 1);
        }
        return counterMap;
    }
}

