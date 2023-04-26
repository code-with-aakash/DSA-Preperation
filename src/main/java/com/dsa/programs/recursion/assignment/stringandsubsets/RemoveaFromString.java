package com.dsa.programs.recursion.assignment.stringandsubsets;

public class RemoveaFromString {

	public static void main(String[] args) {

		String s = "aabbacaf";
		int i = 0;
		String str = "";
		System.out.println(removea(s, i, str));

	}

	private static String removea(String s, int i, String str) {

		if (i == s.length()) {
			return str;
		}

		if (s.charAt(i) != 'a') {
			str = str + s.charAt(i);
			return removea(s, i + 1, str);
		} 

		return removea(s, i + 1, str);

	}

}
