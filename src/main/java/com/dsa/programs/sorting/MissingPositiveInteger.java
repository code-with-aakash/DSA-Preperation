package com.dsa.programs.sorting;

public class MissingPositiveInteger {

	public static void main(String[] args) {
		int[] arr = { 2147483647, 2147483646, 2147483645, 3, 2, 1, -1, 0, -2147483648 };
		System.out.println(cyclic(arr));
	}

	static int cyclic(int[] arr) {

		int i = 0;

		while (i < arr.length) {

			if (arr[i] > 0 && arr[i] < arr.length && arr[i] != arr[arr[i] - 1]) {
				swap(arr, arr[i] - 1, i);

			} else {
				i++;
			}

		}

		for (int j = 0; j < arr.length; j++) {

			if (j + 1 != arr[j]) {
				return j + 1;
			}
		}

		return arr.length + 1;
	}

	static void swap(int[] arr, int x, int y) {

		int t = arr[x];
		arr[x] = arr[y];
		arr[y] = t;

	}

}
