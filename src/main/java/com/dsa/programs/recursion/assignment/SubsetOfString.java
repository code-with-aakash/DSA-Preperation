package com.dsa.programs.recursion.assignment;

public class SubsetOfString {

	public static void main(String[] args) {

		String str = "ABC";
		int i = 0;
		String curr = "";
		subset(str, curr, i);
	}

	private static void subset(String str, String curr, int i) {

		if (i == str.length()) {
			System.out.println(curr);
			return;
		}

		subset(str, curr + str.charAt(i), i + 1);
		subset(str, curr, i + 1);

	}

}
