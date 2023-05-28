package com.java.basic.programs.array;

import java.util.ArrayList;

public class SecondMaximumValueInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 22, 4, 5, 12, 23, 43, 11, 10 };

		printArray(arr);

		int min = SecondMaximumValue(arr);

		System.out.println("Second Maximum value in array is " + min);

	}

	private static int SecondMaximumValue(int[] arr) {
		// TODO Auto-generated method stub

		int max = 0;



		int max2 = 0;

		for (int j : arr) {

			if (j > max) {
				max2 = max;
				max = j;

			} else if (j > max2 && j != max) {

				max2 = j;

			}
		}

		return max2;
	}

	private static void printArray(int[] arr) {
		// TODO Auto-generated method stub

		for (int j : arr) {
			System.out.print(" " + j);
		}
		System.out.println();

	}

}
