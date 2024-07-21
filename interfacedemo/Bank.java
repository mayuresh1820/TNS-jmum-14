package com.interfacedemo;

public interface Bank {
	
	//static and final data members
	double min_balance =1000;
	double deposit_limit = 25000;
	
	void deposit(Account account,double amount);
	void withdraw(Account account,double amount);
	

}
