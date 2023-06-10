package com.dsa.programs.bitmagic;

import java.util.Arrays;

public class CountingBits {

    public static void main(String[] args) {


        int a =5;
        int[] arr = new int[a+1];

        // naive solution
        // efficient solution can be done by using DP
        for(int i=0;i<=a;i++){

            arr[i]=countbits(i);
        }

        System.out.println(Arrays.toString(arr));

    }

    private static int countbits(int n) {
        int res = 0;
        while (n > 0) {
            n = n & (n - 1);
            res++;

        }
        return res;
    }
}
