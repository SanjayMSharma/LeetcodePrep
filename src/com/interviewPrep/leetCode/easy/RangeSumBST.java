package com.interviewPrep.leetCode.easy;

import com.interviewPrep.models.TreeNode;

public class RangeSumBST {
    public int rangeSumBST(TreeNode root, int L, int R) {
        int rtnSum = 0;
        if(root.val < L && root.right != null) {
            rtnSum = rtnSum + rangeSumBST(root.right, L, R);;
        } else if (root.val > R && root.left != null) {
            rtnSum = rtnSum + rangeSumBST(root.left, L, R);
        } else if (root.val >= L && root.val <= R) {
            rtnSum = rtnSum + root.val;
            if (root.left != null ) {
                rtnSum = rtnSum + rangeSumBST(root.left, L, R);
            }
            if (root.right != null) {
                rtnSum = rtnSum + rangeSumBST(root.right, L, R);
            }
        }
        return rtnSum;
    }

}
