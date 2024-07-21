package com.inheritance;

//child class 
public class Student extends Citizen {
	private int id;
	private String collegename;
	private String branch;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCollegename() {
		return collegename;
	}
	public void setCollegename(String collegename) {
		this.collegename = collegename;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	
	
	//default constructor
	public Student() {
		super();
	}
	
	public void Study() {
		System.out.println("Student studies for exam");
	}
	
	//parameterized
	public Student(String name, String aadharNo, long phNo, String gender, int id, String collegename, String branch) {
		super(name, aadharNo, phNo, gender);
		this.id = id;
		this.collegename = collegename;
		this.branch = branch;
	}
	
	
//	@Override
//	public String toString() {
//		return "Student [id=" + id + ", collegename=" + collegename + ", branch=" + branch + ", getName()=" + getName()
//				+ ", getAadharNo()=" + getAadharNo() + ", getPhNo()=" + getPhNo() + ", getGender()=" + getGender()
//				+ "]";
//	}
	
	
	
	
	
}
