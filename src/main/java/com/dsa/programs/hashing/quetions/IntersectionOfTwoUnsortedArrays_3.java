package com.dsa.programs.hashing.quetions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class IntersectionOfTwoUnsortedArrays_3 {

    public static void main(String[] args) {


        int[] a = {1,2,2,1};
        int[] b={2,2};


        HashSet<Integer> hset = new HashSet <>();
        for (int i: b) {

            hset.add(i);
        }

        ArrayList<Integer> arr = new ArrayList<>();
        
        for (int j : a) {
            if (hset.contains(j) && !arr.contains(j)) {
                System.out.println(j);
                arr.add(j);
            }
        }

        System.out.println(arr);

        int[] ar = new int[arr.size()];
        for (int i = 0; i < arr.size(); i++) {

            ar[i]=arr.get(i);
        }

        System.out.println(Arrays.toString(ar));
    }

}
