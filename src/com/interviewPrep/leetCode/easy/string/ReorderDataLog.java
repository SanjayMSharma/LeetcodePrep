package com.interviewPrep.leetCode.easy.string;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class ReorderDataLog {
    public String[] reorderLogFiles(String[] logs) {
//        Edge
        if (logs.length < 2) return logs;
        int logIndx = 0;

        PriorityQueue<String> letterLogsMinQ = new PriorityQueue<>(
            (log1, log2) -> {return (log1.charAt(log1.indexOf(" ") + 1) > log2.charAt(log2.indexOf(" ") + 1)) ? 1 : 0;}
        );
        List<String> digString = new ArrayList<>();

        for (String log: logs) {
            if (Character.isDigit(log.charAt(log.indexOf(" ") + 1))) digString.add(log);
             else letterLogsMinQ.add(log);
        }
        while (!letterLogsMinQ.isEmpty())
            logs[logIndx++] = letterLogsMinQ.poll();

        for (String log : digString)
            logs[logIndx++] = log;

        return logs;
    }
}
