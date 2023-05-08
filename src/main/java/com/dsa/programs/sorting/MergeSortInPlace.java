package com.dsa.programs.sorting;

import java.util.Arrays;

public class MergeSortInPlace {

	public static void main(String[] args) {

		int[] arr = { 5, 4, 3, 2, 1, 25, 54, 87 };
		mergesort(arr, 0, arr.length);
		System.out.println(Arrays.toString(arr));

	}

	static void mergesort(int[] arr, int start, int end) {

		if (end - start == 1) {
			return;
		}

		int mid = (start + end) / 2;

		mergesort(arr, start, mid);
		mergesort(arr, mid, end);

		merge(arr, start, mid, end);

	}

	private static int[] merge(int[] arr, int start, int mid, int end) {

		// as the start and end are getting updated everytime hence the length will be
		// end-start as 5-0 = 5 
		int[] mix = new int[end - start];
		int i = start;
		int j = mid;
		int k = 0;

		// sort among two arrays
		while (i < mid && j < end) {

			if (arr[i] < arr[j]) {
				mix[k] = arr[i];
				i++;
				k++;

			} else {
				mix[k] = arr[j];
				j++;
				k++;
			}

		}

		// left array remaining element copy

		while (i < mid) {

			mix[k] = arr[i];
			i++;
			k++;

		}
		// right array remaining element copy

		while (j < end) {

			mix[k] = arr[j];
			j++;
			k++;

		}

		// to copy only the part array here not the entire array .
		for (int l = 0; l < mix.length; l++) {
			arr[start + l] = mix[l];
		}

		return arr;
	}

}
