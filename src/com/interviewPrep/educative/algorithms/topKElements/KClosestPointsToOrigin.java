package com.interviewPrep.educative.algorithms.topKElements;

import java.util.*;

class Point {
    int x;
    int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int distFromOrigin() {
        // ignoring sqrt
        return (x * x) + (y * y);
    }
}

class KClosestPointsToOrigin {

    public static List<Point> findClosestPoints(Point[] points, int k) {
        ArrayList<Point> result = new ArrayList<>();

        PriorityQueue<Point> pointMaxHeap = new PriorityQueue<>(
                (point1, point2) -> point1.distFromOrigin() - point2.distFromOrigin()
        );

        for (Point point : points) {
            if (pointMaxHeap.size() > k) pointMaxHeap.remove();
            pointMaxHeap.add(point);
        }

        for (Point point: pointMaxHeap) result.add(point);

        return result;
    }

    public static void main(String[] args) {
        Point[] points = new Point[] { new Point(1, 3), new Point(3, 4), new Point(2, -1) };
        List<Point> result = KClosestPointsToOrigin.findClosestPoints(points, 2);
        System.out.print("Here are the k points closest the origin: ");
        for (Point p : result)
            System.out.print("[" + p.x + " , " + p.y + "] ");
    }
}

