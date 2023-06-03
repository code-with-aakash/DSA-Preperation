package com.dsa.programs.hashing.quetions;

import java.util.HashMap;

public class LongestCommonSubArrayWithGivenSum_10 {

    public static void main(String[] args) {

        int[] a ={0,1,0,1,1,1,1};
        int[] b ={1,1,1,1,1,0,1};
        int res = 0;

        for (int i = 0; i < a.length; i++) {
            int sum_1=0,sum_2=0;
            for (int j = i; j < a.length; j++) {
                sum_1+=a[j];
                sum_2+=b[j];
                if(sum_1==sum_2){
                    res=Math.max(res,j-i+1);
                }
            }
        }
        System.out.println(res);

        int pre_sum_1=0,pre_sum_2=0;
        // efficient Method
        for (int i = 0; i <a.length ; i++) {

            pre_sum_1+=a[i];
            pre_sum_2+=b[i];

            if(pre_sum_1==pre_sum_2){

                res=Math.max(res,i);
            }

        }
        System.out.println(res);

        // another approach

        int[] c = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            c[i]=a[i]-b[i];
        }

        res=0;
        int presum=0;
        HashMap<Integer,Integer> hmap = new HashMap<>();
        for (int i = 0; i < c.length; i++) {

            presum+=c[i];

            if(presum==0){
                res=i+1;
            }

            if(!hmap.containsKey(presum)){
                hmap.put(presum,i);
            }
            if(hmap.containsKey(presum)){
                res=Math.max(res,i-hmap.get(presum));
            }


        }
        System.out.println(res);
    }







}
