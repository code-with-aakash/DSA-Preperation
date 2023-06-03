package com.dsa.programs.hashing.quetions;

import java.util.HashSet;

public class UnionOfTwoArray_4 {

    public static void main(String[] args) {

        int[] a = {15,20,5,15};
        int[] b = {15,15,20,10};

        HashSet<Integer> hset = new HashSet<>();
        for (int i : a) {
            hset.add(i);
        }
        for (int i : b) {
            hset.add(i);
        }

        System.out.println(hset.size());

    }
}
