package com.dsa.programs.recursion;

public class SubSetOfString {

	public static void main(String[] args) {

		String s = "AB";

		int psize = (int) Math.pow(2, s.length());

		String curr = "";
		int i = 0;

		subsets(s, curr, i);

	}

	private static void subsets(String s, String curr, int i) {

		if (i == s.length()) {
			System.out.println(curr);
			return;
		}

		subsets(s, curr, i + 1);
		subsets(s, curr + s.charAt(i), i + 1);

	}

}
