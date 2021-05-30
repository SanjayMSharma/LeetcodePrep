package com.interviewPrep.leetCode.medium.topologicalsort;

import java.util.*;

public class CourseSchedule {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
//        Edge cases
        if (numCourses == 1) return true;
        if (prerequisites.length < 2) return true;

        Map<Integer, Integer> totalParentCount = new HashMap<>();
        Map<Integer, List<Integer>> courseChildrnList = new HashMap<>();

        Queue<Integer> minElmQ = new LinkedList<>();

//        Inserting atleast 0 as a parent Count for all the elm
        for (int courseIndx = 0; courseIndx < numCourses; courseIndx++)
            totalParentCount.put(courseIndx, 0);

        for (int[] currCourse: prerequisites) {
            List<Integer> currChildrn = courseChildrnList.get(currCourse[1]);
            if (currChildrn == null) courseChildrnList.put(currCourse[1], new ArrayList<>());
            courseChildrnList.put(currCourse[1], courseChildrnList.get(currCourse[1])).add(currCourse[0]);

            totalParentCount.put(currCourse[0], totalParentCount.get(currCourse[0]) + 1);
        }

        for (Map.Entry<Integer, Integer> entry: totalParentCount.entrySet()) {
            if (entry.getValue() ==0) minElmQ.add(entry.getKey());
        }

        while (!minElmQ.isEmpty()) {
            int currElm = minElmQ.poll();
            totalParentCount.remove(currElm);
            List<Integer> currChildrs = courseChildrnList.get(currElm);
            if (null != currChildrs && 0 < currChildrs.size()) {
                for (int child : currChildrs) {
                    totalParentCount.put(child, totalParentCount.get(child) - 1);
                    if (totalParentCount.get(child) == 0) minElmQ.add(child);
                }
            }
        }

        if (totalParentCount.size() != 0) return false;

//        Using MinHeap: not rearranding the PQ again after removing the top element
/*      minHeap.addAll(totalParentCount.entrySet());
        while (!minHeap.isEmpty()) {
            Map.Entry<Integer, Integer> currElm = minHeap.peek();
            if (currElm.getValue() == 0) {
                List<Integer> currElmChildrns = courseChildrnList.get(currElm.getKey());
                if (null != currElmChildrns) {
                    for (int child : currElmChildrns)
                        totalParentCount.put(child, totalParentCount.get(child) - 1);
                }
                minHeap.remove();
            } else return false;
        }*/
        return true;
    }
}
