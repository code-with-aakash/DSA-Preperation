package com.dsa.programs.recursion.backtracking;

import java.util.Arrays;

public class TraverseMazeInallDirectionWithPath {

	public static void main(String[] args) {

		// thought process is make the changes and revert the changes after its use
		boolean[][] arr = { { true, true, true }, { true, true, true }, { true, true, true } };
		int[][] path = new int[arr.length][arr[0].length];
		int step = 1;
		mazewithPath("", arr, path, 0, 0, step);

	}

	private static void mazewithPath(String p, boolean[][] maze, int[][] path, int r, int c, int step) {

		// here the base condition is that when both the column and row is 1 means yuou
		// have reached the goal

		if (r == maze.length - 1 && c == maze[0].length - 1) {
			System.out.println(p);
			// as this is our base condition so the last step will not enter in the array
			// hence we have added this statement to add last step in array
			path[r][c] = step;
			for (int[] ar : path) {

				System.out.println(Arrays.toString(ar));
			}

			System.out.println();
			return;
		}

		if (!maze[r][c]) {
			return;
		}

		// here we mark the columns visited by recursion call as false so that next one
		// does not take this path
		maze[r][c] = false;
		path[r][c] = step;

		if (c > 0) {
			mazewithPath(p + 'L', maze, path, r, c - 1, step + 1);
		}

		if (r > 0) {
			mazewithPath(p + 'U', maze, path, r - 1, c, step + 1);
		}

		if (r < maze.length - 1) {
			mazewithPath(p + 'D', maze, path, r + 1, c, step + 1);
		}

		if (c < maze[0].length - 1) {
			mazewithPath(p + 'R', maze, path, r, c + 1, step + 1);
		}

		// here recursion is returned back to function
		// so here we mark them as true so that it can be taken by new recursive call
		// for different path

		maze[r][c] = true;
		path[r][c] = 0;

	}

}
