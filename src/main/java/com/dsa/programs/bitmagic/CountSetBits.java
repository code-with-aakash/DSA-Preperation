package com.dsa.programs.bitmagic;

public class CountSetBits {

	static int[] tbl = new int[256];

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 256;

//		int countsetbits = countBits(n);

		int countsetbits = brianKeringamAlgo(n);

		System.out.println(countsetbits);

	}

	static int brianKeringamAlgo(int n) {

		int res = 0;
		while (n > 0) {
			n = n & (n - 1);
			res++;

		}

		return res;

	}

	// Lookup table approach
	/*
	 * in this approach we mark all elements of table as 1 and we take and of n and
	 * tbl so that the only bits with 1 is returned
	 */
	
	  static int countBits(int n) {
	  
	  
	  tbl[0] = 0;
	  
	  for (int i = 1; i < tbl.length; i++) {
	  
	  tbl[i] = tbl[i & (i - 1)] + 1; }
	  
	  return tbl[n & 255] + tbl[(n >> 8) & 255] + tbl[(n >> 16) & 255] + tbl[(n >>
	  24)]; }
	 
}
