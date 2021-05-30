package com.interviewPrep.leetCode.easy.array;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class FibonacciNumber {

//    BOTTOM-UP APPROACH
    public int fib(int n) {
        Map<Integer, Integer> memo = new Hashtable<>();
        memo.put(1, 1);
        memo.put(2, 1);
        for (int counter = 3; counter <= n; counter++) {
            int fibVal = memo.get(counter - 1) + memo.get(counter - 2);
            memo.put(counter, fibVal);
        }
        return memo.get(n);
    }



//    Memoization Approach
   /* public Map<Integer, Integer> memo = new HashMap<>();
    public int fib(int n) {
        if (n <= 0) return 0;
        if (n <= 2) return 1;
        if (memo.containsKey(n)) return memo.get(n);
        int val =  fib(n - 1) + fib(n - 2);
        memo.put(n, val);
        return val;
    }*/
}
