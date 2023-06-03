package com.dsa.programs.hashing.Leetcode;

import java.util.*;

public class NonRepeatingcharacter {

    public static void main(String[] args) {

        String s ="loveleetcode";
        Map <Character,Integer> hset=new LinkedHashMap <>();
        for (int i = 0; i < s.length(); i++) {

            hset.put(s.charAt(i),hset.getOrDefault(s.charAt(i),0)+1);

        }

        System.out.println(hset);
        // search in for loop now foor index with key from map whose value is 1

        // efficient solution
        int ans = Integer.MAX_VALUE;
        // Iterate from a to z which is 26 which makes it constant
        for(char c='a'; c<='z';c++){
            // indexOf will return first index of alphabet and lastIndexOf will return last index
            // if both are equal then it has occured only once.
            // through this we will get all index's which are occured once
            // but our answer is lowest index
            int index = s.indexOf(c);
            if(index!=-1&&index==s.lastIndexOf(c)){
                ans = Math.min(ans,index);
            }
        }

        // If ans remain's Integer.MAX_VALUE then their is no unique character
        System.out.println(ans);


    }
}
