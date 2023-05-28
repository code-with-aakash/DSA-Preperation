package com.java.basic.programs.array;

public class HowToPrintArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		printarray(new int[] { 1, 2, 3, 4, 5 });

	}

	private static void printarray(int[] arr) {
		// TODO Auto-generated method stub
		for (int j : arr) {
			System.out.print(" " + j);
		}

	}

}
