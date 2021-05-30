package com.interviewPrep.leetCode.medium.recursion.dynamicprogramming;

import com.interviewPrep.models.TreeNode;

public class BTByPreorderInorder {
    int[] preArr;
    int[] inArr;
    int preIndx;
    public TreeNode buildTree(int[] preorder, int[] inorder) {
//        Edge case
        if (preorder.length < 1) return new TreeNode();
        if (preorder.length == 1) return new TreeNode(preorder[0]);

        preArr = preorder;
        inArr = inorder;
        preIndx = 0;
        return cunstructTree(0, preorder.length - 1);
    }
    public TreeNode cunstructTree(int start, int end) {
        if (start > end) return null;
        int elmIndx = -1;
        for (int indx = start; indx <= end; indx++) {
            if (inArr[indx] == preArr[preIndx]) elmIndx = indx;
        }
        if (elmIndx < 0) return null;
        TreeNode currElm = new TreeNode(inArr[elmIndx]);
        preIndx++;
        TreeNode leftChild = cunstructTree(start, elmIndx - 1);
        if (leftChild != null)
            currElm.left = leftChild;

        TreeNode rightChild = cunstructTree(elmIndx + 1, end);
        if (rightChild != null)
            currElm.right = rightChild;

        return currElm;
    }
}
