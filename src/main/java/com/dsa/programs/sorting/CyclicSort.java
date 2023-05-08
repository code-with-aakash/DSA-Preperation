package com.dsa.programs.sorting;

import java.util.Arrays;

public class CyclicSort {

	public static void main(String[] args) {

		int[] arr = { 3, 5, 2, 1, 4 };
		System.out.println(Arrays.toString(cyclic(arr)));

	}

	static int[] cyclic(int[] arr) {

		int i = 0;

		while (i >= 0 && i < arr.length) {

			int index = arr[i]-1;

			if (arr[index] != arr[i]) {
				swap(arr,index, i);

			} else {
				i++;
			}

		}
		return arr;
	}

	static void swap(int[] arr, int x, int y) {

		int t = arr[x];
		arr[x] = arr[y];
		arr[y] = t;

	}

}
