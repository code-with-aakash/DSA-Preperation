package com.java.basic.programs.array;

public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {  11, 5, 10, 7, 8 };

		int index = 0;
		int end = arr.length - 1;

		printarray(arr);
		System.out.println();
		
		int [] arr2 =reverseArray(arr, index, end);

		printarray(arr2);

	}

	private static void printarray(int[] arr) {
		// TODO Auto-generated method stub

		for (int i = 0; i < arr.length; i++) {
			System.out.print(" " + arr[i]);
		}

	}

	private static int[] reverseArray(int[] arr, int index, int end) {
		//

		while (index < end) {

			int temp = 0;
			temp = arr[index];
			arr[index] = arr[end];
			arr[end] = temp;

			index++;
			end--;

		}
		return arr;

	}
}
