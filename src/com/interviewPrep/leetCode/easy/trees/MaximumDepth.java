package com.interviewPrep.leetCode.easy.trees;

import com.interviewPrep.models.TreeNode;

import java.util.Stack;

public class MaximumDepth {
    public int maxDepth(TreeNode root) {
        if(root == null) return 0;
        int leftCounter = 0, rightCounter = 0;
        if (root.left != null) leftCounter = maxDepth(root.left);
        if (root.right != null) rightCounter = maxDepth(root.right);
        return (leftCounter > rightCounter) ? leftCounter + 1: rightCounter + 1;
    }

    public int maxDepthIteratively(TreeNode root) {
        if (root == null) return 0;
        Stack<TreeNode> nodeStack = new Stack<TreeNode>();
        Stack<Integer> levelStack = new Stack<>();
        nodeStack.push(root);
        levelStack.push(1);
        int maxDepth = 0;
        while (!nodeStack.isEmpty()) {
            TreeNode currentNode = nodeStack.pop();
            int currentLevel = levelStack.pop();
            maxDepth = Math.max(maxDepth, currentLevel);
            if (currentNode.left != null) {
                nodeStack.push(currentNode.left);
                levelStack.push(currentLevel + 1);
            }
            if (currentNode.right != null) {
                nodeStack.push(currentNode.right);
                levelStack.push(currentLevel + 1);
            }
        }
        return maxDepth;
    }
}
