package com.dsa.programs.maths.assignment;

public class NewtonSqrtMethod {

	public static void main(String[] args) {

		int n = 25;

		System.out.println(newtonsqrt(n));

	}

	private static double newtonsqrt(int n) {

		double x = n;
		double root = 0;

		while (true) {

			root = 0.5 * (x + n / x);
			if (Math.abs(x - root) < 0.5) {
				break;
			}
			x = root;

		}
		return root;


	}

}
