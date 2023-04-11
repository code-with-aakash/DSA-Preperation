package com.dsa.programs.maths;

import java.util.ArrayList;

public class QuadreticRoot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=752,b=904,c=164;
		double d = b*b-4*a*c;
		double e = Math.sqrt(d);
		
		 int x =  (int) ((-b +Math.sqrt(d))/ (2*a));
		 
		 int  y =  (int) ((-b - Math.sqrt(d))/ (2*a));
		 
		 System.out.println("entry is "+x+" entry is "+y);
	        
	        ArrayList<Integer> arr = new ArrayList<>();
	        
	        arr.add(x);
	        arr.add(y);
	}

}
