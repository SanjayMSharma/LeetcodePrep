package com.interviewPrep.leetCode.easy.trees;

import com.interviewPrep.models.TreeNode;

public class MergeTrees {

    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        if(t1 == null) return t2;
        if(t2 == null) return t1;

        t1.left = mergeTrees(t1.left, t2.left);
        t2.right = mergeTrees(t1.right, t2.right);

        t1.val += t2.val;
        return t1;
    }



    /*public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        if(t1 == null) return t2;
        if(t2 == null) return t1;

        TreeNode root = new TreeNode(t1.val + t2.val );
        root.left = mergeTrees(t1.left, t2.left);
        root.right = mergeTrees(t1.right, t2.right);
        return root;
    }*/
}
