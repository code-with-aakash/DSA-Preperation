package com.dsa.programs.recursion;

public class JosephusProblem {

	public static void main(String[] args) {

		// There are n people standing in a circle waiting to be executed. The counting
		// out begins at some point in the circle and proceeds around the circle in a
		// fixed direction. In each step, a certain number of people are skipped and the
		// next person is executed. The elimination proceeds around the circle (which is
		// becoming smaller and smaller as the executed people are removed), until only
		// the last person remains, who is given freedom. Given the total number of
		// persons n and a number k which indicates that k-1 persons are skipped and kth
		// person is killed in a circle. The task is to choose the place in the initial
		// circle so that you are the last one remaining and so survive.

		int n = 5, k = 3;
		System.out.println(jos(n, k));

	}

	private static int jos(int n, int k) {

		// the base case is that when there is only one person left then our answer will
		// be zero

		if (n == 1) {
			return 0;
		} else
			// here we divide values by n as at one position our circle will get bigger than
			// n
			return (jos(n - 1, k) + k) % n;

	}

}
