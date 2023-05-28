package com.java.basic.programs.array;

public class CyclicallyRotateArrayClockWise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 1, 2, 3, 4, 5 };

		int[] arr2 = new int[arr.length];

		int j = 0;

		for (int i = 0; i < arr.length; i++) {

			if (i == 0) {
				arr2[0] = arr[arr.length - 1];
				arr2[1] = arr[0];

			} else if ((j + 1) < arr.length) {
				arr2[j + 1] = arr[i];
			}

			j++;

		}
		
		arr = arr2;
		
		for(int k =0;k<arr.length;k++) {
			
			System.out.print(""+arr[k]+" ");
		}

	}

}
