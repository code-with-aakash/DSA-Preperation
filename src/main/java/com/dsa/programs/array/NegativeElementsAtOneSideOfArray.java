package com.dsa.programs.array;

public class NegativeElementsAtOneSideOfArray {

	public static void main(String[] args) {

		int[] arr = { 1, 2, -1, -4, -3, 5, -8 };
		
		printArray(arr);

		int arr2[] =negativeElementsAtOneSideOfArray(arr, arr.length);

		printArray(arr2);

	}

	private static void printArray(int[] arr) {
		// TODO Auto-generated method stub

		for (int i = 0; i < arr.length; i++) {
			System.out.print(" " + arr[i]);
		}
		System.out.println();

	}

	private static int[] negativeElementsAtOneSideOfArray(int[] arr, int n) {// Your code goes here

		int[] a = new int[n];

		int j = 0;

		for (int i = 0; i < n; i++) {

			if (arr[i] >= 0)

				a[j++] = arr[i];

		}

		for (int i = 0; i < n; i++) {

			if (arr[i] < 0)

				a[j++] = arr[i];

		}

		arr = a;
		
		return arr;

	}
}
