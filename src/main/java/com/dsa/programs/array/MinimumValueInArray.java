package com.dsa.programs.array;

public class MinimumValueInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 2, 4, 5, 12, 23, 43, 11, 10 };

		printArray(arr);

		int min = minimumValue(arr);

		System.out.println("minimum value in array is " + min);

	}

	private static int minimumValue(int[] arr) {
		// TODO Auto-generated method stub

		int min = arr[0];

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] < min) {
				min = arr[i];
			}

		}

		return min;
	}

	private static void printArray(int[] arr) {
		// TODO Auto-generated method stub

		for (int i = 0; i < arr.length; i++) {
			System.out.print(" " + arr[i]);
		}
		System.out.println();

	}

}
