package com.dsa.programs.array.quetions.matrix;

import java.util.Arrays;

public class SetMatrix {

    public static void main(String[] args) {


        int[][] matrix = {{0,1,2,0},{3,4,5,2},{1,3,1,5}};

        optimalSolution(matrix);

        // brute force
        for (int i = 0; i < matrix.length; i++) {

            for (int j = 0; j < matrix[i].length; j++) {
                //here we are traversing through every row and column
                // if we find 0 at particular index then we update that whole row as -1 and whole column as -1.

                if(matrix[i][j]==0){
                    // here marking all rows -1
                    markRow(matrix,j);
                    // here marking all column as -1
                    markColumn(matrix,i);
                }

            }

        }

        // now iterate over the matrix and wherever -1 is present mark that as 0.

        for (int[] ints : matrix) {

            System.out.println(Arrays.toString(ints));

        }

        // better solution
        betterSolution(matrix);


    }

    private static void optimalSolution(int[][] matrix) {

        // in optimal solution we are not using any extra space for storing matrix index .
        // instead we are using the first row and first column of matrix to store the indexes.


//        int[] col=new int[matrix.length]; --> matrix[0][..]
//        int[] row = new int[matrix.length];--> matrix[..][0]
        int col=1;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {

                if(matrix[i][j]==0){
                    // mark the ith row
                    matrix[i][0]=0;

                    // mark the jth column
                    // here we are not using j column to store index of 0th column as this matrix[0][0] index is common for both row and column
                    // hence we created and extra variable to count that column.
                    if(j!=0){
                    matrix[0][j]=0;
                    }else{
                        col=0;
                    }

                }


            }
        }
        for (int i = 1; i < matrix.length; i++) {

            for (int j = 1; j < matrix[i].length; j++) {

                if(matrix[i][j]!=0){

                    if(matrix[i][0]==0||matrix[0][j]==0){
                        matrix[i][j]=0;
                    }
                }

            }
        }

        // for 1st row and 1st column
        if(matrix[0][0]==0){
            for (int i = 0; i < matrix[0].length; i++) {
                matrix[0][i]=0;
            }
        }

        if(col==0){
            for (int i = 0; i < matrix.length; i++) {
                matrix[i][0]=0;
            }
        }

        //
        System.out.println("optimal solution");
        for (int i = 0; i < matrix.length; i++) {

            System.out.println(Arrays.toString(matrix[i]));

        }

    }

    private static void betterSolution(int[][] matrix) {
        // in better solution we are using extra column and row array .
        // if we find tha index where 0 occurs while traversing we mark that row index and column index in the newly created row column matrix as 0.
        // now traverse through matrix and check that row index or column index and mark that array elements as 0.

        int[] col=new int[matrix.length];
        int[] row = new int[matrix.length];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {

                if(matrix[i][j]==0){
                    row[i]=1;
                    col[j]=1;
                }

            }
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {

                if(row[i]==1 || col[j]==1){
                    matrix[i][j]=0;
                }

            }
        }
        for (int i = 0; i < matrix.length; i++) {

            System.out.println(Arrays.toString(matrix[i]));

        }
    }

    private static void markColumn(int[][] matrix, int j) {

        for (int i = 0; i < matrix[0].length ; i++) {
            if( j< matrix.length && matrix[j][i]!=0){
                matrix[j][i]=-1;
            }
        }
    }

    private static void markRow(int[][] matrix, int i) {

        for (int j = 0; j < matrix.length; j++) {
            if(matrix[j][i]!=0){
                matrix[j][i]=-1;
            }
        }

    }
}
