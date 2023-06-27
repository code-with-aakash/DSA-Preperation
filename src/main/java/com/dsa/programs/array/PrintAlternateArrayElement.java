package com.dsa.programs.array;

public class PrintAlternateArrayElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a = {1,2,3,4};
		
		alternateArray(a);

	}

	private static void alternateArray(int[] a) {
		// TODO Auto-generated method stub
		
		for(int i=0;i<a.length;i=i+2) {
			
//			if(i==0) {
			System.out.print(" "+a[i]);
//			}
//			else  if(i<a.length-1){
//				System.out.print(" "+a[i]);	
//			}
		}
		
	}

}
