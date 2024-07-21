package com.trycatchdemo;

public class NestedTryCatch {
	
	public static int divide(int x,int y) {
		int z=0;
		z=x/y;
//System.out.println(z);
		return z;
	}
	
	public static void main(String[] args) {
		divide(45,0);
	}
}
