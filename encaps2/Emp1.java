package com.encaps2;

//import com.encaps.Encap;

public class Emp1 {
	public static void main(String[] args) {
		Emp s1 =new Emp();
		s1.setEmp_name("Mayuresh");
		System.out.println("Name of Employee "+ s1.getEmp_name());
		
		s1.setAge(20);
		System.out.println("Age of Employee "+ s1.getAge());
		
		s1.setSalary(80000);
		System.out.println("Salary of Employee "+ s1.getSalary());
	}
	

}
