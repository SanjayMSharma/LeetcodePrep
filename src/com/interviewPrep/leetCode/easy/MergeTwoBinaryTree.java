package com.interviewPrep.leetCode.easy;

import com.interviewPrep.models.TreeNode;

public class MergeTwoBinaryTree {

//    public TreeNode mergeTrees (TreeNode root1, TreeNode root2) {
////        edge 1: null check
//    }
    /*public TreeNode mergeTrees (TreeNode tree1, TreeNode tree2) {
        if (tree1 == null && tree2 == null) {
            return null;
        } else if (tree1 == null) {
            return tree2;
        } else if (tree2 == null) {
            return tree1;
        }
        TreeNode rtnTree = new TreeNode(tree1.val + tree2.val);
        if (tree1.left != null || tree2.left != null) {
            rtnTree.left = mergeTrees((tree1.left != null) ? tree1.left : null, (tree2.left != null) ? tree2.left : null);
        }
        if ((tree1.right != null) || tree2.right != null) {
            rtnTree.right = mergeTrees((tree1.left != null) ? tree1.right : null , (tree2.right != null) ? tree2.right : null);
        }

        return rtnTree;
    }*/

}
