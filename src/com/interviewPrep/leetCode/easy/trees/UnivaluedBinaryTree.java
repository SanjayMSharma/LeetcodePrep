package com.interviewPrep.leetCode.easy.trees;

import com.interviewPrep.models.TreeNode;

public class UnivaluedBinaryTree {
    public boolean isUnivalTree(TreeNode root) {
        if (root == null || (root.right == null && root.left == null)) return true;
        boolean leftReturn = true, rightResult = true;
        if (root.left != null) {
            if ((root.left.val == root.val)) {
                leftReturn = isUnivalTree(root.left);
            } else {
                leftReturn = false;
            }
        }
        if (root.right != null) {
            if ((root.right.val == root.val)) {
                rightResult = isUnivalTree(root.right);
            } else {
                rightResult = false;
            }
        }
        if (leftReturn && rightResult) return true;
        return false;
    }
}
