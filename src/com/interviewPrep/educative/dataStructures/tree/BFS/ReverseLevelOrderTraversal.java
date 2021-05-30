package com.interviewPrep.educative.dataStructures.tree.BFS;

import com.interviewPrep.models.TreeNode;

import java.util.*;

public class ReverseLevelOrderTraversal {
    public List<List<Integer>> reverseTraverse(TreeNode root) {
        if (root == null) return new ArrayList<>();
        Queue<TreeNode> treeQ = new LinkedList<>();
        treeQ.add(root);

        List<Integer> levelNodesList;
        List<List<Integer>> rtnList = new ArrayList<>();
        Stack<List<Integer>> levelValStack = new Stack<>();

        while (!treeQ.isEmpty()) {
            levelNodesList = new ArrayList<>();
            int levelSize = treeQ.size();
            for (int childCounter = 0; childCounter < levelSize; childCounter++) {
                TreeNode currentNode = treeQ.remove();
                levelNodesList.add(currentNode.val);
                if (currentNode.left != null) treeQ.add(currentNode.left);
                if (currentNode.right != null) treeQ.add(currentNode.right);
            }
            levelValStack.push(levelNodesList);
        }
        while (!levelValStack.isEmpty()){
            rtnList.add(levelValStack.pop());
        }
        return rtnList;
    }
}
