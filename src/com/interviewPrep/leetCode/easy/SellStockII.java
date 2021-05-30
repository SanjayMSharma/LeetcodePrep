package com.interviewPrep.leetCode.easy;

public class SellStockII {


    public int maxPRofit2(int[] prices) {
        int profit = 0;
        int buy = Integer.MAX_VALUE, sell = Integer.MIN_VALUE;

        for (int indx = 0; indx < prices.length; indx++) {
            if (prices[indx] < buy) {
                if (buy != Integer.MAX_VALUE && sell != Integer.MIN_VALUE) {
                    profit = profit + (sell - buy);
                    sell = Integer.MIN_VALUE;
                    buy = prices[indx];
                } else {
                    buy = prices[indx];
                }
            } else if (prices[indx] > sell) {
                sell = prices[indx];
            } else if (prices[indx] < sell) {
                if(buy != Integer.MAX_VALUE && sell != Integer.MIN_VALUE) {
                    profit = profit + (sell - buy);
                    sell = Integer.MIN_VALUE;
                    buy = prices[indx];
                }
            }
        }
        if(profit != 0) {
            return (sell != Integer.MIN_VALUE) ? (profit + (sell - buy)) : profit;
        }
        return profit = (buy != Integer.MAX_VALUE && sell != Integer.MIN_VALUE)? sell - buy : 0;
    }


    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE, maxPrft = Integer.MIN_VALUE;
        for (int indx = 0; indx < prices.length; indx++) {
            if (minPrice > prices[indx]) {
                minPrice = prices[indx];
            } else {
                maxPrft = (maxPrft < prices[indx] - minPrice) ? prices[indx] - minPrice : maxPrft;
            }
        }

        return (maxPrft > 0) ? maxPrft : 0;
    }

    /*public int maxProfit(int[] prices) {
        int profit = 0;
        for(int buyIndx = 0; buyIndx < prices.length -1 ; buyIndx++) {
            for (int sellIndx = buyIndx + 1; sellIndx < prices.length; sellIndx ++) {
                profit = (profit < (prices[sellIndx] - prices[buyIndx]))? prices[sellIndx] - prices[buyIndx] : profit;
            }
        }
        return profit;
    }*/

    /*public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int minIndx = 0, maxIndx = 0, minVal = Integer.MAX_VALUE, maxVal = Integer.MIN_VALUE;
        for (int indx = 0; indx < prices.length; indx++) {
            if (prices[indx] <= minVal) {
                minVal = prices[indx];
                minIndx = indx;
            } else if (prices[indx] >= maxVal) {
                maxVal = prices[indx];
                maxIndx = indx;
            }
            maxProfit = (maxProfit < (prices[maxIndx] - prices[minIndx]) && (minIndx < maxIndx))? prices[maxIndx] - prices[minIndx] : maxProfit;
        }
        return maxProfit;
    }*/

    /*public int maxProfit(int[] prices) {
       int totalProfit = 0;
       int[][] totalPriceDiff = new int[prices.length][prices.length];
       for (int indx = 0; indx < prices.length; indx++) {
           for (int inrIndx = indx+1; inrIndx < prices.length; inrIndx++) {
               totalPriceDiff[indx][inrIndx] = prices[indx] - prices[inrIndx];
           }
       }

       return totalProfit;
    }*/
}
