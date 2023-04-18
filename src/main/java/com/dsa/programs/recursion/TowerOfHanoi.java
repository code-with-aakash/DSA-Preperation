package com.dsa.programs.recursion;

public class TowerOfHanoi {

	public static void main(String[] args) {

		// tower of hanoi is to move all discs from A to C
		int n = 3;

		toh(n, 'A', 'B', 'C');

	}

	private static void toh(int n, char A, char B, char C) {

		// the base case here is if there is only 1 disc then we can move directly from
		// A to C
		if (n == 1) {

			System.out.println("Move disk " + n + " from rod " + A + " To rod " + C);
			return;
		}

		// this part is to move disk for n-1 , from A to B and use C as auxillary space
		toh(n - 1, A, C, B);

		// here we move larger i.e last disc from A to C
		System.out.println("Move disk " + n + " from rod " + A + " To rod " + C);

		// this part is to move disk for n-1 , from B to C and use A as auxillary space
		toh(n - 1, B, A, C);

	}

}
