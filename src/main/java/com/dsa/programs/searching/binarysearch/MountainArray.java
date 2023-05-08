package com.dsa.programs.searching.binarysearch;

public class MountainArray {
    public static void main(String[] args) {

        int[] array = {1,2,3,4,5,3,1};
        int target = 3;

        int ans = cielingOfNo(array,target,true);
        if(ans>-1)
            System.out.println(cielingOfNo(array,target,true));
        else {
            System.out.println(cielingOfNo(array, target, false));
        }

    }

    static int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid+1]) {
                // you are in dec part of array
                // this may be the ans, but look at left
                // this is why end != mid - 1
                end = mid;
            } else {
                // you are in asc part of array
                start = mid + 1; // because we know that mid+1 element > mid element
            }
        }
        // in the end, start == end and pointing to the largest number because of the 2 checks above
        // start and end are always trying to find max element in the above 2 checks
        // hence, when they are pointing to just one element, that is the max one because that is what the checks say
        // more elaboration: at every point of time for start and end, they have the best possible answer till that time
        // and if we are saying that only one item is remaining, hence cuz of above line that is the best possible ans
        return start; // or return end as both are =
    }


    static int cielingOfNo(int[] arr , int target,boolean increasing){

        int s =0;
        int e = arr.length-1;

        int m = peakIndexInMountainArray(arr);

        while (s<=e){



            if(arr[m]==target){
                return m;
            }

            if(increasing) {

                if (target < arr[m]) {
                    e = m - 1;
                } else {
                    s = m + 1;
                }
            }else{

                if (target > arr[m]) {
                    e = m - 1;
                } else {
                    s = m + 1;
                }
            }

            m = s+(e-s)/2;
        }
        return -1;

    }
}
