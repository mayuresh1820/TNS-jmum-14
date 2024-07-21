package com.finaldemo;

public class FinalVariable {
	
	final int x=20;//final var should be initialized at time of declaration
	
	final static int y;
	final static int z=56;
	
	static{//is executed before main method
		System.out.println("x is in static blocks");
		y=67;
	}
	
	
	
	//instance method
	
	void change() {
		x=34;//cannot reassign val to final var
		y=23;//static block is req to init unassigned static var
		z=56;
		
	}
	
	static void show() {
//		System.out.println("x is"+ x);//non static field cannot be called inside static method
		System.out.println("y is" + y);
		System.out.println("z is" + z);
	}


}
