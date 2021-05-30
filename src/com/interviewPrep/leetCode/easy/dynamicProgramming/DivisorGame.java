package com.interviewPrep.leetCode.easy.dynamicProgramming;

public class DivisorGame {
//    Incomplete problem
    public boolean divisorGame(int n) {
        return currentTurn(n, true);
    }
    public boolean currentTurn(int n, boolean user) {
        if (n < 2) return !user;
        int chooseX  = (n % 2 == 0)? n/2 : (n - 1) / 2;
        return currentTurn( n - chooseX, !user);
    }
}
