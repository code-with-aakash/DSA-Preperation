package com.dsa.programs.recursion.backtracking;

public class TraverseMazeInallDirection {

	public static void main(String[] args) {

		// thought process is make the changes and revert the changes after its use
		boolean[][] arr = { { true, true, true }, { true, true, true }, { true, true, true } };
		mazewithobstacle("", arr, 0, 0);
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

		// here we mark the columns visited by recursion call as false so that next one
		// does not take this path
		maze[r][c] = false;

		if (c > 0) {
			mazewithobstacle(p + 'L', maze, r, c - 1);
		}

		if (r > 0) {
			mazewithobstacle(p + 'U', maze, r - 1, c);
		}

		if (r < maze.length - 1) {
			mazewithobstacle(p + 'D', maze, r + 1, c);
		}

		if (c < maze[0].length - 1) {
			mazewithobstacle(p + 'R', maze, r, c + 1);
		}

		// here recursion is returned back to function
		// so here we mark them as true so that it can be taken by new recursive call
		// for different path

		maze[r][c] = true;

	}

}
