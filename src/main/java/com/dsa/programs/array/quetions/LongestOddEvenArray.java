package com.dsa.programs.array.quetions;

public class LongestOddEvenArray {

    public static void main(String[] args) {

        int[] arr ={5,10,20,6,3,8};
        int res=0,count=1;


        for (int i = 0; i < arr.length-1; i++) {

            if((arr[i]%2==0 && arr[i+1]%2!=0 )||
                    (arr[i+1]%2==0 && arr[i]%2!=0)){
                count++;
            }else{
                count=1;
            }

            res=Math.max(res,count);

        }
        System.out.println(res);

    }
}
