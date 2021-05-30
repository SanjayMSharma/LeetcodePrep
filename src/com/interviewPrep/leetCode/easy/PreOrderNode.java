package com.interviewPrep.leetCode.easy;

import com.interviewPrep.models.Node;

import java.util.ArrayList;
import java.util.List;

public class PreOrderNode {
    public List<Integer> preorder(Node root) {
        List<Integer> rtnList = new ArrayList<>(1);
        List<Node> storeList = new ArrayList<>();
        if(root == null) {
            return rtnList;
        } else {
            storeList.add(root);
        }
        int storIndx = 0;
        while (storIndx > -1) {
            rtnList.add(storeList.get(storIndx).val);
            if (storeList.get(storIndx).children != null) {
                Node parent = storeList.get(storIndx);
                for (int childIndx = parent.children.size() - 1; childIndx > -1; childIndx--) {
                    storeList.add(storIndx++, parent.children.get(childIndx));
                }
            }
            storIndx--;
        }

        return rtnList;
    }
}
