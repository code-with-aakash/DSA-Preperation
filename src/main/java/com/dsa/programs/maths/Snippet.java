package com.dsa.programs.maths;

public class Snippet {
	
	public static void main(String[] args) {
		
		System.out.println(reverse(-1534236469));
	}
	
	 static int reverse(int x) {

		int max = (int) Math.pow(2, 31)-1;
		int min = Integer.MIN_VALUE;
		int sum = 0;

		int val = x;
		long val2 = 0;

		while (val != 0) {

			if (val2*10 >= max || val2*10<=min) {
				break;
			}
			val2 = val2 * 10 + val % 10;
			System.out.println(val2);
			

			val = val / 10;
		}

		return (int)val2;

	}
}
