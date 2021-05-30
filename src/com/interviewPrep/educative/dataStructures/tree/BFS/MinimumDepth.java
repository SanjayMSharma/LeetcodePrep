package com.interviewPrep.educative.dataStructures.tree.BFS;

import com.interviewPrep.models.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class MinimumDepth {
    public int findDepth (TreeNode root ) {
        if (root == null) return 0;

        Queue<TreeNode> treeQ = new LinkedList<>();
        treeQ.add(root);

        int level = 0;

        while (!treeQ.isEmpty()) {
            level++;

            int levelSize = treeQ.size();
            for (int nodeCounter = 0; nodeCounter < levelSize; nodeCounter++) {
                TreeNode currentNode = treeQ.remove();

                if (currentNode.left == null && currentNode.right == null) return level;

                if (currentNode.left != null) treeQ.add(currentNode.left);
                if (currentNode.right != null) treeQ.add(currentNode.right);
            }
        }
        return 0;
    }
}
