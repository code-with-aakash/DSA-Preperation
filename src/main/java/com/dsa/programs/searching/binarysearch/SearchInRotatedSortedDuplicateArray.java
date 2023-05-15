package com.dsa.programs.searching.binarysearch;

public class SearchInRotatedSortedDuplicateArray {

    public static void main(String[] args) {


        int[] nums = {1,2,2,3,4,4};
        int target = 4;

        System.out.println(search(nums,target));




    }

    static int search (int[] nums ,int target){

        int pivot = findPivot(nums);

        if(pivot==-1){
            // means pivot is not fount means array is not rotational sorted hence apply simple binary search
            return binsearch(nums,target,0,nums.length-1);

        }

        if(nums[pivot]==target){
            return pivot;
        }

        if(target>=nums[0]){
            return binsearch(nums,target,0,pivot-1);
        }
        return binsearch(nums,target,pivot+1,nums.length-1);

    }


        private static int binsearch(int[] arr, int target, int start, int end) {
            while(start<=end) {
                int m = start + (end-start) / 2;
                if (arr[m] == target) {
                    return m;
                }
                if (target < arr[m]) {
                    end = m - 1;
                } else {
                    start = m + 1;
                }
            }
            return -1;
        }

    static int findPivot(int[] arr){

        int start=0;
        int end = arr.length-1;

        while (start<=end){

            int mid = start + (end-start)/2;

            if(mid<end && arr[mid]>arr[mid+1]){
                return mid;
            }

            if(mid>start && arr[mid]<arr[mid-1]){
                return mid-1;
            }

            if(arr[mid]==arr[start] && arr[mid]==arr[end]){

                if(start<end && arr[start]>arr[start+1]){

                    return start;
                }
                start++;

                if(end > 0 && arr[end]<arr[end-1]){
                    return end-1;
                }
                end--;


            }

            else if(arr[start]<arr[mid] || (arr[start]==arr[mid] && arr[end]<arr[mid])) {

                start = mid+1;

            }
            else {
                end = end-1;
            }


        }
        return -1;
    }

}
