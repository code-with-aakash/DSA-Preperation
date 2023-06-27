package com.dsa.programs.strings;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class DuplicateCharactersInString {
    public static void main(String[] args) {

        String first = "abcbcd";
        String second = "cdefef";

        String common = commonCharacters(first, second);
        System.out.println("common characters in '" + first + "' and '" + second + "' are '" + common + "'");


    }

    public static String commonCharacters(String s1, String s2) {

        int[] a1 = new int[26];
        int[] a2 = new int[26];

        for (int i = 0 ; i < s1.length() ; i++)
            a1[s1.charAt(i) - 'a'] += 1;

        for (int i = 0 ; i < s2.length() ; i++)
            a2[s2.charAt(i) - 'a'] += 1;

        // If a common index is non-zero, it means
        // that the letter corresponding to that
        // index is common to both strings
        // brute force O(n^2)
        StringBuilder sb = new StringBuilder();
//        for (int i = 0 ; i < 26 ; i++)
//        {
//            if (a1[i] != 0 && a2[i] != 0)
//            {
//                // Find the minimum of the occurrence
//                // of the character in both strings and print
//                // the letter that many number of times
//                for (int j = 0 ; j < Math.min(a1[i], a2[i]) ; j++)
//                    sb.append((char)(i + 'a'));
//            }
//        }


        char[] c1 = s1.toCharArray();
        char[] c2 = s2.toCharArray();

        Arrays.sort(c1);
        Arrays.sort(c2);

        


        // using hashset O(n)
        HashSet<Character> hset = new HashSet<>();

        for (int i = 0; i < s1.length(); i++) {
            hset.add(s1.charAt(i));
        }


        for (int i = 0; i < s2.length(); i++) {

            if(hset.contains(s2.charAt(i))){
                sb.append(s2.charAt(i));
                hset.remove(s2.charAt(i));
            }
        }

        return sb.toString();
    }
}
