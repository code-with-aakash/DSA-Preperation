package com.dsa.programs.recursion.assignment;

public class MinimumAndMaximumElement {

    public static void main(String[] args) {

        int[] arr = {1, 4, 45, 6, 10, -8};
        minmax(arr,0,arr.length);

    }

    static void minmax (int[] arr , int s , int e ){



        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

            for (int i =0;i<e;i++){
                 min = Math.min(arr[i],min);
                 max = Math.max(arr[i],max);

        }


        System.out.println("minimum value is "+min +" maximum value is "+max);


    }

}
