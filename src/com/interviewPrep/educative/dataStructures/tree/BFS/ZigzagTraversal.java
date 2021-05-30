package com.interviewPrep.educative.dataStructures.tree.BFS;

import com.interviewPrep.models.TreeNode;

import java.util.*;

public class ZigzagTraversal {
    public List<List<Integer>> zigzagTraverse(TreeNode root) {
        if (root == null) return new ArrayList<>();
        Queue<TreeNode> treeQ = new LinkedList<>();
        treeQ.add(root);

        List<Integer> levelVals ;
        List<List<Integer>> rtnList = new ArrayList<>();
        boolean isEvenLevel = false;

        while (!treeQ.isEmpty()) {
            int levelSize = treeQ.size();
            levelVals = new ArrayList<>();
            for (int levelElmsCounter = 0; levelElmsCounter < levelSize; levelElmsCounter++){
                TreeNode currentNode = treeQ.remove();
                levelVals.add(currentNode.val);
                if (currentNode.left != null) treeQ.add(currentNode.left);
                if (currentNode.right != null) treeQ.add(currentNode.right);
            }
            if(isEvenLevel){
                Collections.reverse(levelVals);
                rtnList.add(levelVals);
                isEvenLevel = !isEvenLevel;
            } else {
                rtnList.add(levelVals);
                isEvenLevel = !isEvenLevel;
            }
        }
        return  rtnList;
    }
}
