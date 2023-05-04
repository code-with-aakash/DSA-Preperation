package com.dsa.programs.recursion.assignment;

public class Sumtrianglefromarray {

	public static void main(String[] args) {

		int[] A = { 1, 2, 3, 4, 5 };
		int n = 5;
		int i = n ;

		sumTraingle(A, n, i);

	}

	private static void sumTraingle(int[] a, int n, int i) {

		if (i == 0) {

			System.out.println("last element is >>"+a[i]);
			return;


		}

		for (int j =0 ; j<i-1;j++){

			a[j]=a[j]+a[j+1];
		}


		 sumTraingle(a, n, i-1);

	}

}
