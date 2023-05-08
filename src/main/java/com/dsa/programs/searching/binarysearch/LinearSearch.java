package com.dsa.programs.searching.binarysearch;

public class LinearSearch {

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6};

        int target=6;
        System.out.println(search(arr,target));
        
    }
    
    static boolean search(int[] arr, int target){

        for (int a: arr) {

            if(a==target){
                return true;
            }
            
        }

        return false;
    }
    
}
