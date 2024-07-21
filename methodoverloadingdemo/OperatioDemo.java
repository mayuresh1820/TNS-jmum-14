package com.methodoverloadingdemo;

public class OperatioDemo {

	public static void main(String[] args) {
		
		boolean status = Operations.isPalindrome(121);
		System.out.println(status);
		
		status = Operations.isPalindrome(1211);
		System.out.println(status);
		
		status = Operations.isPalindrome("eye");
		System.out.println(status);

		status = Operations.isPalindrome("car");
		System.out.println(status);
	}

}
