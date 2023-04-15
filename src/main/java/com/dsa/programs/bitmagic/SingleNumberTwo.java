package com.dsa.programs.bitmagic;

public class SingleNumberTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		here the idea is ones store elements which appears one time 
//		two store elements which store two times , 
//		and elements which appear three times are not stored .
//		ones = 0 twos =0 
//		1 st iteration=======
//		ones ^ A[0] = 00 ^ 10 = 10 & ~(twos) = 10 & 11 = 10 = 2 
//		twos ^ A[0] = 00 ^ 10 = 10 & ~(ones) = 10 & 00 = 00 = 0
//		2nd iteration ==================
//		ones ^ A[1] = 10 ^ 10 = 00 & ~(twos) = 00 & 11 = 00 = 0
//		twos ^ A[1] = 00 ^ 10 = 10 & ~(ones) = 10 & 11 = 10 = 2
//		3nd iteration ==================
//		ones ^ A[2] = 00 ^ 11 = 11 & ~(twos) = 11 & 01 = 01 = 1
//		twos ^ A[2] = 10 ^ 11 = 01 & ~(ones) = 01 & 10 = 00 = 0
//		4 th iteration ==================
//		ones ^ A[3] = 01^ 10 = 11 & ~(twos) = 11 & 11 = 11 = 3
//		twos ^ A[3] = 00 ^ 11 = 00 & ~(ones) = 00 & 00 = 00 = 0
//
//		hence now ones are 2 only 

		int ones = 0;
		int twos = 0;

		int[] A = { 2, 2, 2, 3 };

		for (int i = 0; i < A.length; i++) {

			ones = (ones ^ A[i]) & (~twos);
			twos = (twos ^ A[i]) & (~ones);
		}

		System.out.println("ones are " + ones);
	}

}
