package com.dsa.programs.sorting;

public class MissingNumber {

	public static void main(String[] args) {

		int[] arr = { 3,4,0,1 };
		System.out.println(cyclic(arr));

	}

	static int cyclic(int[] arr) {

		int i = 0;

		while (i < arr.length) {

			int index = arr[i];

			if (arr[i] < arr.length && arr[index] != arr[i]) {
				swap(arr, index, i);

			} else {
				i++;
			}

		}

		for (int j = 0; j < arr.length; j++) {

			if (j != arr[j]) {
				return j;
			}

		}

		return arr.length;
	}

	static void swap(int[] arr, int x, int y) {

		int t = arr[x];
		arr[x] = arr[y];
		arr[y] = t;

	}

}
