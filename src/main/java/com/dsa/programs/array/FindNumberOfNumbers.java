package com.java.basic.programs.array;

public class FindNumberOfNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = { 1, 2, 3, 4, 4, 4,4444, 44 };

		int count = 0;
		char k = '4';

		for (int i = 0; i < a.length; i++) {

			String ab = String.valueOf(a[i]);

			for (int j = 0; j < ab.length(); j++) {
				if (ab.charAt(j) == k) {

					count++;

				}
			}

		}

		System.out.println(count);

	}

}
