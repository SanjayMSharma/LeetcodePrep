package com.interviewPrep.leetCode.medium.recursion.dynamicprogramming;

public class CountSquareSubmatrices {
    int[][] matric;
    int[][] memo;
    int totalSqur = 0;
    public int countSquares(int[][] matrix) {
        if (matrix.length == 0) return 0;
        this.matric = matrix;
        memo = new int[matrix.length][matrix[0].length];
        countCurrSquareLevel(0,0);
        return totalSqur;
    }

    public int countCurrSquareLevel (int i, int j) {
//        Base
        if (i == matric.length || j == matric[0].length) return 0;

//        if Memo
        if (memo[i][j] != 0) return memo[i][j];

//        Rec Logic using DFS
        int minChild = Integer.MAX_VALUE;
        minChild = Math.min(minChild, countCurrSquareLevel(i, j + 1));
        minChild = Math.min(minChild, countCurrSquareLevel(i + 1, j ));
        minChild = Math.min(minChild, countCurrSquareLevel(i + 1, j + 1));

        if (matric[i][j] == 1)
            memo[i][j] = matric[i][j] + minChild;
        totalSqur = totalSqur + memo[i][j];
        return memo[i][j];
    }
}
