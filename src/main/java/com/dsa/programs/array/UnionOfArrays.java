package com.java.basic.programs.array;

public class UnionOfArrays {

	public static void main(String[] args) {

		int[] a = { 1, 2, 3, 4, 5 };
		int[] b = { 1, 2, 3 };

		int j = 0;

		int k = a.length + b.length;
		int[] arr = new int[k];

		for (int i = 0; i < a.length; i++) {

			arr[j++] = a[i];
		}
		for (int i = 0; i < b.length; i++) {

			arr[j++] = b[i];
		}

		printArray(arr);

		int count = 0;
		for (int l = 0; l < k - 1; l++) {
			for (int x = 0; x < k - 1; x++) {
				if (arr[l] == arr[x]) {

					count++;
				}
			}
		}

		System.out.println(k);

	}

	private static void printArray(int[] arr) {
		// TODO Auto-generated method stub

		for (int i = 0; i < arr.length; i++) {
			System.out.print(" " + arr[i]);
		}
		System.out.println();

	}

}
