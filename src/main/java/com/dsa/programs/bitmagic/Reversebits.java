package com.dsa.programs.bitmagic;

public class Reversebits {

	public static void main(String[] args) {

		long a = 12;
		long result = 0;
		// the idea here is we move the every bit to 32 times so that it gets reverse .
		for (int i = 0; i <= 31; i++) {

			long lsb = (a & 1);
			long ls = (lsb << (31 - i));
			result = result | ls;
			a = (a >> 1);
		}
		System.out.println(result);

	}

}
