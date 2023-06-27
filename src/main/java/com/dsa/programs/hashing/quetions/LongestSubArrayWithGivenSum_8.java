package com.dsa.programs.hashing.quetions;

import java.util.HashMap;

public class LongestSubArrayWithGivenSum_8 {

    public static void main(String[] args) {

        int[] arr = {2,1,3,4,5,6};

        int sum =10;
        int res=0;
        // naive method
        for (int i = 0; i < arr.length; i++) {
            int pre_sum=0;
            for (int j = i; j < arr. length; j++) {
                pre_sum+=arr[j];
                if(pre_sum==sum){
                    res = Math.max(res,j-i+1);
                }
            }
        }


        System.out.println(res);
        res=0;

        // efficient solution

        int curr_sum=0;
        HashMap<Integer,Integer> hmap = new HashMap <>();
        for (int i = 0; i < arr.length; i++) {
            curr_sum+=arr[i];

            if(curr_sum==sum){
              res=i+1;
            }

            if(!hmap.containsKey(curr_sum)){
                hmap.put(curr_sum,i);
            }

            if(hmap.containsKey(curr_sum-sum)){
                res=Math.max(res,i-hmap.get(curr_sum-sum));
            }

        }
        res=(res==Integer.MAX_VALUE) ? 0:res;
        System.out.println(res);

    }





}
