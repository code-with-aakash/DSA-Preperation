package com.dsa.programs.recursion.backtracking;

public class SudokuSolver {

    public static void main(String[] args) {

        int[][] board = new int[][]{
                {5, 3, 0, 0, 7, 0, 0, 0, 0},
                {6, 0, 0, 1, 9, 5, 0, 0, 0},
                {0, 9, 8, 0, 0, 0, 0, 6, 0},
                {8, 0, 0, 0, 6, 0, 0, 0, 3},
                {4, 0, 0, 8, 0, 3, 0, 0, 1},
                {7, 0, 0, 0, 2, 0, 0, 0, 6},
                {0, 6, 0, 0, 0, 0, 2, 8, 0},
                {0, 0, 0, 4, 1, 9, 0, 0, 5},
                {0, 0, 0, 0, 8, 0, 0, 7, 9}
        };

        if(solve(board)){
            display(board);
        }
        else {
            System.out.println("can not solve suduko");
        }


    }

    static boolean solve(int[][] board) {

        int n = board.length;
        int row = -1;
        int col = -1;

        // first empty space is true so that we can start placing element in it
        boolean emptyLeft = true;

        // here how we are replacing r,c from argument
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == 0) {
                    row = i;
                    col = j;
                    emptyLeft = false;
                    break;
                }
            }
            //if you find some empty space then break
            if (emptyLeft==false) {
                break;
            }
        }

        //here if empty element is true means no empty space is left sudoku is solved
        if (emptyLeft==true) {
            return true;
        }

        // backtrack
        for (int number = 1; number <= 9; number++) {
            if (isSafe(board, row, col, number)) {

                // here we are passing number and calling solve function recursilvely
                // to check if we have found our answer
                board[row][col] = number;
                if (solve(board)) {
                    // sudoku solved
                    return true;
                } else {
                    // back track to find another answer
                    board[row][col] = 0;
                }

            }

        }

        return false;

    }

    static boolean isSafe(int[][] board, int row, int col, int num) {

        // check for row
        for (int i = 0; i < board.length; i++) {

            // if number already present then return false
            if (board[row][i] == num) {

                return false;
            }

        }

        // check for column
        for (int[] nums : board) {

            if (nums[col] == num) {

                return false;
            }
        }

        int sqrt = (int) Math.sqrt(board.length);
        int rowStart = row - row % sqrt;
        int colStart = col - col % sqrt;

        for (int r = rowStart; r < rowStart + sqrt; r++) {

            for (int c = colStart; c < colStart + sqrt; c++) {

                if (board[r][c] == num) {
                    return false;
                }
            }


        }

        return true;


    }

    private static void display(int[][] board) {

        for (int[] row : board) {

            for (int num : row) {

                System.out.print(num + " ");

            }
            System.out.println();
        }
    }

}
