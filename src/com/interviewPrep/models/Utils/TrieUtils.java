package com.interviewPrep.models.Utils;

import com.interviewPrep.models.Trie;

import java.util.HashMap;

public class TrieUtils extends Trie {

    Trie root = new Trie();

    public void insert(String word) {
        Trie rootNode = root;
        char[] charArry = word.toCharArray();
        for (int indx = 0; indx < charArry.length; indx++) {
            if(root.charNode[charArry[indx] - (int)'a'] == null) {
                root.charNode[charArry[indx] - (int)'a'] = new Trie();
            }
            root = root.charNode[charArry[indx] - 'a'];
            if(indx == charArry.length - 1) {
                root.isWord = true;
            }
        }
        root = rootNode;
    }

    public boolean search(String word) {
        Trie rootNode = root;
        char[] charArry = word.toCharArray();
        for (int indx = 0 ; indx < charArry.length; indx++) {
            if (root.charNode[charArry[indx] - (int)'a'] != null ) {
                root = root.charNode[charArry[indx] - (int)'a'];
            } else {
                root  = rootNode;
                return false;
            }
            if (indx == charArry.length - 1) {
                if(root.isWord) {
                    root = rootNode;
                    return true;
                } else {
                    root = rootNode;
                    return false;
                }
            }
        }
        root  = rootNode;
        return false;
    }

    public boolean startsWith(String prefix) {
        Trie rootNode = root;
        char[] charStr = prefix.toCharArray();
        for (int indx = 0; indx < charStr.length; indx++) {
            if (root.charNode[charStr[indx] - (int)'a'] != null) {
                root = root.charNode[charStr[indx] - (int)'a'];
            } else {
                root  = rootNode;
                return false;
            }
        }
        root  = rootNode;
        return true;
    }





    /*

    class Trie {

  class TriNode {
    TriNode[] children;
    boolean isEnd;

    public TriNode() {
      children = new TriNode[26];
      isEnd = false;
    }
  }

  TriNode root = new TriNode();

  void insert(String s) {
    TriNode p = root;
    for(char c : s.toCharArray()) {
      int idx = c - 'a';
      if(p.children[idx] == null) {
        p.children[idx] = new TriNode();
      }
      p = p.children[idx];
    }
    p.isEnd = true;
  }
  boolean search(String s) {
    TriNode p = find(s);
    return p != null && p.isEnd;
  }
  boolean startsWith(String s) {
    TriNode p = find(s);
    return p != null;
  }
  TriNode find(String s) {
    TriNode p = root;
    for(char c : s.toCharArray()) {
      int idx = c - 'a';
      if(p.children[idx] == null) {
        return null;
      }
      p = p.children[idx];
    }
    return p;
  }

}

     */



/*

class Trie {

    /** Initialize your data structure here. */
/*TrieNode root;

    public Trie() {
        root = new TrieNode();
    }*/

    /** Inserts a word into the trie. */
    /*
    public void insert(String word) {
        TrieNode rootNode = root;
        char[] charArry = word.toCharArray();
        for (int indx = 0; indx < charArry.length; indx++) {
            root.charNode[charArry[indx] - (int)'a'] = new TrieNode();
            root = root.charNode[charArry[indx] - 'a'];
            if(indx == charArry.length - 1) {
                root.isWord = true;
            }
        }
        root = rootNode;
    }
*/
    /** Returns if the word is in the trie. */
    /*
    public boolean search(String word) {
        TrieNode rootNode = root;
        char[] charArry = word.toCharArray();
        for (int indx = 0 ; indx < charArry.length; indx++) {
            if (root.charNode[charArry[indx] - (int)'a'] != null ) {
                root = root.charNode[charArry[indx] - (int)'a'];
            } else {
                root  = rootNode;
                return false;
            }
            if (indx == charArry.length - 1) {
                if(root.isWord) {
                    root = rootNode;
                    return true;
                } else {
                    root = rootNode;
                    return false;
                }
            }
        }
        root  = rootNode;
        return false;
    }
*/
    /** Returns if there is any word in the trie that starts with the given prefix. */
    /*
    public boolean startsWith(String prefix) {
        TrieNode rootNode = root;
        char[] charStr = prefix.toCharArray();
        for (int indx = 0; indx < charStr.length; indx++) {
            if (root.charNode[charStr[indx] - (int)'a'] != null) {
                root = root.charNode[charStr[indx] - (int)'a'];
            } else {
                root  = rootNode;
                return false;
            }
        }
        root  = rootNode;
        return true;
    }
}

class TrieNode {
    public boolean isWord = false;
    public TrieNode[] charNode;

    public TrieNode() {
        charNode = new TrieNode[26];
    }
}*/

/*
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */

}
