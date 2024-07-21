package com.methodoveridingdemo;

public class Square extends Shape {
	
private int side;
	
	
	public Square(int side) {
	super();
	this.side = side;
}

	public void draw() {
		
		System.out.println("drawing a square with side" + side);
	}

		public void erase() {
			System.out.println("Erasing a square with side "+ side);
			
		}

}
