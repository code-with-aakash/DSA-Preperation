package com.dsa.programs.recursion.assignment;

public class TocheckArrayIssortedOrNot {

	public static void main(String[] args) {

		int arr[] = { 1, 2, 3, 6, 4, 4, 4, 5 };
		int i = 0;
		boolean issort = true;
		issort = arraysort(arr, i);
		System.out.println(issort);

	}

	private static boolean arraysort(int[] arr, int i) {

		if (i == arr.length - 1) {
			return true;
		}

		if (i < arr.length && arr[i] > arr[i + 1])
			return false;
		else

			return arraysort(arr, i + 1);

	}

}
