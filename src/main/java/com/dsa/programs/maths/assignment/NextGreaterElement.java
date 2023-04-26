package com.dsa.programs.maths.assignment;

public class NextGreaterElement {

	public static void main(String[] args) {

		int n = 229;

		nextElement(n);

	}

	private static void nextElement(int n) {

		int rev = 0;
		int local = n;
		while (local > 0) {

			rev = rev * 10 + local % 10;
			local = local / 10;

		}
		if (rev > n) {
			System.out.println("true");
		} else {
			System.out.println("-1");
		}

		System.out.println(Math.abs(local - n));

	}

}
