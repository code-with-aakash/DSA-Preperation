package com.dsa.programs.recursion.assignment.stringandsubsets;

public class PermutationOfString {

	public static void main(String[] args) {
		String s = "ABC";
		permutation("",s);

	}

	private static void permutation(String p, String up) {

		if (up.isEmpty()) {
			System.out.println(p);
			return;
		}

		char ch = up.charAt(0);
		for (int i = 0; i <= p.length(); i++) {

			String f = p.substring(0, i);
			String s = p.substring(i, p.length());
			permutation(f + ch + s, up.substring(1));
		}

	}

}
