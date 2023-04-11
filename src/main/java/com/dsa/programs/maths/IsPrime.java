package com.dsa.programs.maths;

import java.util.Scanner;

public class IsPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter ur no");

		int n = sc.nextInt();

		if (n == 0 || n == 1) {
			System.out.println("not prime no ");
		}

		boolean b = primeNo(n);

		System.out.println("prime is " + b);

	}

	private static boolean primeNo(int n) {
		for (int i = 2; i * i <= n; i++) {

			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}

}
