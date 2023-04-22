package com.dsa.programs.recursion.assignment;

public class NumberOfStepToReduceNo {

	public static void main(String[] args) {
		int num = 123;

//		Step 1) 8 is even; divide by 2 and obtain 4. 
//		Step 2) 4 is even; divide by 2 and obtain 2. 
//		Step 3) 2 is even; divide by 2 and obtain 1. 
//		Step 4) 1 is odd; subtract 1 and obtain 0.

		int step = 1;

		step = NoOfStep(num, step);

		System.out.println(step);

	}

	private static int NoOfStep(int num, int step) {

		if (num == 0) {
			return 0;
		}

		if (num % 2 == 0) {
			num = num / 2;

		} else {
			num = num - 1;

		}

		return step + NoOfStep(num, step);

	}

}
