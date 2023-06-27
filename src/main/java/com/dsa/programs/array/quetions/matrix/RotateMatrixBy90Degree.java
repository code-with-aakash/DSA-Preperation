package com.dsa.programs.array.quetions.matrix;

import java.util.Arrays;

public class RotateMatrixBy90Degree {

    public static void main(String[] args) {

        // here we first inverse the matrix and then reverse each row

        // here we are making inverse of matrix
        // inverse means 1st row becomes 1st column and 2nd row becomes 2 nd column like this .
        // i,j reverse with j,i
        int[][] arr ={{1,2,3},{4,5,6},{7,8,9}};

        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr[i].length; j++) {

                    swap(arr, i, j);


            }
        }


        for (int[] ints : arr) {

            System.out.println(Arrays.toString(ints));

        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length/2; j++) {

                int temp =arr[i][j];
                arr[i][j]=arr[i][arr.length-1-j];
                arr[i][arr.length-1-j]=temp;


            }
        }

        for (int[] ints : arr) {

            System.out.println(Arrays.toString(ints));

        }
    }



    private static void swap(int[][] arr, int i, int j) {

        int temp = arr[i][j];
        arr[i][j]=arr[j][i];
        arr[j][i]=temp;

    }
}
