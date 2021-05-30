package com.interviewPrep.leetCode.easy.trees;

import com.interviewPrep.models.TreeNode;

public class InvertBinaryTree {
    public TreeNode invertTree(TreeNode root) {
        if(root == null) return null;
        root.left = invertTree(root.left);
        root.right = invertTree(root.right);
        TreeNode tempNode = root.left;
        root.left = root.right;
        root.right = tempNode;
        return root;
    }
}
