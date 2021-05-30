package com.interviewPrep.leetCode.easy.array;

import java.util.ArrayList;
import java.util.List;

public class GreatestNumberCandies {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int highestCandyCount = Integer.MIN_VALUE;
        List<Boolean> maxCandiesResult = new ArrayList<>();
        for (int indx = 0; indx < candies.length; indx++)
            highestCandyCount = Math.max(candies[indx], highestCandyCount);

        for (int indx = 0; indx < candies.length; indx++)
            maxCandiesResult.add ( indx, ((candies[indx] + extraCandies) >= highestCandyCount) ? true : false);

        return maxCandiesResult;
    }
}
