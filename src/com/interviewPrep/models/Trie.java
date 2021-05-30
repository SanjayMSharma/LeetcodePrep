package com.interviewPrep.models;

import com.sun.tools.classfile.ConstantPool;

import java.util.*;

public class Trie {
    public boolean isWord;
    public Trie[] charNode;

    public Trie() {
        charNode = new Trie[26];
    }
}
