package com.dsa.programs.hashing.quetions;

import java.util.HashMap;

public class LongestSubArrayWithEqualNoOf1sAnd0s_9 {

    public static void main(String[] args) {

        int[] arr ={1,1,1,0,1, 1,0};

        int res=0;

        // naive method
        for (int i=0;i< arr.length ; i++) {
            int c_0=0;
            int c_1=0;
            for (int j = i; j < arr.length; j++) {
                if(arr[j]==0) c_0++;
                if(arr[j]==1) c_1++;
                if(c_0==c_1){
                    res=Math.max(res,c_0+c_1);
                }
            }
        }
        System.out.println(res);

        // efficient Method
        res=0;
        HashMap<Integer,Integer> hmap = new HashMap<>();
        // here we are replacing 0's with -1 and hence the problem will become maximum sub with zero sum
        for (int i = 0; i < arr.length; i++)
            if (arr[i] == 0) arr[i] = -1;
        int curr_sum=0,sum=0;
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
        System.out.println(res);
    }
}
