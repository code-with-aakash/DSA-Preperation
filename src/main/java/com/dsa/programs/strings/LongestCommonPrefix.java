package com.dsa.programs.strings;

public class LongestCommonPrefix {

    public static void main(String[] args) {

        String[] strs = {"flower","flow","flight"};
        String prefix = strs[0];


        for(int index=1;index<strs.length;index++){
            while(strs[index].indexOf(prefix) != 0){
                prefix=prefix.substring(0,prefix.length()-1);
            }
        }

        System.out.println(prefix);
    }
}
