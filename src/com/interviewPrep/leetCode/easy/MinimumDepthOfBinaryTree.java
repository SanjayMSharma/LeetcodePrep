package com.interviewPrep.leetCode.easy;

import com.interviewPrep.models.TreeNode;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class MinimumDepthOfBinaryTree {


//========================================================================================================
//    BFS (Practice 2)
    public int maxDepth(TreeNode root) {
//        Queue<TreeNode> treeQ = new
        return 0;
    }
//    DFS (Practice 2)
/*    public int maxDepth(TreeNode root) {
//        Edge Base condition
        if (root == null) return 0;
        if (root.left == null && root.right == null) return 1;
//        rec call
        int leftRtn = 0, rightRtn = 0;
        if (root.left != null) leftRtn =  maxDepth(root.left);
        if (root.right != null) rightRtn = maxDepth(root.right);
        return 1 + Math.max(rightRtn , leftRtn);
    }*/


//========================================================================================================
//   Solved using Breadth first search (Practice 1)
    /*public int minDepth(TreeNode root) {
        Queue<TreeNode> nodeQueue = new LinkedList<>();
        int lastNodeDepth = 0;
        if (root == null) {
            return 0;
        }
        nodeQueue.add(root);
        while (!nodeQueue.isEmpty()) {
            lastNodeDepth++;
            int size = nodeQueue.size();
            while (size>= 0) {
                TreeNode currNode = nodeQueue.poll();
                if(currNode.left == null && currNode.right == null) {
                    return lastNodeDepth;
                }
                if (currNode.left != null) {
                    nodeQueue.add(currNode.left);
                }
                if(currNode.right != null) {
                    nodeQueue.add(currNode.right);
                }
                size--;
            }


        }
        return 0;
    }*/




//    Solved using Depth First search
/*    public int minDepth(TreeNode root) {
        if ( root == null ) {
            return 0;
        }
        int depthCount = 1;
        int leftCount = 0, rightCount = 0;
        if (root.left != null) {
            leftCount = minDepth(root.left);
        }
        if (root.right != null) {
            rightCount = minDepth(root.right);
        }
        if(leftCount == 0 || rightCount == 0) {
            depthCount = depthCount + ((leftCount == 0) ? rightCount : leftCount) ;
        } else {
            depthCount = depthCount + ((leftCount < rightCount) ? leftCount : rightCount);
        }
        return depthCount;
    }*/
}
