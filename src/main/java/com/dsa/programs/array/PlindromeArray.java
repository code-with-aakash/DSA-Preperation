package com.java.basic.programs.array;

import java.util.Arrays;

public class PlindromeArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 111, 222, 333, 444, 555 };

		int ax = palindromearray(arr, arr.length);

		System.out.println(ax);

	}

	private static int palindromearray(int[] a, int n) {

		int count = 0;
		int[] abc = new int[n];
		{

			for (int i = 0; i < n; i++) {

				abc[i] = reverse(a[i]);

			}

		}

		if (Arrays.equals(abc, a)) {
			count = 1;
		} else {
			count = -1;
		}

		return count;

	}

	private static int reverse(int i) {

		int reverse = 0;
		int temp = i;
		while (temp != 0) {
			reverse = (reverse * 10) + (temp % 10);
			temp = temp / 10;
		}
		return reverse;

	}

}
