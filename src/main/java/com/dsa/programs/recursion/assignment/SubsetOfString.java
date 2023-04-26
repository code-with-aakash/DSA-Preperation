package com.dsa.programs.recursion.assignment;

public class SubsetOfString {

	public static void main(String[] args) {

		String str = "ABC";
		int i = 0;
		String curr = "";
		subset(str, curr, i);
	}

	private static void subset(String str, String curr, int i) {

		// here the base condition is if length of the string is equal to the i we print
		// the element
		if (i == str.length()) {
			System.out.println(curr);
			return;
		}

		// here in this recursive call we dont take the leter that is here we dont
		// include the parameter
		// so in first recursive call the o/p will w=be blank i.e. ""
		// so in second recursive call the o/p will w=be blank i.e. "" and B and like
		// this it wil proceed
		subset(str, curr, i + 1);
 
		// here the idea is in first recursive call we take the letter i.e . here we
		// include the pareameter
		// so in first recursive call the o/p will w=be A
		// so in first recursive call the o/p will w=be A , AB and like this it will
		// proceed
		subset(str, curr + str.charAt(i), i + 1);

	}

}
