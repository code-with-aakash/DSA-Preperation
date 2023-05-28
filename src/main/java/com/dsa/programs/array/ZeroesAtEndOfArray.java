package com.java.basic.programs.array;

public class ZeroesAtEndOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 1, 1, 0, 0, 2, 0, 3, 0, 1, 0, 5, -2, -1 };
//		int[] arr = { 8,1,0,2,1,0,3 };

		printArray(arr);

		int[] arr2 = ZeroesAtOneSideOfArray(arr);

		printArray(arr2);

	}

	private static int[] ZeroesAtOneSideOfArray(int[] arr) {

		int j = 0;

		for (int i = 0; i < arr.length; i++) {

			// swapping of zero value with non zero value in array
			if (arr[i] != 0 && arr[j] == 0) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}

			// incrementing value of j if it is non zero to traverse further
			System.out.print("i" + i + "---j" + j + "------");
			System.out.print("arr[i]" + arr[i] + "---arr[j]" + arr[j] + "------");

			if (arr[j] != 0) {
				j++;
			}

			printArray(arr);
		}

		return arr;
	}

	private static void printArray(int[] arr) {
		// TODO Auto-generated method stub

		for (int i = 0; i < arr.length; i++) {
			System.out.print(" " + arr[i]);
		}
		System.out.println();

	}

}
