package com.dsa.programs.bitmagic;

import java.util.Arrays;

public class MinimumXOR {

	public static void main(String[] args) {

		int[] A = { 15, 5, 1, 10, 2  };

		int min = 0;
		Arrays.sort(A);
		for (int i = 0; i < A.length-1; i++) {
			min = A[i]^A[i+1];
			min = Math.min(A[i], min);

		}
		
		System.out.println(min);
	}

}
