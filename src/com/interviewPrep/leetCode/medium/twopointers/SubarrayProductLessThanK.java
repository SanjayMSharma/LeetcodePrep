package com.interviewPrep.leetCode.medium.twopointers;

public class SubarrayProductLessThanK {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
// SLIDING WINDOW - MY WAY FO CODING - DOESN"T WORK FOR EXTREME LARGE ARRAY
// int count = 0;
// int startPointer = 0;
// int endPointer = 0;
//
// while (endPointer < nums.length) {
// int product = 1;
// int current = startPointer;
//
// while (current <= endPointer) {
// product = product * nums[current];
// current++;
// }
//
// if (product < k) {
// count = count + (endPointer - startPointer + 1);
// endPointer++;
// } else {
// if (endPointer == startPointer) {
// startPointer++;
// endPointer++;
// } else
// startPointer++;
// }
// }
// return count;
// }

// FANCY WAY OF CODING _ WORKS FOR EXTREME LARGE FILES
// if (k <= 1)
// return 0;
// int prod = 1, ans = 0, left = 0;
// for (int right = 0; right < nums.length; right++) {
// prod *= nums[right];
// while (prod >= k)
// prod /= nums[left++];
// ans += right - left + 1;
// }
// return ans;
// }

// MY TAKE ON FANCY VERSION
        if (k <= 1)
            return 0;
        int startPointer = 0;
        int count = 0;
        int product = 1;
        for (int endPointer = 0; endPointer < nums.length; endPointer++) {
            product = product * nums[endPointer];
            while (product >= k) {
                product = product / nums[startPointer];
                startPointer++;
            }
            count = count + (endPointer - startPointer + 1);
        }
        return count;
    }
}