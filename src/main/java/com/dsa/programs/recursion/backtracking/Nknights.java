package com.dsa.programs.recursion.backtracking;

public class Nknights {
    public static void main(String[] args) {

        int n =3;
        boolean[][] board = new boolean[n][n];
        knightsol(board,0,0,2);

    }

    static void knightsol(boolean[][] board, int row , int col , int knight){

        if(knight==0){
            
            display(board);
            System.out.println();
            return;

        }
        
        if(row==board.length-1 && col == board.length){
            // this is boundry condition means we have reached end no where to go hence return
            return ;
        }

        if(col==board.length){
            // here we have reached the end column hence we now move to next row to place knights
            knightsol(board,row+1,0,knight);
            return;
        }

        if(issafe(board,row,col)){
            // here we place the knights as true and find all the possibilities then
            // again mark it to false for further recursion same as n queen
            board[row][col]=true;
            knightsol(board,row,col+1,knight-1);
            board[row][col]=false;

        }

        knightsol(board,row,col+1,knight);

    }

    private static boolean issafe(boolean[][] board, int row, int col) {

        if(isvalid(board,row-2,col-1)){

            if(board[row-2][col-1]){

                return false;
            }

        }



        if(isvalid(board,row-2,col+1)){

            if(board[row-2][col+1]){

                return false;
            }

        }


        if(isvalid(board,row-1,col+2)){

            if(board[row-1][col+2]){

                return false;
            }

        }


        if(isvalid(board,row-1,col-2)){

            if(board[row-1][col-2]){

                return false;
            }

        }

        return true;

    }

    private static boolean isvalid(boolean[][] board, int row, int col) {

        if(row>=0 && row<board.length && col>=0 && col< board.length){
            return true;
        }

        return false;

    }

    private static void display(boolean[][] board) {

        for (boolean[] arr : board) {

            for (boolean i : arr) {

                // if true means queen is present hence print Q
                if (i) {
                    System.out.print("K ");
                } else
                    System.out.print("X ");

            }
            System.out.println();
        }

    }
}
