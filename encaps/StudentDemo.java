//Student Demo class
package com.encaps;

public class StudentDemo {
	
	public static void main(String[] args) {
		Encap s1 =new Encap();
		s1.setName("Mayuresh");
		System.out.println("Name of s1 "+ s1.getName());
		
		s1.setAge(20);
		System.out.println("Age of s1 "+ s1.getAge());
		
		s1.setId(8);
		System.out.println("Id of s1 "+ s1.getId());
	}

}
