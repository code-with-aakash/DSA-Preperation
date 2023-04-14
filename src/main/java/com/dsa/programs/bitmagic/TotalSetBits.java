package com.dsa.programs.bitmagic;

public class TotalSetBits {

	public static void main(String[] args) {

		int n = 17;
		int countsetbits = 0;

		

		System.out.println(countsetbits);

	}

	int countpower(int n)

	{
		int x = 0;

		while ((pow(2, x)) <= n) {

			x++;
		}

		return x - 1;
	}

	int countSetBits(int n)

	{
		if (n == 0) {

			return 0;
		}

		int x = countpower(n);

		int x1 = x * (pow(2, x - 1));// x*(1<<(x-1));

		int x2 = (n - pow(2, x) + 1);// n-(1<<x)+1;

		int rest = n - pow(2, x);// n-(1<<x);

		int ans = x1 + x2 + countSetBits(rest);

		return ans;
	}

	private int pow(int x, int n) {

		if (n == 0) {
			return 1;
		}

		int pw = pow(x, n / 2);

		pw = pw * pw;

		if (n % 2 == 0) {

			return pw;
		} else
			return pw * x;

	}

}
