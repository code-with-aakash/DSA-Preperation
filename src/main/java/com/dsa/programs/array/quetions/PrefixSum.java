package com.dsa.programs.array.quetions;

public class PrefixSum {
    static int[] arr ={2,8,3,9,6,5,4};

    static int[] psum = new int[arr.length];
    public static void main(String[] args) {


        psum[0]=arr[0];
        for (int i = 1; i < arr.length; i++) {
            psum[i]=psum[i-1]+arr[i];
        }
        System.out.println(sum(0,2));
        System.out.println(sum(1,3));
        System.out.println(sum(2,6));


    }

    static int sum(int l , int r){

        if(l==0)return psum[r];
        else return psum[r]-psum[l-1];
    }
}
