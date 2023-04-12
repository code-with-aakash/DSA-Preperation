package com.dsa.programs.maths;

import java.util.Arrays;

public class SieveOfErothstheness {

	public static void main(String[] args) {

		int n = 10;

		boolean[] prime = new boolean[n + 1];
		Arrays.fill(prime, true);
		for (int p = 2; p * p <= n; p++) {
			// If prime[p] is not changed, then it is a
			// prime
			if (prime[p] == true) {
				// Update all multiples of p greater than or
				// equal to the square of it numbers which
				// are multiple of p and are less than p^2
				// are already been marked.
				for (int i = p * p; i <= n; i += p)
					prime[i] = false;
			}
		}

		// Print all prime numbers
		for (int i = 2; i <= n; i++) {
			if (prime[i] == true)
				System.out.print(i + " ");
		}

		System.out.println("Ending");
	}

}
