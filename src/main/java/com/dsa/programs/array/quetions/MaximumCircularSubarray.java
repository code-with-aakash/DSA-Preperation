package com.dsa.programs.array.quetions;

public class MaximumCircularSubarray {

    public static void main(String[] args) {

        int[] arr ={8,-4,3,-5,4};
        int res=0;
        // naive solution
        for (int i = 0; i < arr.length; i++) {
            int curr_sum=arr[i];
            int curr_max=arr[i];
            // here j starts with 1 as we need to move in circular manner.
            for (int j = 1; j < arr.length; j++) {
                // here index moves in circular manner for 0 to n and n to 0 .
                int index = (i+j)% arr.length;
                curr_sum+=arr[index];
                curr_max = Math.max(curr_max,curr_sum);
            }
            res = Math.max(res,curr_max);
        }

        System.out.println(res);


        // kadane's algorithm

        // the idea here is in the middle element we will have minimum value only so we want to ignore the middle elements
        // and add only start and end elements this will give us the maximum in array .
        // so to find out this we simple subtract the middle elements from start and end element.

        System.out.println(maxSum(arr));




    }

    static int maxSum(int[] arr ){
        int max_nomal = MaxSum(arr, arr.length);
        System.out.println("max normal is "+max_nomal);
        // means all elements in array are negatives only hence return the max normal .
        if (max_nomal < 0) {
            return max_nomal;
        }
        int arr_sum = 0;
        for (int i = 0; i < arr.length; i++) {

            arr_sum += arr[i];
            // to find the minimum middle element we invert all the array element and find the maximum
            // in that this will give the minimum elements in array
            arr[i] = -arr[i];

        }
        // this is nothing but arr_sum - minimum elements (arr) where arr sum is sum of all array elements
        int max_circular = arr_sum + MaxSum(arr, arr.length);
        return Math.max(max_circular, max_nomal);
    }


    static int MaxSum(int[] arr, int n ){

        int res = arr[0];
        int maxEnd =arr[0];

        for (int i = 1; i < n; i++) {

            maxEnd= Math.max(arr[i],maxEnd+arr[i]);
            res = Math.max(res,maxEnd);

        }
        return res;

    }
}
