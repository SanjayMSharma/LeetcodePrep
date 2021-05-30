package com.interviewPrep.leetCode.easy.trees;

import com.interviewPrep.models.Node;

public class NAry_Tree_MaximumDepth {
    public int maxDepth(Node root) {
        int maxDepti = 0;
        if (root == null) return 0;
        for (Node node : root.children) {
            int childDepth = maxDepth(node);
            maxDepti = Math.max(childDepth, maxDepti);
        }
        return maxDepti + 1;
    }
}
