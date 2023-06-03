package com.dsa.programs.sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NumbersDisappeardInArray {

	public static void main(String[] args) {

		int[] arr = { 4,3,2,7,8,2,3,1};
		System.out.println(cyclic(arr));

	}

	static List<Integer> cyclic(int[] arr) {

		int i = 0;
		List<Integer> ls = new ArrayList<>();

		while (i >= 0 && i < arr.length) {

			int index = arr[i] - 1;

			if (arr[index] != arr[i]) {
				swap(arr, index, i);

			} else {
				i++;
			}

		}
		System.out.println(Arrays.toString(arr));

		for (int j = 0; j < arr.length; j++) {

			if (j + 1 != arr[j]) {
				ls.add(arr[j]);
			}

		}

		return ls;
	}

	static void swap(int[] arr, int x, int y) {

		int t = arr[x];
		arr[x] = arr[y];
		arr[y] = t;

	}

}
