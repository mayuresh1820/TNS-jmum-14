//to demo static method and static block
package com.staticmethod;

public class Classroom {

		private int section;
		
		private static int srNo;
		
		static {
			System.out.println("in static block");
			srNo=10;
		}

		public Classroom() {
			System.out.println("inside the constructor");
			section++;
			srNo++;
		}

		@Override
		public String toString() {
			return "Classroom [section=" + section + ",srNo= " + srNo +"]";
		}

		public static void display() {
			System.out.println("Sr no is " + srNo);
		}
		
		public void show() {
			System.out.println("Sr no is " + srNo);
		}
	
}
