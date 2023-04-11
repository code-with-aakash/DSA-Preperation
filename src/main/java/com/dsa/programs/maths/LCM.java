package com.dsa.programs.maths;

public class LCM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int l = 4, m = 6;

		int lcm = (l * m) / gcd(l, m);

		System.out.println("lcm is " + lcm);

	}

	static int gcd(int a, int b) {

		if (b == 0)
			return a;

		else
			return gcd(b, a % b);
	}

}
