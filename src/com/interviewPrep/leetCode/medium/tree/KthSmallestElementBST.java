package com.interviewPrep.leetCode.medium.tree;


import com.interviewPrep.models.TreeNode;

public class KthSmallestElementBST {
    int positionCount = 0;
    int kth;
    int rtnElm = 0;



    public int kthSmallest(TreeNode root, int k) {
        if (root == null) return 0;
        kth = k;
        isKthPosition(root);
        return rtnElm;
    }



    public boolean isKthPosition(TreeNode root) {
//        Base
        if (root == null) return false;
//        Base
//        if (root.left == null && root.right == null) {
//            if (positionCount == kth) {
//                rtnElm = root.val;
//                return true;
//            }
//            return false;
//        }



//        Logic
         if (isKthPosition(root.left)) return true;


        if(++positionCount == kth) {
            rtnElm = root.val;
            return true;
        }

         if (isKthPosition(root.right)) return true;

        return false;
    }
}
