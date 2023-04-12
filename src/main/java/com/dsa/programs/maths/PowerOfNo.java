package com.dsa.programs.maths;

public class PowerOfNo {

	public static void main(String[] args) {

		int x = 2;
		int n = 4;
		int sqr = pwer(x, n);
		System.out.println(sqr);

	}

	static int pwer(int x, int n) {

		if (n == 0) {
			return 1;
		}

		int pw = pwer(x, n / 2);

		pw = pw * pw;

		if (n % 2 == 0) {

			return pw;
		} else
			return pw * x;

	}

}
