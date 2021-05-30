package com.interviewPrep.leetCode.easy.trees;

import com.interviewPrep.models.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class DiameterBinaryTree {

    int maxDiameter = 0;
    public int diameterOfBinaryTree(TreeNode root) {
//        Edge Case
        if (root == null) return 0;
        if (root.left == null && root.right == null) return 0;
        diameterhelper(root);
        return maxDiameter;
    }
    public int diameterhelper(TreeNode root) {
//      Base Case
        if (root == null) return 0;

        int leftMaxSteps = diameterhelper(root.left);
        int rightMaxSteps = diameterhelper(root.right);
        maxDiameter =  Math.max(leftMaxSteps + rightMaxSteps, maxDiameter);
        return Math.max(leftMaxSteps, rightMaxSteps) + 1;
    }



//    Recurssion Attempt 1
/*    int diameter = 0;
    public int diameterBinaryTree(TreeNode tree) {
        int finalVal = calculateDiameter(tree);
        return diameter;
    }
    public int calculateDiameter(TreeNode tree) {
        if(tree == null) return 0;

        int maxDepth = 0, leftValue = 0, rightValue = 0;
        if (tree.left != null) leftValue = calculateDiameter(tree.left);
        if (tree.right != null) rightValue = calculateDiameter(tree.right);
        maxDepth = (leftValue > rightValue) ? leftValue : rightValue;

        diameter = Math.max(diameter, (leftValue + rightValue));
        return maxDepth + 1;
    }*/
}
