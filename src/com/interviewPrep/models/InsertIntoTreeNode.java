package com.interviewPrep.models;

public class InsertIntoTreeNode {
    public TreeNode insertAllTree(int[] allElements) {
        TreeNode rtnTree = new TreeNode(allElements[0]);
        for (int indx = 1; indx < allElements.length; indx++) {
            rtnTree = insertElm(rtnTree, allElements[indx]);
        }
        return rtnTree;
    }
    public TreeNode insertElm (TreeNode tree ,int elm) {
        if(tree.val >= elm) {
            if(tree.left == null) {
                tree.left = new TreeNode(elm);
            } else {
                insertElm(tree.left, elm);
            }
        } else if (tree.val < elm) {
            if (tree.right == null) {
                tree.right = new TreeNode(elm);
            } else {
                insertElm(tree.right, elm);
            }
        }
        return tree;
    }

    public void printTree ( TreeNode root) {
        if(root == null) {
            System.out.print("Root is null");
        }
        System.out.print(root.val);
        if ((root.left != null)){
            printTree(root.left);
        }
        if (root.right != null) {
            printTree(root.right);
        }
    }
}
