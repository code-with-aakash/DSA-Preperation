package com.dsa.programs.hashing.Leetcode;

import java.util.HashMap;
import java.util.HashSet;

public class ValidAnargram {

    public static void main(String[] args) {


        String s1 ="dcat";
        String s2= "etac";
        System.out.println(s1.length());
        HashMap <Character,Integer> hmap = new HashMap <>();


        for (int i = 0; i < s1.length(); i++) {
            hmap.put(s1.charAt(i),hmap.getOrDefault(s1.charAt(i),0)+1);

        }

        for (int i = 0; i < s2.length(); i++) {

            if(hmap.containsKey(s2.charAt(i))){
                hmap.put(s2.charAt(i),hmap.get(s2.charAt(i))-1);
            }

            System.out.println(hmap);
            if(hmap.get(s2.charAt(i))!=null && hmap.get(s2.charAt(i))==0){

                hmap.remove(s2.charAt(i));
            }
        }

        System.out.println(hmap.isEmpty());

        // efficient solution
        int[] freq = new int[26];
        for (int i = 0; i < s1.length(); i++) {
            System.out.println(s1.charAt(i) - 'a');

            freq[s1.charAt(i) - 'a']++;
            freq[s2.charAt(i) - 'a']--;
        }

        for (int i = 0; i < freq.length; i++) {
            if (freq[i] != 0) {
                System.out.println("false");
                break;
            }
        }
        System.out.println("true");
    }
}
