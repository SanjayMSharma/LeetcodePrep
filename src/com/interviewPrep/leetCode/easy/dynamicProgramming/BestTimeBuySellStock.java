package com.interviewPrep.leetCode.easy.dynamicProgramming;

public class BestTimeBuySellStock {
    public int maxProfit(int[] prices) {
        if (prices.length == 0 ) return 0;
        int maxProfit = 0, currlow = prices[0];
        for (int indx = 1; indx < prices.length; indx++) {
            if (currlow > prices[indx]) {
                currlow = prices[indx];
            } else {
                if (maxProfit < (prices[indx] - currlow))
                    maxProfit = prices[indx] - currlow;
            }
        }
        return maxProfit;
    }
}
