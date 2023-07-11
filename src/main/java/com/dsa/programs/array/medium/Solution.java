package com.dsa.programs.array.medium;

class Solution {
	
	public static void main(String[] args) {
		
		int[] arr = {100,1,100,10};
		System.out.println(rob(arr));
	}
	public static  int rob(int[] nums) {
		
		
		
		int prev1 = 0;
		int prev2 = 0;

		for ( int num : nums) {
			 int dp = Math.max(prev1, prev2 + num);
			prev2 = prev1;
			prev1 = dp;
		}

		return prev1;
	}
}