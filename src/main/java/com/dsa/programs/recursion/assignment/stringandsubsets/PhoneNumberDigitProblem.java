package com.dsa.programs.recursion.assignment.stringandsubsets;

import java.util.ArrayList;

public class PhoneNumberDigitProblem {

	public static void main(String[] args) {

		String up = "8";

		System.out.println(pemutationofdigits("", up));

	}

	private static ArrayList<String> pemutationofdigits(String p, String up) {

		ArrayList<String> outerlist = new ArrayList<String>();

		if (up.isEmpty()) {
			ArrayList<String> ar = new ArrayList<String>();
			ar.add(p);
			return ar;
		}

		int digit = up.charAt(0) - '0'; // this will convert string to integer like '2' to 2

		if (digit == 7 || digit == 9) {

			for (int i = (digit - 2) * 3; i <= ((digit - 1) * 3); i++) {

				char ch = (char) ('a' + i);

				outerlist.addAll(pemutationofdigits(p + ch, up.substring(1)));

			}

		}

		else for (int i = (digit - 2) * 3; i < ((digit - 1) * 3); i++) {

			char ch = (char) ('a' + i);

			outerlist.addAll(pemutationofdigits(p + ch, up.substring(1)));

		}
		return outerlist;

	}

}
