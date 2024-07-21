package com.accessmodifiers;

public class MYProfile {
	
	 public String name;
	private int age;
	long mobileno;
	protected String email;
	
	//methods
	public void displayname() {
		System.out.println(name);
		
	}
	
	void getMobileNo() {
		System.out.println(mobileno);
	}
	
	private void showAge() {
		System.out.println(age);
	}
	
	protected void SendEmail()
	{
		System.out.println(email);
	}
	
	public void display() {
		email="myemail@1gmail.com";
		SendEmail();
	}
}
