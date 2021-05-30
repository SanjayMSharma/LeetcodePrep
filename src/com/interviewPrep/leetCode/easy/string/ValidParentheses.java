package com.interviewPrep.leetCode.easy.string;

import java.util.Stack;

public class ValidParentheses {
    public boolean isValid(String s) {
        if (s.length() == 0) return true;
        if (s.length() % 2 == 1) return false;
        Stack<Character> stack = new Stack<>();
        for (int indx = 0; indx < s.length(); indx++) {
            if (stack.empty())
                stack.push(s.charAt(indx));
            else {
                if (s.charAt(indx) == '(' || s.charAt(indx) == '{' || s.charAt(indx) == '[') {
                    stack.push(s.charAt(indx));
                } else {
                    if (stack.empty()) return false;
                    if (s.charAt(indx) == ')') {
                        if (stack.peek() != '(') return false;
                        stack.pop();
                    }
                    if (s.charAt(indx) == '}') {
                        if (stack.peek() != '{') return false;
                        stack.pop();
                    }
                    if (s.charAt(indx) == ']') {
                        if (stack.peek() != '[') return false;
                        stack.pop();
                    }
                }
            }
        }
        return (stack.empty()) ? true : false;
    }
}
