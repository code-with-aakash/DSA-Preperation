package com.dsa.programs.recursion.assignment.stringandsubsets;

import java.util.ArrayList;

public class DiceCombination {

	public static void main(String[] args) {

		// no of possibility to get 4 on dice
		int d = 4;
		System.out.println(dice("", d));
	}

	private static ArrayList<String> dice(String p, int up) {

		if (up == 0) {
			// here if target is empty means we have found our answer and we print it
			// System.out.println(p);
			ArrayList<String> arr = new ArrayList<String>();
			arr.add(p);
			return arr;
		}
		ArrayList<String> outerList = new ArrayList<String>();

		for (int i = 1; i < 6 && i <= up; i++) {

			// here we are decreasing value from target up by 1
			outerList.addAll(dice(p + i, up - i));

		}
		return outerList;

	}

}
