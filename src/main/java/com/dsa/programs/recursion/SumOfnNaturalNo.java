package com.dsa.programs.recursion;

public class SumOfnNaturalNo {

	public static void main(String[] args) {

		int n = 5;

		int sum = naturalnosum(n);

		System.out.println(sum);
	}

	private static int naturalnosum(int n) {

		if (n == 0)
			return 0;

		return n + naturalnosum(n - 1);

	}

}
