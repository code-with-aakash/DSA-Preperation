package com.dsa.programs.recursion.backtracking;

import java.util.ArrayList;
import java.util.Arrays;

public class NQueensProblem {

    public static void main(String[] args) {

        int n = 5;
        boolean[][] board = new boolean[n][n];

        System.out.println(queens(board, 0));

    }

    static int queens(boolean[][] board, int row) {

        if (row == board.length) {

            display(board);
            System.out.println();

            return 1;

        }

        int count = 0;

        for (int col = 0; col < board.length; col++) {

            if (issafe(board, row, col)) {

                // here we are marking the board as true and calling for the queens for recursion to check if we can find the answer
                board[row][col] = true;

                // we are calling recursion for the down rows from here
                count += queens(board, row + 1);

                // here we are making it again false so that it can be used for the next recursion.
                board[row][col] = false;
            }

        }

        return count;


    }

    private static boolean issafe(boolean[][] board, int row, int col) {


/*
         no need to check at bottom level as if queen is placed we need to check top left or right only as
         bottom level queen is not placed
*/



        //check vertical row
        for (int i = 0; i < row; i++) {

            // if true means queen is present here hence return false
            if (board[i][col]) {
                return false;
            }


        }


/*
         diagonal left
         here we need to move to diagonal left hence we are taking minimum of row and columns as
         if we take max then one will go in negative
*/

        int maxLeft = Math.min(row, col);
        for (int i = 1; i <= maxLeft; i++) {

            // if true means queen is present here hence return false
            if (board[row - i][col - i]) {
                return false;
            }
        }


/*
         diagonal right
         here we are taking minimum value of row or column to reach the right most line ,
         hence we are taking total length - col to get the right side col value
*/

        int maxRight = Math.min(row, board.length - col - 1);
        for (int i = 1; i <= maxRight; i++) {

            // if true means queen is present here hence return false
            if (board[row - i][col + i]) {
                return false;
            }
        }
        return true;

    }

    private static void display(boolean[][] board) {

        for (boolean[] arr : board) {

            for (boolean i : arr) {

                // if true means queen is present hence print Q
                if (i) {
                    System.out.print("Q ");
                } else
                    System.out.print("X ");

            }
            System.out.println();
        }

    }

    /*
    static ArrayList< ArrayList <String> > queens(boolean[][] board, int row) {
        ArrayList< ArrayList <String> > outerList = new ArrayList <>();
        if (row == board.length) {
            outerList.add(display(board));
            return outerList;
        }
        for (int col = 0; col < board.length; col++) {
            if (issafe(board, row, col)) {
                board[row][col] = true;
                outerList.addAll(queens(board, row + 1));
                board[row][col] = false;
            }
        }
        return outerList;
    }

    private static boolean issafe(boolean[][] board, int row, int col) {

        for (int i = 0; i < row; i++) {
            if (board[i][col]) {
                return false;
            }
        }
        int maxLeft = Math.min(row, col);
        for (int i = 1; i <= maxLeft; i++) {
            if (board[row - i][col - i]) {
                return false;
            }
        }

        int maxRight = Math.min(row, board.length - col - 1);
        for (int i = 1; i <= maxRight; i++) {
            if (board[row - i][col + i]) {
                return false;
            }
        }
        return true;

    }

    private static ArrayList<String> display(boolean[][] board) {

        ArrayList<String> innerlist = new ArrayList <>();
        for (boolean[] arr : board) {
            System.out.println(Arrays.toString(arr));
            String s ="";
            for (boolean i : arr) {
                if (i) {
                    s +="Q";
                } else{
                    s +=".";
                }
            }
            innerlist.add(s);
            System.out.println();
        }
        return innerlist;
    }
    */


}
