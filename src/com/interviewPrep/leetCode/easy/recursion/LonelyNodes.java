package com.interviewPrep.leetCode.easy.recursion;

import com.interviewPrep.models.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class LonelyNodes {

//    Recurssive approach
    List<Integer> lonelyNodes = new ArrayList<>();
    public List<Integer> getLonelyNodes(TreeNode root) {
        if (root == null) return null;
        if (root.left == null && root.right != null) {
            lonelyNodes.add(root.right.val);
            getLonelyNodes(root.right);
        } else if (root.right == null && root.left != null) {
            lonelyNodes.add(root.left.val);
            getLonelyNodes(root.left);
        } else if (root.left != null && root.right != null) {
            getLonelyNodes(root.left);
            getLonelyNodes(root.right);
        }
        return lonelyNodes;
    }
}
