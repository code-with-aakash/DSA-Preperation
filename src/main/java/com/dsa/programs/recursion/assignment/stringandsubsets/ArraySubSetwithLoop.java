package com.dsa.programs.recursion.assignment.stringandsubsets;

import java.util.ArrayList;
import java.util.List;

public class ArraySubSetwithLoop {

	public static void main(String[] args) {

		int a[] = { 1, 2, 3 };

		System.out.println(subset(a));

	}

	private static List<ArrayList<Integer>> subset(int[] a) {

		List<ArrayList<Integer>> outerlist = new ArrayList<>();

		// first empty list created
		outerlist.add(new ArrayList<Integer>());

		// here we run loop for array to accept or reject the value
		for (int num : a) {

			// here we have take the size of the outer list and size of same inner list will
			// be created and both will be merged at the end
			int n = outerlist.size();

			for (int i = 0; i < n; i++) {

				// here we create the size of the inner list with outer list including its
				// element now we run inner loop and we either accept or reject the element but
				// here we accept only the elements and add that in outer loop list
				ArrayList<Integer> internal = new ArrayList<>(outerlist.get(i));
				internal.add(num);
				outerlist.add(internal);
			}

		}

		return outerlist;

	}

}
