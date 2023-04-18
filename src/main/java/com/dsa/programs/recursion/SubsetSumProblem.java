package com.dsa.programs.recursion;

public class SubsetSumProblem {

	public static void main(String[] args) {

		// to check if the given sum is subset sum of the array elements 
		int[] arr = { 10, 5, 2, 3, 6 };
		int n = 5, sum = 8;

		System.out.println(countSubsets(arr, n, sum));

	}

	static int countSubsets(int arr[], int n, int sum) {
		if (n == 0)
			return sum == 0 ? 1 : 0;

		// here we are decrementing each value from array and to check if we have that
		// value or not and decrementing the length of array 

		return countSubsets(arr, n - 1, sum) + countSubsets(arr, n - 1, sum - arr[n - 1]);
	}
}
