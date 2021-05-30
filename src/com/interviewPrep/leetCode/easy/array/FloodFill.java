package com.interviewPrep.leetCode.easy.array;

public class FloodFill {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
//        edge case
        if (image.length == 0) return image;
        if (newColor == image[sr][sc]) return image;
        int currColor = image[sr][sc];
        floodFillHelper(image, sr, sc, newColor, currColor);
        return image;
    }
    public void floodFillHelper(int[][] image, int sr, int sc, int newColor, int currColor) {
        if (image[sr][sc] == currColor) {
            image[sr][sc] = newColor;
            if (sr != 0) {
                if (image[sr-1][sc] == currColor) floodFillHelper(image, sr-1, sc, newColor, currColor);
            }
            if (sr != image.length - 1) {
                if (image[sr+1][sc] == currColor) floodFillHelper(image, sr+1, sc, newColor, currColor);
            }
            if (sc != image[0].length - 1) {
                if (image[sr][sc + 1] == currColor) floodFillHelper(image, sr, sc + 1, newColor, currColor);
            }
            if (sc != 0) {
                if (image[sr][sc - 1] == currColor) floodFillHelper(image, sr, sc - 1, newColor, currColor);
            }
        }
    }
}
