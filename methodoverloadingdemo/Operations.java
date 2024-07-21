package com.methodoverloadingdemo;

public class Operations {
	
	
	//method 1
	public static boolean isPalindrome(int num) {
		int rev=0;
		int temp=num;
		while(num!=0) {
			rev=rev*10+num%10;
			num/=10;
		}
		return temp==rev;
	}
	
	public static boolean isPalindrome(String name) {
		 String rev;
		rev= new StringBuffer(name).reverse().toString();
		 return name.equals(rev);
	}

}
