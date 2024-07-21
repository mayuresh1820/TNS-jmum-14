package com.userdefinedexception;

public class AgeVali {
	
	public static void isValiAge(int age) throws InvalidAgeException {
		
		if(age>=18) {
			System.out.println("Eligible for voting");
			
		}else {
			
			throw new InvalidAgeException("You are not eligible for voting");
			
		}
	}

}
