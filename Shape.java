package com.abstractt;

public abstract class Shape {
	
	public double area;
	
	
	//solid method
	public void showArea() {
		System.out.println(" The Area of the shape is " +area);
	}
	
	
	//abstract class
	public abstract  double calArea();
	
	
}
