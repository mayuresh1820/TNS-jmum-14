package com.abstractt;

public class Square extends Shape {
	
	private float side;
	
	public double calArea() {
		return this.area= side*side;
	}

	public Square(float side) {
		super();
		this.side = side;
	}

}
