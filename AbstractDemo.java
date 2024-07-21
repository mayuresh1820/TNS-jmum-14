package com.abstractt;

public class AbstractDemo {

	public static void main(String[] args) {
		
		Shape s;
		
		s=new Circle(7);
		s.calArea();
		s.showArea();
		
		s=new Square(5);
		s.calArea();
		s.showArea();
		
		s=new Rectangle(8,7);
		s.calArea();
		s.showArea();
		

	}

}
