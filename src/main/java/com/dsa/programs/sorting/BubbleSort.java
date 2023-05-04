package com.dsa.programs.sorting;

import java.util.Arrays;

public class BubbleSort {

    // compare adjacent elements and if next element is greater than previous element swap them .
    public static void main(String[] args) {

        int[] arr= {5,4,3,2,1};

        System.out.println(Arrays.toString(bubble2(arr)));

    }

    static int[] bubble(int[] arr ){


        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr.length-i-1; j++) {

                if(arr[j]>arr[j+1]){

                    arr[j]=arr[j]+arr[j+1];
                    arr[j+1]=arr[j]-arr[j+1];
                    arr[j]=arr[j]-arr[j+1];
                }

            }

        }

        return arr;


    }

    static int[] bubble2(int[] arr ){


        for (int i = 0; i < arr.length; i++) {

            for (int j = 1; j < arr.length-i; j++) {

                if(arr[j]<arr[j-1]){

                    arr[j]=arr[j]+arr[j-1];
                    arr[j-1]=arr[j]-arr[j-1];
                    arr[j]=arr[j]-arr[j-1];
                }

            }

        }

        return arr;


    }

}
