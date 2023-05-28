package com.java.basic.programs.array;

import java.util.Arrays;

public class PerfectArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int [] a = {1,2,3,2,1,2};
		
		int[] b = new int[a.length];
		
		int j=0;
		
		for(int i=a.length-1;i>=0;i--) {
			
			b[j]=a[i];
			j++;
			
		}
		
		if(Arrays.equals(a, b)) {
			System.out.println("PERFECT");
		}
		else {
			System.out.println("NOT PERFECT");
		}
		

	}

}
