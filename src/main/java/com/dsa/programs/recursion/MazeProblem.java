package com.dsa.programs.recursion;

import java.util.ArrayList;

public class MazeProblem {

	public static void main(String[] args) {

		int r = 3, c = 3; 

//		System.out.println(maze(r, c));
//		mazePath("", r, c);
//		System.out.println(mazePathList("", r, c));
//		System.out.println(mazePathDiagonal("", r, c));
		boolean[][] arr = { { true, true, true }, { true, false, true }, { true, true, true } };
 		mazewithobstacle("", arr, 0, 0);

	}

	// counting path
	private static int maze(int r, int c) {

		if (r == 1 || c == 1) {
			return 1;
		}

		int left = maze(r - 1, c);
		int right = maze(r, c - 1);

		return left + right;
	}

	// maze path
	private static void mazePath(String p, int r, int c) {

		// here the base condition is that when both the column and row is 1 means yuou
		// have reached the goal
		if (r == 1 && c == 1) {
			System.out.println(p);
			return;
		}

		if (r > 0)
			mazePath(p + 'D', r - 1, c);

		if (c > 0)
			mazePath(p + 'R', r, c - 1);

	}

	// maze path with List
	private static ArrayList<String> mazePathList(String p, int r, int c) {

		// here the base condition is that when both the column and row is 1 means yuou
		// have reached the goal
		if (r == 1 && c == 1) {
			ArrayList<String> arr = new ArrayList<>();
			arr.add(p);
			return arr;
		}

		ArrayList<String> arrlist = new ArrayList<>();
		if (r > 1)
			arrlist.addAll(mazePathList(p + 'D', r - 1, c));

		if (c > 1)
			arrlist.addAll(mazePathList(p + 'R', r, c - 1));

		return arrlist;
	}

	private static ArrayList<String> mazePathDiagonal(String p, int r, int c) {

		// here the base condition is that when both the column and row is 1 means yuou
		// have reached the goal
		if (r == 1 && c == 1) {
			ArrayList<String> arr = new ArrayList<>();
			arr.add(p);
			return arr;
		}

		ArrayList<String> arrlist = new ArrayList<>();

		if (r > 1 && c > 1) {
			arrlist.addAll(mazePathDiagonal(p + 'D', r - 1, c - 1));
		}

		if (r > 1) {
			arrlist.addAll(mazePathDiagonal(p + 'V', r - 1, c));
		}

		if (c > 1) {
			arrlist.addAll(mazePathDiagonal(p + 'R', r, c - 1));
		}

		return arrlist;
	}

	// maze with 1 value to be false
	private static void mazewithobstacle(String p, boolean[][] maze, int r, int c) {

		// here the base condition is that when both the column and row is 1 means yuou
		// have reached the goal
		if (r == maze.length - 1 && c == maze[0].length - 1) {
			System.out.println(p);

			return;
		}

		if (!maze[r][c]) {
			return;
		}

		if (r < maze.length - 1) {
			mazewithobstacle(p + 'D', maze, r + 1, c);
		}

		if (c < maze[0].length - 1) {
			mazewithobstacle(p + 'R', maze, r, c + 1);
		}

	}

}
