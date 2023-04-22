package com.dsa.programs.recursion.assignment;

public class RemoveConsecutiveDuplicate {

	public static void main(String[] args) {

		String s = "geeksforgeeks";
		System.out.println(removeConsecutiveDuplicates(s));

	}

	public static String removeConsecutiveDuplicates(String input) {
		if (input.length() <= 1) {
			System.out.println(input);
			return input;
		}
		if (input.charAt(0) == input.charAt(1)) {
			System.out.println(input);
			// this is to remove the duplicate values
			return removeConsecutiveDuplicates(input.substring(1));
		} else {
			System.out.println(input);
			// this is to seperate each character and add them to become string
			return input.charAt(0) + removeConsecutiveDuplicates(input.substring(1));
		}
	}

}
