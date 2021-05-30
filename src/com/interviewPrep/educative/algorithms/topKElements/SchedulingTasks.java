package com.interviewPrep.educative.algorithms.topKElements;

import java.util.*;

public class SchedulingTasks {

//  Using Queue with one Heap approach
    public int schedulingtasks(char[] taskList, int k) {
        int totalTime = 0;
        Map<Character, Integer> tastCountMap = new HashMap<>();
        for (char task : taskList)
            tastCountMap.put(task, tastCountMap.getOrDefault(task, 0) + 1);

        PriorityQueue<Map.Entry<Character, Integer>> tastMaxHeap = new PriorityQueue<>(
                (task1, tas2) -> (task1.getValue() == tas2.getValue()) ? task1.getKey() - tas2.getKey() : tas2.getValue() - task1.getValue()
        );
        tastMaxHeap.addAll(tastCountMap.entrySet());
        Queue<Map.Entry<Character, Integer>> waitListTask = new LinkedList<Map.Entry<Character, Integer>>();

        int waitTimeCounter = 0;
        StringBuilder stB = new StringBuilder();
        while (!tastMaxHeap.isEmpty() || !waitListTask.isEmpty()) {

            if ((tastMaxHeap.isEmpty() && !waitListTask.isEmpty())) {
                while (!waitListTask.isEmpty()){
                    tastMaxHeap.add(waitListTask.remove());
                }
                totalTime = totalTime + (k - waitTimeCounter) + 1;
                waitTimeCounter = 0;
            } else if (waitTimeCounter == k + 1 && !waitListTask.isEmpty()) {
                while (!waitListTask.isEmpty())
                    tastMaxHeap.add(waitListTask.remove());
                waitTimeCounter = 0;
            }else if (waitListTask.size() == k + 1) {
                tastMaxHeap.add(waitListTask.remove());
                waitTimeCounter = 0;
            }

            Map.Entry<Character, Integer> currentTast = tastMaxHeap.poll();
            totalTime = totalTime + 1;
            waitTimeCounter++;
            stB.append(currentTast.getKey());
            if (currentTast.getValue() > 1) {
                currentTast.setValue(currentTast.getValue() - 1);
                waitListTask.add(currentTast);
            }
        }
        return totalTime;
    }


//  Using Two Heaps approach
/*    public int schedulingtasks(char[] taskList, int k) {
        int totalTime = 0;
        Map<Character, Integer> tastCountMap = new HashMap<>();
        for (char tast : taskList)
            tastCountMap.put(tast, tastCountMap.getOrDefault(tast, 0) + 1);

        PriorityQueue<Map.Entry<Character, Integer>> tastMaxHeapFirst = new PriorityQueue<>(
                (task1, task2) -> task2.getValue() - task1.getValue()
        );
        PriorityQueue<Map.Entry<Character, Integer>> taskMaxHeapSec = new PriorityQueue<>(
                (task1, task2) -> task2.getValue() - task1.getValue()
        );

        tastMaxHeapFirst.addAll(tastCountMap.entrySet());
        boolean isFirstHeap = true;
        int currentHeapCount = Integer.MAX_VALUE;

        while (!tastMaxHeapFirst.isEmpty() || !taskMaxHeapSec.isEmpty()) {
            Map.Entry<Character, Integer> currentEntry;
            if (isFirstHeap) {
                if (currentHeapCount <= k) totalTime = totalTime + (k - currentHeapCount) + 1;
                currentHeapCount = 0;
                while (!tastMaxHeapFirst.isEmpty()) {
                    currentEntry = tastMaxHeapFirst.poll();
                    totalTime = totalTime + 1;
                    if (currentEntry.getValue() > 1) {
                        currentEntry.setValue(currentEntry.getValue() - 1);
                        taskMaxHeapSec.add(currentEntry);
                    }
                    currentHeapCount++;
                    if (currentHeapCount == k + 1) {
                        while (!tastMaxHeapFirst.isEmpty()) {
                            taskMaxHeapSec.add(tastMaxHeapFirst.poll());
                        }
                    }
                }
                isFirstHeap = !isFirstHeap;
            } else {
                if (currentHeapCount <= k) totalTime = totalTime + (k - currentHeapCount) + 1;
                currentHeapCount = 0;
                while (!taskMaxHeapSec.isEmpty()) {
                    currentEntry = taskMaxHeapSec.poll();
                    totalTime = totalTime + 1;
                    if (currentEntry.getValue() > 1) {
                        currentEntry.setValue(currentEntry.getValue() - 1);
                        tastMaxHeapFirst.add(currentEntry);
                    }
                    currentHeapCount++;
                    if (currentHeapCount == k + 1) {
                        while (!taskMaxHeapSec.isEmpty()) {
                            tastMaxHeapFirst.add(taskMaxHeapSec.poll());
                        }
                    }
                }
                isFirstHeap = !isFirstHeap;
            }
        }
        return totalTime;
    }*/
}
