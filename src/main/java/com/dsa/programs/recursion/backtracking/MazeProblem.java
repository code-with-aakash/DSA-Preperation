package com.dsa.programs.recursion.backtracking;

public class MazeProblem {

	public static void main(String[] args) {
		
		int r =3,c=3;

		System.out.println(maze(r, c));

	}

	private static int maze(int r, int c) {

		if (r == 1 || c == 1) {
			return 1;
		}

		int left = maze(r-1, c);
		int right = maze(r, c-1);

		return left + right;
	}

}
