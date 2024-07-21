package com.methodoveridingdemo;

public class Circle extends Shape {
	
	private int radius;
	
	
	public Circle(int radius) {
		super();
		this.radius = radius;
	}

	public void draw() {
		
		System.out.println("drawing a circle with radius" + radius);
	}

		public void erase() {
			System.out.println("Erasing a circle with radius "+ radius);
			
		}
}
