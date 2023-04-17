package com.dsa.programs.maths;

public class PowerOfNo {

	public static void main(String[] args) {

		long x = 24;
		long n = 42;
		long sqr = pwer(x, n);
		System.out.println(sqr);

	}

	static long pwer(long x, long n) {

		if (n == 0) {
			return 1;
		}

		long pw = pwer(x, n / 2);

		pw = (pw * pw) % 1000000007;

		System.out.println(pw);

		if (n % 2 == 0) {

			return pw % 1000000007;
		} else
			return (pw * x) % 1000000007;

	}

}
