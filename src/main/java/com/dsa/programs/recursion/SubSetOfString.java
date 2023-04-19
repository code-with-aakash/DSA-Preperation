package com.dsa.programs.recursion;

public class SubSetOfString {

	public static void main(String[] args) {

		String s = "ABC";

		String curr = "";
		int i = 0;

		subsets(s, curr, i);

	}

	private static void subsets(String s, String curr, int i) {

		if (i == s.length()) {
			System.out.println(curr);
			return;
		}

		// here we include element 
		subsets(s, curr, i + 1);
		
		// here we dont include element
		subsets(s, curr + s.charAt(i), i + 1);

	}

}
