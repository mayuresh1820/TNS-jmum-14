package com.accessmodifiers;

public class MyProExecu {

	public static void main(String[] args) {
		MYProfile p=new MYProfile();
		 p.name="Mayuresh";
		 p.displayname();
		 
		 
		 //private members are not visible
//		 p.age=23;
//		 p.showAge();
//default
		 p.mobileno=969696969;
		 p.getMobileNo();
	//protected	 
	 p.email="myemail@1gmail.com";
		 p.SendEmail();
		 
		 
	}

}
