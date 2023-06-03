package com.dsa.programs.hashing.quetions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class MoreThanNbyKoccurence_13 {

    public static void main(String[] args) {

        int[] arr ={30,10,20,20,10,20,30,30};
        int k = 4, freq=arr.length/k;

        HashMap<Integer,Integer> hmap = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {

            hmap.put(arr[i],hmap.getOrDefault(arr[i],0)+1);
        }
        System.out.println(hmap);

        List<Integer> ls = new ArrayList <>();
        hmap.forEach((key, value) -> {
            if(value>freq){
                System.out.println(key);
                ls.add(key);
            }
        });

        int[] num = new int[ls.size()];
        for (int i = 0; i < ls.size(); i++) {

            num[i]=ls.get(i);

        }

        System.out.println(Arrays.toString(num));
    }


}
