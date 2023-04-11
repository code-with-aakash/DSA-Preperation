package com.dsa.programs.maths;

public class DivisorOfNumber {

	public static void main(String[] args) {

		int n = 15;
		int i = 1;

		// this loop print from i 1 to root of n

		for (i = 1; i * i <= n; i++) {

			if (n % i == 0) {

				System.out.println(i);

			}
		}

//		this loop print root n to n 
		for (; i >= 1; i--) {
			if (n % i == 0)
				System.out.print(n / i + " ");
		}

	}
}
