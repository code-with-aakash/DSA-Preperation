package com.dsa.programs.bitmagic;

public class SparseNumber {

	public static void main(String[] args) {

		int n = 2;

		/*
		 * Given a number N. The task is to check whether it is sparse or not. A number
		 * is said to be a sparse number if no two or more consecutive bits are set in
		 * the binary representation.
		 */

		// the idea here is if n is sparse no then if we shift it by 1 bit and takes its
		// and we will get 0
		// as sparse no is not having consecutive ones ; so its left shift will also
		// give 1 shift bit and its & will give 0

		if ((n & (n << 1)) != 0)
			System.out.println(false);
		else
			System.out.println(true);
	}

}
