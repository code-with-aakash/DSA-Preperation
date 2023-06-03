package com.dsa.programs.hashing.quetions;

import java.util.Arrays;
import java.util.HashSet;

public class LongestConsecutiveSubsequence_11 {

    public static void main(String[] args) {

        int[] arr = {2,9,4,3,10};

        Arrays.sort(arr);

        int curr=1,res=1;

        // naive solution
        for (int i = 1;  i  < arr.length; i++) {

        if(arr[i]-arr[i-1]==1) {
            curr++;
        }else {
            res = Math.max(res,curr);
            curr=1;

        }

        }
        res = Math.max(res,curr);
        System.out.println(res);

        // efficient solution
        HashSet<Integer> hset = new HashSet<>();

        for (int j : arr) {
            hset.add(j);
        }


        res=1;
        // here we are checking if hashset contains element less than x if it contains means it's not our starting element,
        // so we ignore it and look for next element and if element lower than it is not present in array that means this is our starting element,
        // so we go inside and calculate if its +1 elements are present in hashset or not if its present we increment count by 1 until
        // we find the next element of subsequence is not present in hashset and then return the maximum of res and current count

        for(Integer x :hset){
            if(!hset.contains(x-1)){
                curr=1;
                while(hset.contains(x+curr)){
                    curr++;
                }
                res=Math.max(res,curr);
            }
        }
        System.out.println(res);

    }
}
