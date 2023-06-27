package com.dsa.programs.array;

import java.util.HashMap;

public class ContainsDuplicates {
    public static void main(String[] args) {

        int[] nums = new int[]{1, 2, 3, 1};
        int count=0;
        boolean isrepeat =false;
        HashMap<Integer,Integer> hs = new HashMap < Integer, Integer >();
        for(int i=0;i<=nums.length-1;i++){

            if(hs.containsKey(nums[i])){

                isrepeat=true;
            }
            hs.put(nums[i],1);

        }

        System.out.println("is repeat +-->"+isrepeat);

    }
}
