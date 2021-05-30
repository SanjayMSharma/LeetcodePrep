package com.interviewPrep.educative.dataStructures.tree.BFS;

import com.interviewPrep.models.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class RightView {
    public List<Integer> traverse(TreeNode root) {
        if(root == null) return new ArrayList<>();

        Queue<TreeNode> treeQ = new LinkedList<>();
        treeQ.add(root);

        List<Integer> rtnRightView = new ArrayList<>();

        while (!treeQ.isEmpty()) {
            int levelSize = treeQ.size();
            for (int nodeCounter = 0; nodeCounter < levelSize; nodeCounter++) {

                TreeNode currentNode = treeQ.remove();

                if (nodeCounter == levelSize - 1) rtnRightView.add(currentNode.val);

                if (currentNode.left != null) treeQ.add(currentNode.left);
                if (currentNode.right != null) treeQ.add(currentNode.right);
            }
        }
        return rtnRightView;
    }
}
