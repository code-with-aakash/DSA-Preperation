package com.dsa.programs.hashing.quetions;

import java.util.HashMap;

public class SubArraysWithGivenSum_14 {

    public static void main(String[] args) {

        int[] arr = {1,2,3};
        int sum =3;

        HashMap <Integer,Integer> hmap = new HashMap<>();

        int pre_sum=0;
        int count=0;
        hmap.put(0,1);
        for (int j : arr) {

            pre_sum += j;

            count += hmap.getOrDefault(pre_sum - sum, 0);

            hmap.put(pre_sum, hmap.getOrDefault(pre_sum, 0) + 1);

        }
    }
}
