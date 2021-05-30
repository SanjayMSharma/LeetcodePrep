package com.interviewPrep.leetCode.medium;

public class ContainerWithMostWater {
    public int findArea(int[] height){
        int returnResult = 0;
        for (int firstLine = 0; firstLine < height.length - 1; firstLine++ ){
            for (int secondLine = firstLine + 1; secondLine < height.length; secondLine++ ){
                int area = (secondLine - firstLine) * ((height[firstLine] < height[secondLine])? height[firstLine] : height[secondLine]);
                returnResult = (area > returnResult) ? area : returnResult;
            }
        }
        return returnResult;
    }
}
