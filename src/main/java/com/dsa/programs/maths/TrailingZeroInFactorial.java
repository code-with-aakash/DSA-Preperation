package com.dsa.programs.maths;

public class TrailingZeroInFactorial {

	public static void main(String[] args) {

		/*
		 * here we are dividing the no directly not the factorial of no as factorial is
		 * 1*2*3*4*5*6*7*8*9*10*11... *n hence we are counting the no of 5 in this
		 * multiplication directly without calculating its factorial. as 5*2 =10 which
		 * is 1 zero but here 2 are multiples hence we need to calculate 5 only.
		 */

		int n = 100;
		int count = 0;

		/*
		 * Keep dividing n by powers of 5 and update count
		 */

		for (int i = 5; n / i >= 1; i *= 5)
			count += n / i;

		System.out.println(count);

	}

}
