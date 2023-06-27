package com.dsa.programs.recursion.assignment;

public class LengthUsingRecursion {

	public static void main(String[] args) {

		 String str = "abcd";
		 
		 int length =lengthofString(str);
		 System.out.println(length);
		
	}

	private static int lengthofString(String str) {

		if(str.isEmpty())
			return 0;
		else {
			return 1 + lengthofString(str.substring(1));
		}
		
	}

}
