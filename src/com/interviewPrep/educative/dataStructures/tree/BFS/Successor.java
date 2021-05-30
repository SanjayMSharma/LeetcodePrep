package com.interviewPrep.educative.dataStructures.tree.BFS;

import com.interviewPrep.models.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class Successor {
    public int findSuccessor(TreeNode root, int key) {
        if(root == null) return 0;
        Queue<TreeNode> treeQ = new LinkedList<>();
        treeQ.add(root);

        while (!treeQ.isEmpty()) {
            int levelSize = treeQ.size();
            for (int nodeCounter = 0; nodeCounter < levelSize; nodeCounter++) {
                TreeNode currentNode = treeQ.remove();

                if (currentNode.left != null) treeQ.add(currentNode.left);
                if(currentNode.right != null) treeQ.add(currentNode.right);

                if (currentNode.val == key) return treeQ.peek().val;
            }
        }
        return 0;
    }
}
