package com.methodoveridingdemo;

public class Diamond extends Shape{

private int side;
private int height;
	
	
	public Diamond(int side, int height) {
	super();
	this.side = side;
	this.height = height;
}

	public void draw() {
		
		System.out.println("drawing a Diamond with side and height " + side + height);
	}

		public void erase() {
			System.out.println("Erasing a Diamond with side and height " + side + height);
			
		}
	
}
