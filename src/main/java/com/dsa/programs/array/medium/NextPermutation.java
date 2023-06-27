package com.dsa.programs.array.medium;

import java.util.Arrays;

public class NextPermutation {

    public static void main(String[] args) {

        int[] arr = {1,1,5};
        int index =0;
        for (int i = arr.length-2; i >=0 ; i--) {

            if(arr[i]<arr[i+1]){
                index = i;
            }

        }
        int index2 =0;
        for (int i = arr.length-2; i >=0 ; i--) {

            if(arr[i]<arr[i+1]){
                index = i+1;
            }

        }

        swap (arr,index,index2);
        reverse(arr,index+1,arr.length-1);
        System.out.println(Arrays.toString(arr));


    }

    private static void reverse(int[] arr, int index, int i) {
        while(index<=i){
            int temp = arr[index];
            arr[index]=arr[i];
            arr[i]=temp;
            index++;
            i--;
        }
    }

    private static void swap(int[] arr, int index, int index2) {

        int temp = arr[index];
        arr[index]=arr[index2];
        arr[index2]=temp;
    }
}
