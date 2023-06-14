package com.dsa.programs.array.quetions;

public class EquilibriumPoint {

    private static int res=0;

    public static void main(String[] args) {

        int[] arr = {3,4,8,-9,20,6};


        for (int a = 0; a < arr.length; a++) {

            res +=arr[a];
        }

        int lsum=0;
        for (int i = 0; i < arr.length; i++) {

            res-=arr[i];

            if(res==lsum){
                System.out.println("true");
                return;
            }

            lsum=lsum+arr[i];
        }

    }
}
