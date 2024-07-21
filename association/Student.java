package com.association;


//contained class
public class Student {

		//data members
	private int rollno;
	private String name;
	
	//dependency
	private Address address;
	
	//para  construc
		public Student(int rollno, String name, Address address) {
			super();
			this.rollno = rollno;
			this.name = name;
			this.address = address;
		}
		
		//default
		public Student() {
			super();
		}
		

	

	//getter setter
	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	

	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", address=" + address + "]";
	}
	
	
}
