package com.userdefinedexception;

public class InvalidAgeException extends Exception {
	
	InvalidAgeException(){
		super("Invalid Age");
	}
	
	InvalidAgeException(String message){
		super(message);
	}

}
