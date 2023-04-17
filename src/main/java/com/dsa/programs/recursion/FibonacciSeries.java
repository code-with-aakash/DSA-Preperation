package com.dsa.programs.recursion;

public class FibonacciSeries {

	public static void main(String[] args) {

		
		int n =5 ;
		int x = fibonacci(n);
		
		System.out.println(x);
		
	}

	private static int fibonacci(int n) {
		
		if(n==1 || n==2)
			return 1;

		return fibonacci(n-1) + fibonacci(n-2);
	}

}
