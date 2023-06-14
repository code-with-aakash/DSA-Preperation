package com.dsa.programs.array;

public class MissingNumberInArray {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 5 };
		int n = 6;
		System.out.println("length of array is " + n);

		printArray(arr);

		int number = MissingNumberInArray(arr, n);

		System.out.println("Missing Number Is-->" + number);

	}

	private static int MissingNumberInArray() {
		return MissingNumberInArray(null, 0);
	}

	private static int MissingNumberInArray(int[] arr, int n) {

		int sum = n * (n + 1) / 2;

		System.out.println("sum is-- " + sum);

		for (int num : arr) {
			sum = sum - num;
		}

		return sum;
	}

	private static void printArray(int[] arr) {
		// TODO Auto-generated method stub

		for (int i : arr) {
			System.out.print(" " + i);
		}
		System.out.println();

	}

}
