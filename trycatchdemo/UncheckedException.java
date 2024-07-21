package com.trycatchdemo;

public class UncheckedException {

	public static void main(String[] args) {
		int x[] ;
				try {
					x=new int[]{1,3,5,6,7,8,9};
System.out.println(x[8]);
				} catch (ArrayIndexOutOfBoundsException e) {
					System.err.println("Trying to access invalid index element.."+e.getMessage());
					e.printStackTrace();
				}//out of the bound
		
		System.out.println("End of the program");
	}

}