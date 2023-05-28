package com.java.basic.programs.array;

import java.util.Scanner;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("please enter first number");

		double a = sc.nextDouble();

		System.out.println("please enter second number");

		double b = sc.nextDouble();

		System.out.println("please enter operator '+' , '-' ,'/' ,'*' ");

		char operator = sc.next().charAt(0);

		double result;

		switch (operator) {

		case '+':

			result = a + b;
			break;

		case '-':
			result = a - b;
			break;

		case '/':
			result = a / b;
			break;

		case '*':
			result = a * b;
			break;

		default:
			System.out.println("please provide proper operator");

			return;

		}

		System.out.println(" " + a + " " + operator + " " + b + " =" + " " + result);

	}

}
