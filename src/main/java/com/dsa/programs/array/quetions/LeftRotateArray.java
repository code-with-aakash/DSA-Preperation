package com.dsa.programs.array.quetions;

import java.util.Arrays;

public class LeftRotateArray {


    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6,7};
        int d=3;
        int k=d%arr.length;
        reverse(arr,0,k-1);
        reverse(arr,k,arr.length-1);
        reverse(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));

    }

    private static void reverse(int[] arr, int i, int j) {
        while(i<j){
            int temp =arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    }




}
