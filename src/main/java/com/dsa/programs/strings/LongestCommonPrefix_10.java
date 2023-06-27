package com.dsa.programs.strings;

public class LongestCommonPrefix_10 {

    public static void main(String[] args) {

        String[] strs = {"flower","flow","flight"};
        String prefix = strs[0];
        // here we are checking if the first string is the prefix itself .
        // and slowly we reduce the size of 1 st prefix from the last character
        // the loop breaks if we find the prefix

        for(int index=1;index<strs.length;index++){

            while(strs[index].indexOf(prefix) != 0){
                prefix=prefix.substring(0,prefix.length()-1);
            }
        }

        System.out.println(prefix);
    }
}
