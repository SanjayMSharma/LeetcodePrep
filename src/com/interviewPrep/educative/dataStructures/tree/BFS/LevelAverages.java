package com.interviewPrep.educative.dataStructures.tree.BFS;

import com.interviewPrep.models.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LevelAverages {
    public List<Double> levelAverage(TreeNode root) {
        if (root == null) return new ArrayList<>();
        Queue<TreeNode> treeQ = new LinkedList<>();
        treeQ.add(root);
        List<Double> rtnAvg = new ArrayList<>();

        while (!treeQ.isEmpty()) {
            int levelSize = treeQ.size();
            double levelSum = 0;

            for(int levelCounter = 0; levelCounter < levelSize; levelCounter++){
                TreeNode currentNode = treeQ.remove();
                levelSum = levelSum + currentNode.val;
                if (currentNode.left != null) treeQ.add(currentNode.left);
                if (currentNode.right != null) treeQ.add(currentNode.right);
            }
            rtnAvg.add(levelSum / levelSize);
        }
        return rtnAvg;
    }
}
