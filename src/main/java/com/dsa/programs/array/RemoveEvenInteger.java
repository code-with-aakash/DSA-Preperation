package com.java.basic.programs.array;

public class RemoveEvenInteger {

	// remove even integer
	// A number is even if, when divided by two, the remainder is 0.
	// A number is odd if, when divided by 2, the remainder is 1

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 3, 2, 4, 7, 10, 6, 5 };
		System.out.print("Initial Array : ->");
		printarray(arr);

		System.out.println();
		
		int[] result = removeElement(arr);
		System.out.print("Array with only odd Integer: ->");
		printarray(result);

	}

	private static int[] removeElement(int[] arr) {

		// TODO Auto-generated method stub

		int j = 0;

		int count = 0;

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] % 2 != 0) {

				count++;

			}
		}

		int[] b = new int[count];

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] % 2 != 0) {

				b[j] = arr[i];
				j++;

			}

		}

		return b;

	}

	private static void printarray(int[] arr) {
		// TODO Auto-generated method stub

		for (int i = 0; i < arr.length; i++) {

			System.out.print(" " + arr[i]);

		}
		System.out.println();

	}

}
