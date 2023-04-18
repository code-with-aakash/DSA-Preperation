package com.dsa.programs.maths;

public class TermOfGP {

	public static void main(String[] args) {

		// Your code here
		// formula is ar^n-1
		int A = 84, B = 87, N = 3;

		double r = (double )B / A ;

		System.out.println(r);

		double sum = 1;

		for (int i = 1; i <= N - 1; i++) {

			sum=sum* r;
		}
		double n = A * sum;

		System.out.println(n);

	}

}
