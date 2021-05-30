package com.interviewPrep.interview;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class interview3 {


    public static List<Integer> sort(List<Integer> nums) {
//        9, 8, 1, 6, 5
        return nums.stream().sorted().collect(Collectors.toList());
//        Runnable runnable = () -> {
//            System.out.println("");
//        }
    }



    public static void main(String args[]) {
        System.out.println(sort(Arrays.asList(9, 8, 1, 6, 5)));
    }
}
