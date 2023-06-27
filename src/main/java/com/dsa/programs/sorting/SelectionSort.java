package com.dsa.programs.sorting;

import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {

        int[] arr = {5,4,3,2,1};

        // select element and put that at its correct index;
        for (int i = 0; i < arr.length; i++) {

                int last = arr.length-i-1;
                int max = max(arr,0,last);

                int temp = arr[last];
                arr[last]=arr[max];
                arr[max]=temp;

        }

        System.out.println(Arrays.toString(arr));



    }

    private static int max(int[] arr, int start, int end) {
        int max =start;
        // here we are calculating  the index of maximum element.
        for (int i = start; i <=end; i++) {

            if(arr[max]<arr[i]) {
                max = i;
            }


        }

        return max;

    }
}
