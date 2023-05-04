package com.dsa.programs.recursion.backtracking;

import java.util.HashSet;
import java.util.Set;

public class ValidSudokuSolverLeetcode {

    public static void main(String[] args) {

        char[][] board = new char[][]{
                {'.','.','.','.','5','.','.','1','.'},
                {'.','4','.','3','.','.','.','.','.'},
                {'.','.','.','.','.','3','.','.','1'},
                {'8','.','.','.','.','.','.','2','.'},
                {'.','.','2','.','7','.','.','.','.'},
                {'.','1','5','.','.','.','.','.','.'},
                {'.','.','.','.','.','2','.','.','.'},
                {'.','2','.','9','.','.','.','.','.'},
                {'.','.','4','.','.','.','.','.','.'}};

        int n = 10;
        char c = (char)(n + '0');
//        String d = (String) String.valueOf(n);
        System.out.println(" char value is "+c);

            System.out.println(solve(board));


    }

    static boolean solve(char[][] board) {

        boolean isvalid = true;

        int row = board.length;
        int col = board[0].length;
        // here how we are replacing r,c from argument

        for (int i = 0; i < row; i++) {
            HashSet< Character > ch2 = new HashSet <>();
            HashSet< Character > ch = new HashSet <>();

            for (int j = 0; j < col; j++) {
                // for column
                if(board[i][j]!='.') {
                    char c = board[i][j];
                    if(ch.add(c)){
                    }
                    else {
                       isvalid=false;
                       break;
                    }
                }

                if(board[j][i]!='.') {
                    char c = board[j][i];
                    if(ch2.add(c)){
                    }
                    else {
                        isvalid=false;
                        break;
                    }
                }
            }
            }


        // this code is to travel box elements
        for ( row = 0 ; row < 9; row = row + 3) {
            for ( col = 0; col < 9; col = col + 3) {
                Set < Character > set = new HashSet <>();
                for (int r = row; r < row + 3; r++) {
                    for (int c = col; c < col + 3; c++) {
                         if (board[r][c] != '.') {
                            if (set.add(board[r][c]) == false) {
                                isvalid=false;
                                break;
                            }
                        }
                    }
                }
            }
        }

        return isvalid;

    }


}
