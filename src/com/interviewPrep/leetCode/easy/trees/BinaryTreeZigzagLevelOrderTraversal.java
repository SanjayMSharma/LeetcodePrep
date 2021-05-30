package com.interviewPrep.leetCode.easy.trees;

import com.interviewPrep.models.TreeNode;

import java.util.*;

public class BinaryTreeZigzagLevelOrderTraversal {

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        Queue<TreeNode> levelOrderQueue = new LinkedList<>();
        levelOrderQueue.add(root);
        int size = levelOrderQueue.size();

        List<Integer> levelList = new ArrayList<>();
        List<List<Integer>> mainList = new ArrayList<>();
        boolean evenLevel = false;
        while (!levelOrderQueue.isEmpty()) {

            if(size == 0) {
                if(evenLevel) Collections.reverse(levelList);
                mainList.add(levelList);
                size = levelOrderQueue.size();
                levelList = new ArrayList<>();
                evenLevel = !evenLevel;
            }
            TreeNode currNode = levelOrderQueue.remove();
            levelList.add(currNode.val);
            size--;

            if(currNode.left != null) levelOrderQueue.add(currNode.left);
            if(currNode.right != null) levelOrderQueue.add(currNode.right);
        }
        mainList.add(levelList);
        return mainList;
    }
}
