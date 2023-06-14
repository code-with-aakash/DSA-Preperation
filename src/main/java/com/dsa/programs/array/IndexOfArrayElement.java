package com.dsa.programs.array;

public class IndexOfArrayElement {

	public static void main(String[] args) {



		int[] a = { 1, 2, 3, 4, 5, 6 ,5,4,5};
		int key = 5;

		OccurenceOfElement(a, key);

	}

	private static void OccurenceOfElement(int[] a, int key) {
		

		int[] count = new int[a.length];

		for (int i = 0; i < a.length; i++) {

			if (key == a[i]) {

				count[i] = i;

			}

		}

		for (int i = 0; i < a.length; i++) {
			if (count[i] != 0) {
				System.out.println(count[i]);
			}
		}

	}

}
