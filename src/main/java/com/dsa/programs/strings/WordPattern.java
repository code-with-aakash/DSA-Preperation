package com.dsa.programs.strings;

import java.util.HashMap;

public class WordPattern {

    public static void main(String[] args) {

        String pattern = "aba", s = "cat cat cat dog";
        System.out.println("pattern lenth"+pattern.length());
        HashMap<Character,Integer> hmap = new HashMap <>();

        for (int i = 0; i < pattern.length(); i++) {

            hmap.put(pattern.charAt(i),hmap.getOrDefault(pattern.charAt(i),0)+1);
        }
        HashMap<String,Integer> hmap2 = new HashMap <>();

        String[] str = s.split(" ");
        System.out.println("str is "+str.length);
        for (int i = 0; i <str.length; i++) {

            hmap2.put(str[i],hmap2.getOrDefault(str[i],0)+1);
        }

        System.out.println(hmap.size()+" "+hmap2.size());


    }
}
