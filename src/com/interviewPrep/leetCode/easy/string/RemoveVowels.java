package com.interviewPrep.leetCode.easy.string;

import java.util.HashSet;
import java.util.Set;

public class RemoveVowels {

    public String removeVowels(String s) {

    }
//    Second Try
/*    public String removeVowel(String S) {
        Set<Character> vowels = new HashSet<>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');
        char[] chrStr = S.toCharArray();
        StringBuilder sb = new StringBuilder();
        for(char chr : chrStr) {
            if (!vowels.contains(chr)) sb.append(chr);
        }
        return sb.toString();
    }*/

//    First Try
    /*public String removeVowel(String S) {
        char[] chrStr = S.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (char c : chrStr) {
            if (c != 'a' && c != 'e' && c != 'i' && c != 'o' && c != 'u' )
                sb.append(c);
        }
        return sb.toString();
    }*/
}
