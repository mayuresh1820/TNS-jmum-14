package com.trycatchdemo;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MultipleCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("In the main method");
		int x,y,z;
		
		Scanner sc=new Scanner(System.in);
		try {
			System.out.println("Enter first no");
			x=sc.nextInt();
			System.out.println("Enter second no");
			y=sc.nextInt();
			
			z=x/y;
			System.out.println("Result is " + z);
		} catch (ArithmeticException e) {
			// TODO Auto-generated catch block
			System.err.println("Error due to divison by zero" + e.getMessage());
		}
		catch (InputMismatchException ie) {
			// TODO Auto-generated catch block
			System.err.println("Error due to incorrect input" + ie.getMessage());
		}
		catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Exception occured .." + e.getMessage());
		}
		
		
		
	}

}
