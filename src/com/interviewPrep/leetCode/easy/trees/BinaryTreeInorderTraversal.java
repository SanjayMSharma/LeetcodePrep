package com.interviewPrep.leetCode.easy.trees;

import com.interviewPrep.models.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BinaryTreeInorderTraversal {

//    Iteratively
    public List<Integer> inorderTraversal(TreeNode root) {
        if (root == null) return new ArrayList<>();
        List<Integer> inOrderList = new ArrayList<>();
        Stack<TreeNode> treeStack = new Stack<>();
        treeStack.push(root);
        while (!treeStack.empty()) {
            TreeNode currNode = treeStack.pop();
//            Push Right First
            if (currNode.right != null ) {
                treeStack.push(currNode.right);
                currNode.right = null;
            }
//            Push Left after curr node
            if (currNode.left != null) {
                TreeNode leftChild = currNode.left;
                currNode.left = null;
                treeStack.push(currNode);
                treeStack.push(leftChild);
            } else {
                inOrderList.add(currNode.val);
            }
        }
        return inOrderList;
    }

//    Recursively
    /*public List<Integer> inorderTraversal(TreeNode root) {
        if (root == null) return new ArrayList<>();
        List<Integer> rtnList = new ArrayList<>();
        if (root.left == null && root.right == null) {
            rtnList.add(root.val);
            return rtnList;
        }

        List<Integer> leftElm = inorderTraversal(root.left);
        leftElm.add(root.val);
        List<Integer> rightElm = inorderTraversal(root.right);
        leftElm.addAll(rightElm);
        return leftElm;
    }*/
}
