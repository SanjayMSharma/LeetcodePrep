package com.interviewPrep.leetCode.easy.trees;

import com.interviewPrep.models.TreeNode;

import java.util.ArrayDeque;
import java.util.Deque;

public class SymmetricTree {
    public boolean isSymmetric(TreeNode root) {
        return root == null || isSymetricService(root.left, root.right);
    }

    public boolean isSymetricService (TreeNode node1, TreeNode node2) {
        if (node1 == null && node2 == null) return true;
        if ( node1 == null || node2 == null) return false;
        if (node1.val == node2.val) {
            return isSymetricService(node1.left, node2.right) && isSymetricService(node1.right, node2.left);
        }
        return false;
    }

}
