package com.interviewPrep.educative.algorithms.mergeIntervals;

import com.interviewPrep.models.Interval;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class MergeIntervals {
    public List<Interval> merge(List<Interval> intervals) {
        List<Interval> mergedIntervals = new ArrayList<>();
        PriorityQueue<Interval> intervalMinQ = new PriorityQueue<>(
                (interval1, interval2) -> interval1.start - interval2.start
        );
        intervalMinQ.addAll(intervals);
        Interval firstInterval = intervalMinQ.poll();
        int currStart = firstInterval.start;
        int currEnd = firstInterval.end;
        while (!intervalMinQ.isEmpty()) {
            firstInterval = intervalMinQ.poll();
            if (currEnd > firstInterval.start) {
                if (currEnd < firstInterval.end) currEnd =  firstInterval.end ;
            } else {
                mergedIntervals.add(new Interval(currStart, currEnd));
                currStart = firstInterval.start;
                currEnd = firstInterval.end;
            }
        }
        mergedIntervals.add(new Interval(currStart, currEnd));
        return mergedIntervals;
    }
}
