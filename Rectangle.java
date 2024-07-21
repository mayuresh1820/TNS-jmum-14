package com.abstractt;

public class Rectangle extends Shape {
	
	private float len;
	private float breadth;
	
	public double calArea() {
		return this.area =len*breadth;
	}

	public Rectangle(float len, float breadth) {
		super();
		this.len = len;
		this.breadth = breadth;
	}

}
