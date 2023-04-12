package com.dsa.programs.maths;

public class PrimeFactors {

	public static void main(String[] args) {

		int n = 23;

		primefact(n);

	}

	// time complexity big O( theta (rot of n )
	private static void primefact(int n) {
		if (n < 1) {
			System.out.println(" blank ");
		}

		while (n % 2 == 0) {

			// to check multiple of 2's like 4 , 8, 12
			System.out.println("2");
			n = n / 2;
		}

		while (n % 3 == 0) {
			// to remove multiple of 3 like 3 , 9 , 12 , 15, 18
			System.out.println("3");
			n = n / 3;
		}

		for (int i = 5; i * i <= n; i += 6) {

			while (n % i == 0) {
				// to check multiples of 5 , 11 , 17 etc
				System.out.println(" " + i + " ");
				n = n / i;
			}
			while (n % (i + 2) == 0) {
				// to check multiple of 7 , 13 , 19 like this
				System.out.println(" " + (i + 2) + " ");
				n = n / (i + 2);
			}

		}

		if (n > 3) {
			// as 2 and 3 are already handled above we need to check for greater than 3 if
			// occurs
			System.out.println(n);
		}

	}

}
