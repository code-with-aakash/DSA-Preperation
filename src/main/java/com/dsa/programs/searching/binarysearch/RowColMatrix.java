package com.dsa.programs.searching;

import java.util.Arrays;

public class RowColMatrix {

    public static void main(String[] args) {

        int[][] arr = {
                {1,3,4,5},
                {2,6,8,10},
                {11,12,13,14},
                {20,22,23,25}

        };
        int target = 0;
        if(matrixSearch(arr,target)){
            System.out.println("true");
        }
        else System.out.println("false" );

    }

    static boolean matrixSearch(int[][] arr, int target){

        int r =0;
        int c = arr[0].length-1;

        while(r< arr.length && c>=0){

            if(arr[r][c]==target){

                return true;
            }

            if(arr[r][c]<target){
                r++;
            }else{
                c--;
            }

        }

        return false;
    }

}
