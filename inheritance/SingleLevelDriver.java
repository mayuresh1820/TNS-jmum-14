package com.inheritance;

public class SingleLevelDriver {

	public static void main(String[] args) {
		Student s1=new Student("Mayuresh","1234 5678 9011",123456,"Male",12,"watumul","Computer");
		System.out.println(s1);
		s1.Study();
		s1.payTax();
	}

}
