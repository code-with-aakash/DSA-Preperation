package com.dsa.programs.strings;

import java.util.Arrays;

public class DistinctCharacterSubstring {

    public static void main(String[] args) {

    String s = "abacde";
     int n = s.length();
     int res =0;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                if(arrDistiinct(s,i,j)){
                    res = Math.max(res,j-i+1);

                }
            }
        }

        System.out.println(res);

        // efficient solution
        int[] lastIndex = new int[26];
        Arrays.fill(lastIndex,-1);
        int i=0;
        res=0;
        for (int j = 0; j < n; j++) {

            // Find the last index of str[j]
            // Update i (starting index of current window)
            // as maximum of current value of i and last
            // index plus 1
            i = Math.max(i, lastIndex[s.charAt(j)-'a'] + 1);

            // Update result if we get a larger window
            res = Math.max(res, j - i + 1);

            // Update last index of j.
            lastIndex[s.charAt(j)-'a'] = j;
        }

        System.out.println(res);

    }

    private static boolean arrDistiinct(String s, int i, int j) {

        boolean[] visited = new boolean[256];
        for (int k = i; k <= j; k++) {
            if(visited[s.charAt(k)]){
                return false;
            }
            visited[s.charAt(k)]=true;
        }

        return true;
    }


}
