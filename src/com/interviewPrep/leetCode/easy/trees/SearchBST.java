package com.interviewPrep.leetCode.easy.trees;

import com.interviewPrep.models.TreeNode;

public class SearchBST {
    public TreeNode searchBST(TreeNode root, int val) {
        while ((root != null)) {
            if (val == root.val) {
                return root;
            } else if (val > root.val) {
                root = root.right;
            } else {
                root = root.left;
            }
        }
        return null;
    }
}
