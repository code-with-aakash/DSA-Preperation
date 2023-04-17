package com.dsa.programs.recursion;

public class Sumofdigitsofnumber {

	public static void main(String[] args) {

		int n = 99999;

		int x = sumofdigits(n);

		System.out.println(x);
	}

	private static int sumofdigits(int n) {

		if (n == 0)
			return 0;

		return 1 + sumofdigits(n / 10);
	}

}
