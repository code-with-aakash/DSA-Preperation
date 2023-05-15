package com.dsa.programs.linkedlist;

public class HappyNumber {

	public static void main(String[] args) {

		int n = 19;
		System.out.println(isHappy(n));

	}

	public static boolean isHappy(int n) {

		int slow = n;
		int fast = n;

		do {

			slow = square(slow);
			fast = square(square(fast));

		} while (slow != fast);

//		if (slow == 1) {
//			return true;
//		}

		return false;
	}

	public static int square(int n) {
		int ans = 0;
		while (n > 0) {

			int num = n % 10;
			ans = ans + num * num;
			n = n / 10;
		}
		return ans;

	}

}
