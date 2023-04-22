package com.dsa.programs.recursion.assignment;

public class Sumtrianglefromarray {

	public static void main(String[] args) {

		int[] A = { 1, 2, 3, 4, 5 };
		int n = 5;
		int i = n - 1;
		int curr = 0;
		sumTraingle(A, n, curr, i);

	}

	private static void sumTraingle(int[] a, int n, int curr, int i) {

		if (curr == 0) {
			
			System.out.println("no");

		}

		sumTraingle(a, n, a[i] + a[i - 1], i);

	}

}
