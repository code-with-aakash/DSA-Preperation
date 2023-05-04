package com.dsa.programs.searching;

public class SearchInInfiniteArray {

    public static void main(String[] args) {

        int[] arr= {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
        int target = 9;
        System.out.println(ans(arr,target));



    }

    static int ans (int[] arr , int target  ){

        int start =0;
        int end =1;

        while (target>arr[end]){

            int temp = end+1;

            end = end+ (end-start+1)*2;

            start = temp;

        }

        return search(arr,target,start,end);

    }

    static int search(int[] arr , int target, int s , int e){

        while (s<=e){

            int m= s+(e-s)/2;
            if(target<arr[m]){
                e=m-1;
            }else if(target>arr[m]){
                s = m+1;
            }
            else
            {
                return  m;

            }
        }
        return -1;
    }

}
