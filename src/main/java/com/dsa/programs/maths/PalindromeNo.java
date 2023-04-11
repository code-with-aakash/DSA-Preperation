package com.dsa.programs.maths;

public class PalindromeNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean n = false;

		int x = 121;
		
		

		boolean xyz = palin(x, n);

		System.out.println(xyz);

	}

	private static boolean palin(int x, boolean n) {
		if (x < 0) {
			n = false;
		}
		int val = x;
		int val2 = 0;

		while (val > 0) {

			val2 = val2 * 10 + val % 10;

			val = val / 10;
		}

		if (val == val2) {
			n = true;
		}

		return n;
	}

}
