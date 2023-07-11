package com.dsa.programs.sorting;

import java.util.Arrays;

public class InsertionSort {

    public static void main(String[] args) {

        int[] arr ={5,4,3,2,1};

        // here we are sorting the array by comparing the adjacent element
        // the trick is we are sorting array at particular index from i to j
        // in first iteration it will sort 0 to 1 index
        // in 2nd iteration it will sort 0 to 2 index and continue.
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j >0 ; j--) {

                if(arr[j]<arr[j-1]){
                    int temp = arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }else {
                    break;
                }

            }
        }

        System.out.println(Arrays.toString(arr));

    }
}
