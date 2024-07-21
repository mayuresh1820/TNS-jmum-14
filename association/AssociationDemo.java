package com.association;

public class AssociationDemo {

	public static void main(String[] args) {
		Address address = new Address("P&T colony","Dombivili","MH",421201);
		
		Student s1=new Student (2,"Mayuresh",address);
		System.out.println(address);
	}

}
