package com.interviewPrep.leetCode.easy.string;

public class ImplementStrStr {
    public int strStr(String haystack, String needle) {
        if (needle.length() == 0) return 0;
        if (haystack.length() == 0) return -1;
        if (needle.length() > haystack.length()) return -1;
        for (int indx = 0; indx < haystack.length(); indx++) {
            if (haystack.charAt(indx) == needle.charAt(0)) {
                if (needle.length() == 1) return indx;
                for (int needleIndx = 1; needleIndx < needle.length(); needleIndx++) {
                    if ((indx + needleIndx) < haystack.length()) {
                        if (needle.charAt(needleIndx) != haystack.charAt(indx + needleIndx)) break;
                        if (needleIndx == needle.length() - 1) return indx;
                    }
                }
            }
        }
        return -1;
    }
}
