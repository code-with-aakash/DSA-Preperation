package com.dsa.programs.array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class DuplicateInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 1 ,2,3,4,5,4,3,2};

		Map<Integer, Integer> map = new HashMap<Integer, Integer>();

		for (int i = 0; i < arr.length; i++) {

			int count = 0;
			if (map.containsKey(arr[i])) {
				map.put(arr[i], map.get(arr[i]) + 1);

			}

			else {
				map.put(arr[i], count + 1);
			}

		}

		ArrayList<Integer> araylist = new ArrayList<Integer>();

		for (Entry<Integer, Integer> entry : map.entrySet()) {

			if (entry.getValue() > 1) {

				araylist.add(entry.getKey());

			}

		}

		if (araylist.size() < 1) {

			araylist.add(-1);
		} else {

			System.out.println(araylist.toString());
		}

	}

}
