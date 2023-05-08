package com.dsa.programs.searching.binarysearch;

public class SplitArray {

    public static void main(String[] args) {

        int[] nums = {7,2,5,10,8};
        int k =2;

        System.out.println(splitArray(nums,k));


    }

    static int splitArray(int[] nums, int k) {

        int start =0;
        int end = 0;


        for (int i = 0; i < nums.length; i++) {

            start = Math.max(start,nums[i]);
            end+=nums[i];
        }


        // binary search

        while(start<end){

            int mid = start + (end-start)/2;

            // in how many pieces u can divide this array so that elements sum does not exceed the mid
            int sum =0;
            int pieces=1;
            for (int num: nums) {

                if(sum + num > mid){

                    sum = num; // add num only in sum it will become like = 0+7+2+5 < mid
                    pieces++;

                }
                else{
                    sum += num;
                }

            }

            if (pieces>k){
                start=mid+1;
            }
            else if(pieces<=k) {
                end = mid;
            }


        }

        return end ;

    }

}

