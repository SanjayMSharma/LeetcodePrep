package com.interviewPrep.educative.algorithms.subsets;

import java.util.*;

public class BalancedParentheses {
    public List<String> generateValidParentheses (int level) {
        List<String> rtnParList = new ArrayList<>();
        Queue<String> levelsQ = new LinkedList<>();
        levelsQ.add("()");
        int currentLevel = 1;

        while (!levelsQ.isEmpty()) {
            int qSize = levelsQ.size();
            currentLevel++;

            Set<String> currChildSet = new HashSet<>();

            for (int childIndx = 0; childIndx < qSize; childIndx++) {
                String currentElm = levelsQ.poll();

                for (int insrtIndx = 0; insrtIndx < 3; insrtIndx++) {
                    StringBuilder par = new StringBuilder("()");
                    StringBuilder newChild = par.insert(insrtIndx, currentElm);
                    String newChildStr = String.valueOf(newChild);
                    if (!currChildSet.contains(newChildStr)) {
                        currChildSet.add(String.valueOf(newChildStr));
                        if (currentLevel < level) levelsQ.add(String.valueOf(newChildStr));
                        else rtnParList.add(String.valueOf(newChildStr));
                    }
                }
            }
        }
        return rtnParList;
    }
}
