package com.dsa.programs.bitmagic;

public class PowerOfTwo {

	public static void main(String[] args) {

		Long n = 549755813888L;
		/*
		 * // As we know that the number which will be the power of two have only one
		 * set bit , therefore when we do bitwise AND with the number which is just less
		 * than the number which can be represented as the power of (2) then the result
		 * will be 0 .
		 * 
		 * Example : 4 can be represented as (2^2 ) , (4 & 3)=0 or in binary (100 &
		 * 011=0)
		 * 
		 */

		if ((n != 0) && ((n & (n - 1)) == 0)) {

			System.out.println("true");

		}

	}

}
