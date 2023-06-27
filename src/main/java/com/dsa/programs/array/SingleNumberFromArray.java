package com.dsa.programs.array;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

public class SingleNumberFromArray {

    public static void main(String[] args) {

        int[] nums = {4,1,2,1,2};
        HashMap <Integer,Integer> hmap = new HashMap<Integer,Integer>();

        for(int i =0;i<nums.length;i++){

            int count =0;
            if(hmap!=null && !hmap.isEmpty() && hmap.get(i)==nums[i]){
                count=hmap.get(nums[i]);
            }

            hmap.put(nums[i],count++);

        }


        for (Map.Entry<Integer, Integer> entry : hmap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

    }
}
