package com.dsa.programs.recursion;

public class PrintNto1 {

	public static void main(String[] args) {

		int n = 5;

		fun(n);

	}

	private static void fun(int n) {

		if (n == 0)
			return;

		System.out.println(n);

		fun(n - 1);

	}

}
