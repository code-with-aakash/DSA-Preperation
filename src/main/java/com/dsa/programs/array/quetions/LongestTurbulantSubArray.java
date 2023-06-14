package com.dsa.programs.array.quetions;

public class LongestTurbulantSubArray {

    public static void main(String[] args) {

        int[] arr = {9,4,2,10,7,8,8,1,9};
        int curr =1;
        int res =0;

        for (int i = 0; i < arr.length-2; i++) {

            if(arr[i]>arr[i+1]|| arr[i+1]<arr[i+2]){
                curr++;
            }
            else {
                curr=1;
            }
            res = Math.max(res,curr);
        }

        System.out.println(res);

    }
}
