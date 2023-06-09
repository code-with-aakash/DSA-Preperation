package com.dsa.programs.recursion;

public class AllPermutation {

	public static void main(String[] args) {

		// the idea here is that first we fix starting letter of string and shift other
		// two letters and same goes for other values of string

		String s = "ABCD";
		
		int i = 0;

		perm(s, i);

	}

	private static void perm(String s, int i) {

		// here the base case is that if length of string and counter i is same then we
		// print that value

		if (i == s.length() - 1) {
			System.out.println(s);
			return;
		}

		for (int j = i; j < s.length(); j++) {

			// here we are swapping char of string and returning the swapped value string
			// for next permutation

			s = swap(s, i, j);

			perm(s, i + 1);

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
