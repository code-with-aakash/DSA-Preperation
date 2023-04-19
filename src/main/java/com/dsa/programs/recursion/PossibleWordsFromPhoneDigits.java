package com.dsa.programs.recursion;

public class PossibleWordsFromPhoneDigits {

	public static void main(String[] args) {

		int N = 3;

		int a[] = { 2, 3, 4 };
//		String s = "ABC";

		int i = 0;
		String s = "ABCDEFGHI";

		perm(s, i, N);

	}

	private static void perm(String s, int i, int n) {

		// here the base case is that if length of string and counter i is same then we
		// print that value

		if (i == 2) {
			System.out.println(s);
			return;
		}

		for (int j = i; j < n; j++) {

			// here we are swapping char of string and returning the swapped value string
			// for next permutation

			s = swap(s, i, j);

			perm(s, i + 1, n);

			// here we are swapping char of string and returning the original string for
			// next perm

			s = swap(s, i, j);

		}

	}

	private static String swap(String s, int i, int j) {

		char[] str = s.toCharArray();
		char temp;
		temp = str[i];
		str[i] = str[j];
		str[j] = temp;
		return String.valueOf(str);

	}

}
