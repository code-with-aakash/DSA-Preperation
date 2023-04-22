package com.dsa.programs.recursion.assignment;

public class PowerOfThree {

	public static void main(String[] args) {

		int n = 27*3;
		System.out.println(pow(n));

	}

	static boolean pow(int n) {

		if (n == 0)
			return false;

		if (n == 1)
			return true;

		if (n > 1)
			return ((n % 3 == 0) && pow(n / 3));
		else
			return false;

	}

}
