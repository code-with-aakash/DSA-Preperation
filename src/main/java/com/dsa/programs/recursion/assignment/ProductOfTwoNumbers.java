package com.dsa.programs.recursion.assignment;

public class ProductOfTwoNumbers {

	public static void main(String[] args) {

		int x = 5, y = 10;

		int prd = product(x, y);
		System.out.println(prd);

	}

	private static int product(int x, int y) {

		if (y == 0)
			return 0;

		return x + product(x, y - 1);

	}
}
