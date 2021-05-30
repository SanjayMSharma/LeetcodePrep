package com.interviewPrep.educative.algorithms.topologicalSort;

import com.sun.javafx.tools.packager.MakeAllParams;

import java.util.*;

public class TopologicalSort {
    public List<Integer> sort( int vertices, int[][] edges) {
        if (edges.length < 2) {
            return new ArrayList<>();
        };

        List<Integer> rtnSortedList = new ArrayList<>();

        Map<Integer, List<Integer>> childVerticesListMap = new HashMap<>();
        Map<Integer, Integer> parentCountMap = new HashMap<>();

        Queue<Integer> leastInorder = new LinkedList<>();
        PriorityQueue<Map.Entry<Integer, Integer>> minHeap = new PriorityQueue<>(
                (entry1, entry2) -> entry1.getValue() - entry2.getValue()
        );

        for (int[] elm : edges)
            parentCountMap.put(elm[0], 0);

        for (int indx = 0; indx < edges.length; indx++) {
//            adding List of all child Vertices to Parent Map
            List<Integer> currParentChildList = childVerticesListMap.get(edges[indx][0]);
            if (currParentChildList == null) currParentChildList = new ArrayList<>();
            currParentChildList.add(edges[indx][1]);
            childVerticesListMap.put(edges[indx][0], currParentChildList);

//            Inserting parents count
            parentCountMap.put(edges[indx][1], parentCountMap.getOrDefault(edges[indx][1] , 0) + 1);
        }

        minHeap.addAll(parentCountMap.entrySet());

        while (!minHeap.isEmpty()) {
            Map.Entry<Integer, Integer> currentElm = minHeap.peek();
            if (currentElm.getValue() == 0) {
                rtnSortedList.add(currentElm.getKey());
                List<Integer> currChild = childVerticesListMap.get(currentElm.getKey());
                if (null != currChild) {
                    for (int elm: currChild) {
                        parentCountMap.put(elm, parentCountMap.get(elm) - 1);
                    }
                }
                minHeap.remove();
            }
        }
        return rtnSortedList;
    }

}

