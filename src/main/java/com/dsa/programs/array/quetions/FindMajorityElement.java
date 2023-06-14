package com.dsa.programs.array.quetions;

public class FindMajorityElement {

    public static void main(String[] args) {
        int[] arr ={8,8,8,6,8,4};
        System.out.println(findMajority(arr));
    }

    static int findMajority(int[] arr ){
        int count=0;
        int res =arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==res){
                count++;
            }else
                count--;
            if(count==0){
                res = arr[i];
                count=1;
            }
        }
        count=0;
        for (int i = 0; i < arr.length; i++) {
            if(res==arr[i]){
                count++;
            }
        }
        if(count>arr.length/2){
            return res;
        }else
            return -1;
    }
}
