package com.interviewPrep.leetCode.medium.topologicalsort;

import java.util.*;

public class CourseSchedule2 {
    public int[] findOrder(int numCourses, int[][] prerequisites) {

//        Edge Case
        if (numCourses < 2) return new int[1];
        if (prerequisites.length == 1) return prerequisites[0];

        int[] courseOrder = new int[numCourses];
        int courseIndx = 0;

        int[] inDegreeCounter = new int[numCourses];
        Map<Integer, List<Integer>> childrnList = new HashMap<>();
        Queue<Integer> currMinElm = new LinkedList<>();

        for (int indx = 0; indx < prerequisites.length; indx++) {
            List<Integer> currChild = childrnList.get(prerequisites[indx][1]);
            if (currChild == null) currChild = new ArrayList<>();
            currChild.add(prerequisites[indx][0]);
            childrnList.put(prerequisites[indx][1], currChild);

//            Added parent count
            inDegreeCounter[prerequisites[indx][0]]++;
        }

        for (int indx = 0; indx < numCourses; indx++) {
            if (inDegreeCounter[indx] == 0) currMinElm.add(indx);
        }

        while (!currMinElm.isEmpty()) {
            int currCourse = currMinElm.poll();
            courseOrder[courseIndx++] = currCourse;
            List<Integer> currChildrn = childrnList.get(currCourse);
            if (currChildrn != null){
                for (int child : currChildrn) {
                    if (--inDegreeCounter[child] == 0) currMinElm.add(child);
                }
            }
        }
        if (courseIndx < numCourses) return new int[0];
        return courseOrder;
    }
}
