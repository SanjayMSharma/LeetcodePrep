package com.interviewPrep.educative.dataStructures.tree.BFS;

import com.interviewPrep.models.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeLevelOrderTraversal {
    public List<List<Integer>> traverse(TreeNode root) {
        if (root == null) return new ArrayList<>();
        Queue<TreeNode> treeQ = new LinkedList<>();
        treeQ.add(root);

        int qSize = treeQ.size();
        List<Integer> levelArr = new ArrayList<>();
        List<List<Integer>> rtnArr = new ArrayList<>();


        while (!treeQ.isEmpty()) {

            if (qSize == 0) {
                qSize = treeQ.size();
                rtnArr.add(levelArr);
                levelArr = new ArrayList<>();
            }


            TreeNode currentNode = treeQ.remove();


            if (qSize != 0) {
                levelArr.add(currentNode.val);
                qSize--;
            }


            if (currentNode.right != null) treeQ.add(currentNode.right);
            if (currentNode.left != null) treeQ.add(currentNode.left);

        }
        rtnArr.add(levelArr);
        return  rtnArr;
    }
}
