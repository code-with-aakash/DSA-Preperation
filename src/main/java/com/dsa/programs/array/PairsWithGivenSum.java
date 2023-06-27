package com.dsa.programs.array;

   public class PairsWithGivenSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 1, 1, 1, 1, 1, 2, 2 };

		int k = 2;

		int count = 0;

		for (int i = 0; i < arr.length; i++) {

			

			if ((i + 1) < arr.length-1) {
				
				System.out.println("<==arr[i]==>" + arr[i] + "<==arr[j]==>>" + arr[i + 1] + "<==arr[i]+arr[j]==>>"
						+ (arr[i] + arr[i + 1]));
				
				if (arr[i] + arr[i + 1] == k) {

					count++;
				}
			}

		}

		System.out.println("Count" + count);

	}

}
