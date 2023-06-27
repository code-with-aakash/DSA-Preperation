package com.dsa.programs.recursion.assignment;

public class FirstCapitalLetter {

	public static void main(String[] args) {

		String s = "geeksForgeek";
		
		firstcapital(s);
		
	}

	private static void firstcapital(String s) {

		for (int i = 0; i < s.length(); i++) {

			if(s.charAt(i)>='A' && s.charAt(i)<='Z'){
				System.out.println(i);
			}

		}
		
		
		
	}

}
