package com.dsa.programs.stackandqueue.quetions;

import java.util.Stack;

public class LargestRactanglewithAll1 {

/*
    Approach
    Here the idea is we consider each row as largest area histogram problem with heights o and 1 .
    first we calculate the largest area of row 1 .
    and next we will calculate largest area of next rows one by one and return the maximum area.
    while moving to next row if the value of arr[r][c] is 0 means that element is 0
    we simply ignore it and if its 1 we add this to next row like if value is 1 we
    add that in next row . and calculate area of next row
*/

    public static void main(String[] args) {

        int[][] arr = {{1,0,1,0,0},{1,0,1,1,1},{1,1,1,1,1},{1,0,0,1,0}};

        int res = efficientSolution(arr[0],arr[0].length);

        for (int i = 1; i < arr.length; i++) {

            for (int j = 0; j < arr[i].length; j++) {

                if(arr[i][j]==1){
                    arr[i][j]+=arr[i-1][j];
                }

            }
            res = Math.max(res,efficientSolution(arr[i],arr[i].length));

        }

        System.out.println("Result is "+res);



    }

    static int efficientSolution(int[] arr , int n ){

        Stack <Integer> sk = new Stack <>();
        int res = 0 ;
        for (int i = 0; i < n; i++) {

            while(!sk.isEmpty() && arr[sk.peek()]>=arr[i]){

                int temp = sk.pop();
                int curr = arr[temp]*(sk.isEmpty()?i:(i-sk.peek()-1));
                res = Math.max(res,curr);

            }

            sk.push(i);

        }

        while(!sk.isEmpty()){

            int temp = sk.pop();
            int curr = arr[temp]*(sk.isEmpty()?n:(n-sk.peek()-1));
            res = Math.max(res,curr);
        }

        return res;
    }

}


/*
    public int maximalRectangle(char[][] arr) {

        int res = efficientSolution(arr[0],arr[0].length);

        for (int i = 1; i < arr.length; i++) {

            for (int j = 0; j < arr[i].length; j++) {

                if(arr[i][j]=='1'){
                    arr[i][j]+=(arr[i-1][j]-'0');
                }

            }
            res = Math.max(res,efficientSolution(arr[i],arr[i].length));

        }

        return res;



    }

    static int efficientSolution(char[] arr , int n ){

        Stack <Integer> sk = new Stack <>();
        int res = 0 ;
        for (int i = 0; i < n; i++) {

            while(!sk.isEmpty() && arr[sk.peek()]>=arr[i]){

                int temp = sk.pop();
                int curr = (arr[temp]-'0')*(sk.isEmpty() ? i : (i-sk.peek()-1));
                res = Math.max(res,curr);

            }

            sk.push(i);

        }

        while(!sk.isEmpty()){

            int temp = sk.pop();
            int curr = (arr[temp]-'0')*(sk.isEmpty() ? n : (n-sk.peek()-1));
            res = Math.max(res,curr);
        }

        return res;
    }
*/

