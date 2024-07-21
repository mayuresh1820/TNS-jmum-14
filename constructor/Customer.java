//Customer entity class

package com.constructor;

public class Customer {
	
	private String name;
	private int id;
	private String city;
	
	//default constructor
	 public Customer(){
		
	}
	 
	 //parameterized constructor
	 public Customer(String name, int id, String city) {
			super();
			this.name = name;
			this.id = id;
			this.city = city;
		}
	//getters and setters
	public String getName() {
		return name;
	}
	

	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}

}
