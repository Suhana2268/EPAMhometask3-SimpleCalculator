package com.epam.hometask3;

import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		System.out.println("HELLO THIS IS SIMPLE CALCULATOR");
		double a, b;
		char operator;
		char repeat;
		boolean d = true;
		Scanner sc = new Scanner(System.in);
		System.out.println();
		System.out.println("***You can perform the following operations***");
		System.out.println();
		while(d) {
			System.out.println("Available operations are :");
			System.out.println("\n1. ADDITION (+)\n2. SUBTRACTION (-)\n3. MULTIPLICATION (*)\n4.DIVISION (/)");
			System.out.println();
			System.out.println("Enter the numbers\n");
			a = sc.nextInt();
			b = sc.nextInt();
			System.out.println("Which operation you want to perform?");
			operator = sc.next().charAt(0);
			double result = 0;
			try {
				Operations o = new Operations();
				switch(operator) {
				case '+':
					result = o.addition(a, b);
					System.out.println("The addition of the numbers is: "+ result);
					System.out.println("DO YOU WANT TO PERFORM ANOTHER OPERATION ?(y/n)");
					repeat = sc.next().charAt(0);
					if(repeat == 'y' || repeat == 'Y') {
						d = true;
						break;
					} else {
						d = false;
						System.out.println("Thankyou!");
						break;
					}
				case '-':
					result = o.subtract(a, b);
					System.out.println("The subtraction of the numbers is: "+ result);
					System.out.println("DO YOU WANT TO PERFORM ANOTHER OPERATION ?");
					repeat = sc.next().charAt(0);
					if(repeat == 'y' || repeat == 'Y') {
						d = true;
						break;
					} else {
						d = false;
						System.out.println("Thankyou!");
						break;
					}
				case '*':
					result = o.multiplication(a, b);
					System.out.println("The multiplication of the numbers is: "+ result);
					System.out.println("DO YOU WANT TO PERFORM ANOTHER OPERATION ?");
					repeat = sc.next().charAt(0);
					if(repeat == 'y' || repeat == 'Y') {
						d = true;
						break;
					} else {
						d = false;
						System.out.println("Thankyou!");
						break;
					}
				case '/':
					result = o.division(a, b);
					System.out.println("The division of the numbers is: "+ result);
					System.out.println("DO YOU WANT TO PERFORM ANOTHER OPERATION ?");
					repeat = sc.next().charAt(0);
					if(repeat == 'y' || repeat == 'Y') {
						d = true;
						break;
					} else {
						d = false;
						System.out.println("Thankyou!");
						break;
					}
				}
				
				}
			catch(Exception e) {
				System.out.println("Invalid option!");
			}
		}
	}
}
