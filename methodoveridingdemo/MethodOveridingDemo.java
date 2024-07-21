package com.methodoveridingdemo;

public class MethodOveridingDemo {

	public static void main(String[] args) {
		Shape[] shape = new Shape[3];
		shape[0] = new Circle(7);
		shape[1] = new Square(5);
		shape[2] = new Diamond(3,9);
		
		for(Shape s:shape)//traversing the Shape arr 
		{
			s.draw();
			s.erase();
		}
		
	}

}
