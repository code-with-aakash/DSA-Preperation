package com.dsa.programs.searching.binarysearch;

public class SearchRange {

    public static void main(String[] args) {

        int[] nums = {5,7,7,8,8,8,8,10};
        int target = 8;

        int[] arr = {-1,-1};

        int first = search(nums,target,true);
        int last = search(nums,target,false);

        System.out.println("start is "+first+" end is "+last);

    }

    static int search(int[] arr , int target, boolean firstoccurence){
        int ans =-1;
        int s =0;
        int e = arr.length-1;
        int m =0;
        while (s<=e){

            m= s+(e-s)/2;
            if(target<arr[m]){
                e=m-1;
            }else if(target>arr[m]){
                s = m+1;
            }
            else
            {
                ans = m;
                if(firstoccurence) {
                    e = m-1;
                }else {
                    s=m+1;
                }
            }
        }
        return ans;
    }
}
