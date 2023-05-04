package com.dsa.programs.recursion.backtracking;

public class SudokuSolverLeetcode {

    public static void main(String[] args) {

        char[][] board = new char[][]{
                {'5','3','.','.','7','.','.','.','.'},
                {'6','.','.','1','9','5','.','.','.'},
                {'.','9','8','.','.','.','.','6','.'},
                {'8','.','.','.','6','.','.','.','3'},
                {'4','.','.','8','.','3','.','.','1'},
                {'7','.','.','.','2','.','.','.','6'},
                {'.','6','.','.','.','.','2','8','.'},
                {'.','.','.','4','1','9','.','.','5'},
                {'.','.','.','.','8','.','.','7','9'}
        };

        int n = 10;
        char c = (char)(n + '0');
//        String d = (String) String.valueOf(n);
        System.out.println(" char value is "+c);


        if(solve(board)){
            display(board);
        }
        else {
            System.out.println("can not solve suduko");
        }


    }

    static boolean solve(char[][] board) {

        int n = board.length;
        int row = -1;
        int col = -1;

        // first empty space is true so that we can start placing element in it
        boolean emptyLeft = true;

        // here how we are replacing r,c from argument
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j]== '.') {
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
                board[row][col] = (char) (number+'0');
                if (solve(board)) {
                    // sudoku solved
                    return true;
                } else {
                    // back track to find another answer
                    board[row][col] = '.';
                }

            }

        }

        return false;

    }

    static boolean isSafe(char[][] board, int row, int col, int num) {

        // check for row
        for (int i = 0; i < board.length; i++) {

            // if number already present then return false
            if (board[row][i]==(char)(num+'0') ) {

                return false;
            }

        }

        // check for column
        for (char[] nums : board) {

            if (nums[col]==(char)(num+'0') ) {

                return false;
            }
        }

        int sqrt = (int) Math.sqrt(board.length);
        int rowStart = row - row % sqrt;
        int colStart = col - col % sqrt;

        for (int r = rowStart; r < rowStart + sqrt; r++) {

            for (int c = colStart; c < colStart + sqrt; c++) {

                if (board[r][c]==(char)(num+'0') ) {
                    return false;
                }
            }


        }

        return true;


    }

    private static void display(char[][] board) {

        for (char[] row : board) {

            for (char num : row) {

                System.out.print(num);

            }
            System.out.println();
        }
    }

}
