package com.dsa.programs.hashing.quetions;



import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class TwoSum_5 {

    public static void main(String[] args) {

        int[] a= {3,2,8,15,-8};
        int sum =17;
        int[] arr = new int[2];
        HashMap<Integer,Integer> hmap = new HashMap<>();

        for (int i = 0; i < a.length; i++) {
            if(hmap.containsKey(sum-a[i])){
                System.out.println(a[i]);

                arr[0]=hmap.get(sum-a[i]);
                arr[1]=i;

            }else{
                hmap.put(a[i],i);
            }

        }

        System.out.println(Arrays.toString(arr));

    }
}
