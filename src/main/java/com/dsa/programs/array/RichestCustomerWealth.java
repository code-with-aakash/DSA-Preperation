package com.dsa.programs.array;

public class RichestCustomerWealth {


    public static void main(String[] args) {

        int[][] arr = {
                {2,8,7},{7,1,3},{1,9,5}
        };

        System.out.println(wealth(arr));



    }

    static int wealth(int[][] arr ){

        int target2= Integer.MIN_VALUE;

        for(int i =0;i< arr.length;i++){

            int target=0;
            for (int j =0 ;j<arr[i].length;j++){

                target += arr[i][j];

            }

            target2 = Math.max(target,target2);
        }

        return target2;

    }
}
