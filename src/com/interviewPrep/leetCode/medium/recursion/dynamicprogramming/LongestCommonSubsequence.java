package com.interviewPrep.leetCode.medium.recursion.dynamicprogramming;

public class LongestCommonSubsequence {

//    Dynamic Programming
    public int longestCommonSubsequence(String text1, String text2) {
        if (text1.length() == 0 || text2.length() == 0) return 0;
        int[][] dp = new int[text1.length() + 1][text2.length() + 1];
        char[] charStr1 = text1.toCharArray();
        char[] charStr2 = text2.toCharArray();

        for (int indxStr1 = 1; indxStr1 <= text1.length() ; indxStr1++) {
            for (int indxStr2 = 1; indxStr2 <= text2.length() ; indxStr2++) {
                if (charStr1[indxStr1 - 1] == charStr2[indxStr2 - 1]) {
                    dp[indxStr1][indxStr2] = 1 + dp[indxStr1 - 1][indxStr2 - 1];

                } else {
                    dp[indxStr1][indxStr2] = Math.max(dp[indxStr1 - 1][indxStr2], dp[indxStr1][indxStr2 - 1]);
                }
            }
        }
        return dp[text1.length()][text2.length()];
    }


//    Recurssive solution with memo
/*    char[] chrString1;
    char[] chrString2;
    int[][] memo;
    public int longestCommonSubsequence(String text1, String text2) {
//        edge
        if (text1.length() == 0 || text2.length() == 0) return 0;
        chrString1 = text1.toCharArray();
        chrString2 = text2.toCharArray();
        memo = new int[chrString1.length][chrString2.length];
        return longestCommonSubseq(text1.length() - 1, text2.length() - 1);
    }

    public int longestCommonSubseq(int str1Len, int str2Len) {
//        Base
        if (str1Len < 0 || str2Len < 0) return 0;

        if (memo[str1Len][str2Len] != 0) return memo[str1Len][str2Len];

        if (chrString1[str1Len] == chrString2[str2Len]) {
            memo[str1Len][str2Len] = 1 + longestCommonSubseq(str1Len - 1, str2Len - 1);
            return memo[str1Len][str2Len];
        }

        return memo[str1Len][str2Len] = Math.max(longestCommonSubseq(str1Len, str2Len - 1), longestCommonSubseq(str1Len - 1, str2Len));
    }*/
}
