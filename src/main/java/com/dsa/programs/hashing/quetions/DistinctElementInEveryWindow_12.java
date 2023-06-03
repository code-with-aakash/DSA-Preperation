package com.dsa.programs.hashing.quetions;

import java.util.HashMap;

public class DistinctElementInEveryWindow_12 {

    public static void main(String[] args) {

        int[] arr = {10, 20, 10, 10, 30, 40};

        int k = 4;
        HashMap < Integer, Integer > hmap = new HashMap <>();

        int i;
        for (i = 0; i < k; i++) {

            hmap.put(arr[i], hmap.getOrDefault(arr[i], 0) + 1);

        }

        System.out.println(hmap.size());

        for (; i < arr.length; i++) {

            // here we are decreasing the count frequency of element which is not present in the hashmap
            hmap.put(arr[i-k], hmap.getOrDefault(arr[i-k], 0) - 1);
            System.out.println("before remove"+hmap);
            // here we are removing the element whose frequency is 0
            if(hmap.get(arr[i-k])!=null && hmap.get(arr[i-k])==0){
                hmap.remove(arr[i-k]);
            }

            // if the element present in window increase frequency else add the element in hashmap
            hmap.put(arr[i], hmap.getOrDefault(arr[i], 0) + 1);


            System.out.println("after remove"+hmap);
            System.out.println(hmap.size());

        }


    }
}
