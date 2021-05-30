package com.interviewPrep.leetCode.medium.recursion.dynamicprogramming;

import com.interviewPrep.models.TreeNode;

public class HouseRobberIII {
    public int rob(TreeNode root) {
//        Edge case
        if (root == null) return 0;
        if (root.left == null && root.right == null) return root.val;
        TreeNode rootNode = new TreeNode();
        rootNode = root;
        int rootRtn =  robHelper(rootNode);
        return Math.max(rootRtn, rootNode.val);
    }

    public  int robHelper(TreeNode root) {
//        Base Case
        if (root == null) return 0;
        if (root.right == null && root.left == null) return 0;

//        Rec logic
        int leftChildRtn = robHelper(root.left);
        int rightChildRtn = robHelper(root.right);

        int leftChildVal = (root.left != null) ? root.left.val : 0;
        int rightChildVal= (root.right != null) ? root.right.val : 0;

        root.val += leftChildRtn + rightChildRtn;

        int rtnMax = Math.max(leftChildRtn, leftChildVal) + Math.max(rightChildRtn, rightChildVal);

        return rtnMax;
    }
}
