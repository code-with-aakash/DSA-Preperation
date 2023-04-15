package com.dsa.programs.bitmagic;

import java.util.ArrayList;

public class DivideIntegers {

	public static void main(String[] args) {

		int A = 8;
		int B = 2;

		int x = divide(A, B);

		System.out.println(x);

	}

	private static int divide(int A, int B) {
		if (A == Integer.MIN_VALUE && B == -1)
			return Integer.MAX_VALUE;

		if (A == Integer.MIN_VALUE && B == 1)
			return Integer.MIN_VALUE;

		long dd = (long) A;
		int dv = B;
		int res = 0;
		while (dv <= dd) {
			long sum = dv, count = 1;

			while (sum <= dd - sum) {
				sum += sum;
				count += count;
			}
			res += count;
			dd -= sum;

		}
		return res;
	}

}
