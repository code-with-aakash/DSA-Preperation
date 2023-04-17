package com.dsa.programs.recursion;

public class PowerOfNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 2;
		int p = 10;

		int x = power(n, p);
		System.out.println(x);

	}

	private static int power(int n, int p) {

		if (p == 0) {
			return 1;
		}

		return n * power(n, p - 1);

	}

}
