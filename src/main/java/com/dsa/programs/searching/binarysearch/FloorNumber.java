package com.dsa.programs.searching;

public class FloorNumber {

    /**
     * greatest number smaller or equal to target
     */
    public static void main(String[] args) {

        int[] arr = {2,3,5,9,14,16,18};
        int target = 1;
        System.out.println(floorOfNo(arr,target));

    }

    static int floorOfNo(int[] arr , int target){

        int s =0;
        int e = arr.length-1;


        int m =0;
        while (s<=e){

             m= s+(e-s)/2;

            if(arr[m]==target){
                System.out.println(arr[m]);
                return m;
            }

            if(target<arr[m]){
                e=m-1;

            }else{
                s = m+1;

            }
        }

        System.out.println(m);
        return arr[e];

    }


}
