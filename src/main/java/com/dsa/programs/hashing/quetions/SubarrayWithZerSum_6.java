package com.dsa.programs.hashing.quetions;

import java.util.HashSet;

public class SubarrayWithZerSum_6 {

    public static void main(String[] args) {

    int[] arr ={-3,4,-3,-1,1};

        HashSet<Integer> hset = new HashSet<>();
        int pre_sum=0;
        for (int i = 0; i < arr.length; i++) {

            pre_sum+=arr[i];

            if(hset.contains(pre_sum)){
                System.out.println("true");
                break;
            }

            if(pre_sum==0){
                System.out.println("true");
                break;
            }

            hset.add(pre_sum);

        }

    }
}
