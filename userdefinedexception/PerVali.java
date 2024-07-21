package com.userdefinedexception;

public class PerVali {
	
	public static void isvaliPer(float per) throws ArithmeticException {
		
		if(per>=60 && per<=100) {
				System.out.println("Valid Percentage");
		}
		else {
			throw new ArithmeticException("Requires more than 60 % ");
			
		}
		
	}

}
