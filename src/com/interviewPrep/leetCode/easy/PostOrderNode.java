package com.interviewPrep.leetCode.easy;

import com.interviewPrep.models.Node;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class PostOrderNode {
    public List<Integer> postOrderNode(Node root) {
        List<Integer> postOrdRes = new ArrayList<>();
        if (root == null) {
            return postOrdRes;
        }
        postOrdRes.add(root.val);



        /*List<Integer> postOrdRes = new ArrayList<>();
        Stack<Node> nodeStack = new Stack<>();
        if(root == null) {
            return postOrdRes;
        }
        nodeStack.push(root);

        while (!nodeStack.isEmpty()) {
            if (nodeStack.peek().children != null) {
                Node parent = nodeStack.peek();
                for (int childIndx = parent.children.size() - 1; childIndx > -1; childIndx--) {
                    nodeStack.push(parent.children.get(childIndx));
                }
                parent.children = null;
            } else {
                postOrdRes.add(nodeStack.pop().val);
            }
        }

        return postOrdRes;*/
        return postOrdRes;
    }
}
