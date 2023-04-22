package com.dsa.programs.recursion.assignment;

public class BinarySearch {

	public static void main(String[] args) {

		int arr[] = { -1, 0, 3, 5, 9, 12 };
		int target = 99, s = 0, e = arr.length - 1;

		int index = binsearch(arr, target, s, e);

		System.out.println(index);
	}

	private static int binsearch(int[] arr, int target, int s, int e) {

		int m = (s + e) / 2;
		
		if(s>e)
			return -1;

		if (arr[m] == target) {

			return m;
		}

		if (arr[m] > target) {

			return binsearch(arr, target, s, m - 1);
		}

		return binsearch(arr, target, m + 1, e);

	}

}
