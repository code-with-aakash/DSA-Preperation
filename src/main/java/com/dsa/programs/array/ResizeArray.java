package com.dsa.programs.array;

public class ResizeArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 8, 1, 0, 2, 1, 0, 3 };

		printArray(arr);

		int[] arr2 = resizeArray(arr, arr.length * 2);

		printArray(arr2);

	}

	private static int[] resizeArray(int[] arr, int capacity) {
		// TODO Auto-generated method stub

		int[] temp = new int[capacity];

		for (int i = 0; i < arr.length; i++) {

			temp[i] = arr[i];

		}

		return temp;
	}

	private static void printArray(int[] arr) {
		// TODO Auto-generated method stub

		for (int i = 0; i < arr.length; i++) {
			System.out.print(" " + arr[i]);
		}
		System.out.println();

	}

}
