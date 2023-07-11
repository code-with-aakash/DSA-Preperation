package com.dsa.programs;// Java example to create a Java HashMap
// of user-defined class type

import java.util.*;
import java.io.*;

// User defined class
public class CustomKeyObject {

	public static class Student {

		private int rollno;
		private String name;

		// Constructor
		public Student(int rollno, String name)
		{
			this.rollno = rollno;
			this.name = name;
		}

		public String getname()
		{
			return this.name;
		}

		public int getmarks()
		{
			return this.rollno;
		}

		public void setname(String name)
		{
			this.name = name;
		}

		public void setmarks(int rollno)
		{
			this.rollno = rollno;
		}

		// Overriding the hashcode() function
		@Override
		public int hashCode()
		{

			// uses roll no to verify the uniqueness
			// of the object of Student class

			final int temp = 14;
			int ans = 1;
			ans = temp * ans + rollno;
			return ans;
		}

		// Equal objects must produce the same
		// hash code as long as they are equal
		@Override
		public boolean equals(Object o)
		{
			if (this == o) {
				return true;
			}
			if (o == null) {
				return false;
			}
			if (this.getClass() != o.getClass()) {
				return false;
			}
			Student other = (Student)o;
			if (this.rollno != other.rollno) {
				return false;
			}
			return true;
		}
	}

	// main method
	public static void main(String[] args)
		throws NumberFormatException,
			IOException
	{
		HashMap<Student, String> map = new HashMap<>();

		Student one = new Student(1, "Geeks1"); // key1

		Student two = new Student(2, "Geeks2"); // key2

		// put keys in map
		map.put(one, one.getname());
		map.put(two, two.getname());

		// changing key state so that
		// hashcode() should be calculated again
		one.setname("Not Geeks1");
		two.setname("Not Geeks2");

		// still prints Geeks1
		System.out.println(map.get(one));

		// still prints Geeks1
		System.out.println(map.get(two));

		// try with newly created key with same Rollno
		Student three = new Student(1, "Geeks3");


		// we get Geeks1
		System.out.println(map.get(three));
	}

	// This code is contributed by Subhesh
}
