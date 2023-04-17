package com.dsa.programs.recursion;

public class PalindromeCheck {

	public static void main(String[] args) {

		String s = "abyrba";
		int start = 0;
		int end = s.length() - 1;

		System.out.println(ispalindrome(s, start, end));

	}

	private static boolean ispalindrome(String s, int start, int end) {

		// base case is if there is only 1 char left i.e start and end is equal then
		// return true as single char is palindrome only
		// if there is empty string then also return true
		if (start >= end) {
			return true;
		}

		// the idea here is to divide string into two parts and check if start and end
		// element is same then only go inside
		// now inside call recursively by dividing further the string and checking from
		// start +1 and end -1
		return (s.charAt(start) == s.charAt(end) && ispalindrome(s, start + 1, end - 1));
	}

}
