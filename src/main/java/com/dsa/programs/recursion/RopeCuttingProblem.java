package com.dsa.programs.recursion;

public class RopeCuttingProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 23, a = 1, b = 9, c = 12;

		int x = cutRope(n, a, b, c);
		System.out.println(x);

	}

	// time complexity is O(3 ^n);
	private static int cutRope(int n, int a, int b, int c) {

		// here the base cases are if n-1 gives zero means we have found our solution as
		// there is nothing left to cut in rope
		// and if n-a is negative means we have cutted more than the length hence this
		// is not our answer
		if (n == 0)
			return 0;

		if (n < 0)
			return -1;

		// here the idea is we will take maximum of these three cases which will call
		// recursively for n-a,n-b,n-c and add 1 to it result as we are returning zero
		// even if we are getting the answer
		int res = Math.max(cutRope(n - a, a, b, c), Math.max(cutRope(n - b, a, b, c), cutRope(n - c, a, b, c)));

		if (res == -1)
			return -1;

		return res + 1;
	}

}
