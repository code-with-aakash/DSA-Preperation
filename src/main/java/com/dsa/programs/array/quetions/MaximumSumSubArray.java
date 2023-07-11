package com.dsa.programs.array.quetions;

public class MaximumSumSubArray {

	public static void main(String[] args) {

		int[] arr = { -3, 8, -2, 4, -5, 6 };

		int max_so_far = Integer.MIN_VALUE, max_ending_here = 0, start = 0, end = 0, s = 0;

		for (int i = 0; i < arr.length; i++) {
			max_ending_here += arr[i];

			if (max_so_far < max_ending_here) {
				max_so_far = max_ending_here;
				start = s;
				end = i;
			}

			if (max_ending_here < 0) {
				max_ending_here = 0;
				s = i + 1;
			}
		}
		System.out.println("Maximum contiguous sum is " + max_so_far);
		System.out.println("Starting index " + start);
		System.out.println("Ending index " + end);
	}
}
