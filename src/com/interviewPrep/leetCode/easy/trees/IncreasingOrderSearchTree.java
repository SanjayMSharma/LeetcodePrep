package com.interviewPrep.leetCode.easy.trees;

import com.interviewPrep.models.TreeNode;

import java.util.Stack;

public class IncreasingOrderSearchTree {
    public TreeNode inOrder(TreeNode root) {
        Stack<TreeNode> inOrderStack = new Stack<>();
        TreeNode newRoot = null;
        TreeNode rtnInOrdTree = null;
        TreeNode currentNode = null;
        inOrderStack.push(root);

        while (!inOrderStack.isEmpty()) {
            currentNode = inOrderStack.pop();
            if (currentNode.left != null) {
                TreeNode tempLeft = currentNode.left;
                currentNode.left = null;
                inOrderStack.push(currentNode);
                inOrderStack.push(tempLeft);
            } else if (currentNode.left == null) {
                if (newRoot != null) {
                    rtnInOrdTree.right = currentNode;
                    rtnInOrdTree = rtnInOrdTree.right;
                } else {
                    rtnInOrdTree = currentNode;
                    newRoot = rtnInOrdTree;
                }
                if (currentNode.right != null) {
                    inOrderStack.push(currentNode.right);
                }
            }
        }
        return newRoot;
    }




//        Recursive Method
/*public class IncreasingOrderSearchTree {
    TreeNode newRoot;
    Stack<TreeNode> inOrderStack = new Stack<>();
    TreeNode currentNode;

    public TreeNode inOrder(TreeNode root) {
        currentNode = root;
        inOrderService(currentNode);
        return newRoot;
    }

    public TreeNode inOrderService(TreeNode root) {
        if (root.left == null) {
            if (newRoot == null) {
                newRoot = root;
                return newRoot;
            }
            return inOrderStack.pop();
        }
        if (root.left != null) {
            inOrderStack.push(root);
            currentNode = inOrderService(root.left);
        }
        currentNode.left = null;
        currentNode.right = root;


        return currentNode;
    }*/

//    public TreeNode inOrderService(TreeNode root) {
////        Recursive Method
//        if (root == null) return null;
//
//        TreeNode leftReturn = inOrderService(root.left);
//        root.left = null;
//        if (leftReturn != null) {
//            if (newRoot == null) newRoot = leftReturn;
//            leftReturn.right = root;
//        } else {
//            if (newRoot == null) newRoot = root;
//        }
//        TreeNode rightReturn =  inOrderService(root.right);
//        root.right = rightReturn;
//
//        return (rightReturn != null) ? rightReturn : root;
//    }
}
