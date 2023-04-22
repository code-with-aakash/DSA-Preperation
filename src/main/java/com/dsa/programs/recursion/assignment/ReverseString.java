package com.dsa.programs.recursion.assignment;

public class ReverseString {

	public static void main(String[] args) {

		String s[] = { "h", "e", "l", "l", "o" };
		String s2[] = new String[s.length];

		int i = 0, e = s.length;
		reverse(s, i, e - 1);

		// using array reverse 
//		int j = 0;
//		for (int i = s.length - 1; i >= 0; i--) {
//
//			s2[j] = s[i];
//			j++;
//
//		}

		System.out.println(s2);

		// TODO Auto-generated method stub
		for (String k : s) {
			System.out.print(" " + k);
		}

	}

	//using recursion
	private static void reverse(String[] s, int i, int e) {
		// TODO Auto-generated method stub

		if (i > e)
			return;
		s = swap(s, i, e);

		reverse(s, i + 1, e - 1);
	}

	private static String[] swap(String[] s, int i, int e) {
		String temp = "";

		temp = s[i];
		s[i] = s[e];
		s[e] = temp;

		return s;

	}

}
