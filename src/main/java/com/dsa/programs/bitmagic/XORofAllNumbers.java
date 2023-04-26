package com.dsa.programs.bitmagic;

public class XORofAllNumbers {

	public static void main(String[] args) {

		int n = 7;
		int sum = 0;

		for (int i = 2; i <= n; i++) {

			sum = sum ^ i;
		}

		System.out.println(sum);

		// better solution this is of different question

//		if (n % 4 == 0) {
//			System.out.println(n);
//		} else if (n % 4 == 1) {
//			System.out.println(1);
//		} else if (n % 4 == 2) {
//			System.out.println(n + 1);
//		} else if (n % 4 == 3) {
//			System.out.println(0);
//		}

	}

}
