package com.interviewPrep.educative.algorithms.topKElements;

import java.util.PriorityQueue;

public class ConnectRopes {
    public int minimumCostToConnectRopes(int[] ropeLengths) {
        if (ropeLengths.length == 0) return 0;
        int totallength = 0;
        PriorityQueue<Integer> allRopes = new PriorityQueue<>(
                (rope1, rope2) -> rope1 - rope2
        );
        for (int rope : ropeLengths)
            allRopes.add(rope);

        while (allRopes.size() > 1) {
            int leastlength = allRopes.remove() + allRopes.remove();
            totallength = totallength + leastlength;
            allRopes.add(leastlength);
        }
        return totallength;
    }
}
