package com.dsa.programs.array.quetions;

public class MaximumSumSubArray {

    public static void main(String[] args) {

        int[] arr = {-3,8,-2,4,-5,6};
        int res =arr[0];
        int max =arr[0];
        for (int i = 1; i < arr.length; i++) {

            max = Math.max(max+arr[i],arr[i]);
            res = Math.max(res,max);

        }
        System.out.println(res);
    }
}
